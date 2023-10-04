import Data.PriceData;
import Pages.DasvenebaPage;
import Pages.RegistrationPage;
import Pages.SushiPage;
import SQLdata.DataProvider;
import Steps.*;
import Util.DB;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Epic("swoop.ge- ის გატესტვა სხვადასხვა კრიტერიუმების მიხედვით")
@Feature("dasveneba and kveba pages")
public class Test1 extends ConfigTest {
    HomePageSteps homePageSteps = new HomePageSteps();
    DasvenebaPageSteps dasvenebaPageSteps = new DasvenebaPageSteps();
    PriceData priceData = new PriceData();
    DasvenebaPage dasvenebaPage = new DasvenebaPage();
    SoftAssert softAssert = new SoftAssert();
    CategoryPageSteps categoryPageSteps = new CategoryPageSteps();
    SushiPageSteps sushiPageSteps = new SushiPageSteps();
    SushiPage sushiPage = new SushiPage();
    SushiFirstElementPageSteps sushiFirstElementPageSteps = new SushiFirstElementPageSteps();
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();
    RegistrationPage registrationPage = new RegistrationPage();

    DB db = new DB();



    @Test(description = "first-method-test", groups = "Regression1")
    @Feature("Go to „დასვენება“ and check element price range from 200 to 230")
    @Description("resting dasveneba page and prices also cjeck it")
    public void firstTest() {
        Configuration.assertionMode = AssertionMode.SOFT;

        homePageSteps.clickOnRest();

        dasvenebaPageSteps
                .setMinPrice()
                .setMaxPrice()
                .clickOnSearch();


        ElementsCollection allPrices = dasvenebaPage.prices;
        for (SelenideElement item : allPrices) {
            String items = item.getText();
            String sub = items.substring(0, items.length() - 1);
            int price = Integer.parseInt(sub);

            softAssert.assertTrue(priceData.getMinPrice() < price);
            softAssert.assertTrue(price < priceData.getMaxPrice());


            softAssert.assertAll();


        }

    }


//    test2222222222222222

    @Test(description = "second-method-test", groups = "Regression1")
    @Feature("Checking login adns sold chart")
    @Story("check sold charts test")
    @Description("in this test we are going to sushi page and add first product in favourite section ")
    public void secondTest(){
        categoryPageSteps
                .goToCategory()
                .goTokveba()
                .goToSushi();

        sushiPageSteps
                .firstElement()
//                .loginAssert()
                .closingLoginForm()
                .checkingSoldCharts();


    }
    @Test(description = "third-method-test", groups = "Regression2")
    @Feature("sorting prices and checking decreasing sort")
    @Description("go to sushi page amd clic sort by decreasind and also checking if it works")
    public void thirdTest() {
        categoryPageSteps
                .goToCategory()
                .goTokveba()
                .goToSushi();


        sushiPageSteps
                .clickSorting()
                .decreasing()
                .checkingDecreasingSort();
    }

    @Test(description = "forth-method-test", groups = "Regression2")
    @Story("checkking first element page share function")
    @Feature("go to first sushi page element and try to share it in facebook")
    @Description("go to sushi page and click first return element thenclick share button and check if it share it in facebook")
    public void forthTest(){
        categoryPageSteps
                .goToCategory()
                .goTokveba()
                .goToSushi();
        sushiPageSteps
                .clickingSushi();

        sushiFirstElementPageSteps
                .sharing();


    }

    @Test(testName = "fifth-method-test DB test", groups = "Resgression2", dataProvider = "DB", dataProviderClass = DataProvider.class)
    @Story("fill registration forms with information which we have in database")
    @Description("fill the form with dataprovider")
    public void testThree(String firstname, String lastName, String phone, String email, String date, String password) {
        registrationPageSteps.clickOnopenRegisterform();
        registrationPageSteps.clickOnRegister()
                .setFirstName(firstname)
                .setLastName(lastName)
                .setMobile(phone)
                .setEmail(email)
                .setDate(date)
                .setPassword(password)
                .confirmPassword(password)
                .checkTerms()
                .registerNewAccount();

    }






}


