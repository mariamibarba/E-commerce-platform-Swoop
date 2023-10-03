import Pages.SushiPage;
import Steps.CategoryPageSteps;
import Steps.KvebaPageSteps;
import Steps.SushiFirstElementPageSteps;
import Steps.SushiPageSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Test2 extends ConfigTest{
    KvebaPageSteps kvebaPageSteps = new KvebaPageSteps();
    CategoryPageSteps categoryPageSteps = new CategoryPageSteps();
    SushiPageSteps sushiPageSteps = new SushiPageSteps();
    SushiPage sushiPage = new SushiPage();
    SushiFirstElementPageSteps sushiFirstElementPageSteps = new SushiFirstElementPageSteps();
    @Test
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
    @Test
    public void thirdTest(){
        categoryPageSteps
                .goToCategory()
                .goTokveba()
                .goToSushi();



        sushiPageSteps
                .clickSorting()
                .decreasing()
                .checkingDecreasingSort();


    }

    @Test
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


}
