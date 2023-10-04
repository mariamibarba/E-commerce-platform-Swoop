package Steps;

import Pages.HomePage;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    @Step("Click dasveneba")
    public HomePageSteps clickOnRest (){
        homePage.dasveneba.click();
        return this;
    }
//    @Step
//    public HomePageSteps openRegistrationForm(){
//        homePage.openregistrationForm.click();
//        return this;
//    }
//    @Step
//    public HomePageSteps registrationBtnClick(){
//        homePage.registrationBtn.click();
//        return this;
//    }



}