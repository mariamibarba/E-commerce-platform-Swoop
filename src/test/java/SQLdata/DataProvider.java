package SQLdata;

import Util.MySQLJDBCUtil;

import java.sql.*;
public class DataProvider {
    @org.testng.annotations.DataProvider(name = "DB")
    public Object[][] dataProvider() throws SQLException {
        String dbdata[][] = getValuesFromSQL();
        return dbdata;
    }

    public String[][] getValuesFromSQL() throws SQLException {

        String sql = "select firstName, lastName, phone, email, dateOfBirth, password from [users].[dbo].[users]";
        Connection conn = MySQLJDBCUtil.getConnection();
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql);
        rs.last();
        int rows = rs.getRow();
        ResultSetMetaData meeta = rs.getMetaData();
        int cols = meeta.getColumnCount();
        String data[][] = new String[rows][cols];

        int i = 0;
        rs.beforeFirst();
        while (rs.next()) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = rs.getString(j + 1);

            }
            i++;

        }
        return data;
    }
}
