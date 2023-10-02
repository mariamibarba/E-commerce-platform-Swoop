package Steps;

import Pages.HomePage;
import io.qameta.allure.Step;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Step
    public HomePageSteps clickOnRest (){
        homePage.getRest().click();
        return this;
    }



}