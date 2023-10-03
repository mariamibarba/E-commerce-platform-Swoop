package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class KvebaPage {

    public SelenideElement kveba = $(By.linkText("კვება"));

    public SelenideElement getKveba(){
        return kveba;
    }


}
