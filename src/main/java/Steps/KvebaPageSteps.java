package Steps;

import Pages.KvebaPage;
import io.qameta.allure.Step;

public class KvebaPageSteps {
    KvebaPage kvebaPage = new KvebaPage();

    @Step
    public KvebaPageSteps clickonKveba(){
        kvebaPage.getKveba().click();
        return this;
    }
}
