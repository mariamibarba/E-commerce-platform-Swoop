package Steps;

import Pages.SushiFirstElementPage;
import io.qameta.allure.Step;

public class SushiFirstElementPageSteps {
    SushiFirstElementPage sushiFirstElementPage =new SushiFirstElementPage();


    @Step
    public SushiFirstElementPageSteps sharing() {
        sushiFirstElementPage.shareButton.click();
        return this;
    }
}
