package Steps;

import Pages.HomePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class HomePageSteps {
    HomePage homePage = new HomePage();




    @Step
    public HomePageSteps clickOnRest (){
        homePage.dasveneba.click();
        return this;
    }



}