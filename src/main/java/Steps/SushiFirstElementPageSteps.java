package Steps;

import Pages.SushiFirstElementPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.switchTo;

public class SushiFirstElementPageSteps {
    SushiFirstElementPage sushiFirstElementPage =new SushiFirstElementPage();

    @Step("Click share and check facebook login form")
    public SushiFirstElementPageSteps sharing() {
        sushiFirstElementPage.shareButton.click();
        switchTo().window("Facebook");
        sushiFirstElementPage.facebookLoginForm.shouldBe(Condition.visible);
        closeWindow();
        return this;
    }

}
