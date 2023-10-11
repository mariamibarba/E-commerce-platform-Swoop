package Steps;

import Pages.SushiPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.switchTo;


public class SushiPageSteps {

    SushiPage sushiPage = new SushiPage();
    SoftAssert softAssert = new SoftAssert();


    @Step
    public SushiPageSteps firstElement() {
        sushiPage.firstFavProduct.click();
        return this;
    }

    @Step
    public SushiPageSteps loginAssert() {
        sushiPage.loginPage.shouldBe(Condition.visible);
        return this;
    }

    @Step
    public SushiPageSteps closingLoginForm() {
        sushiPage.closeButton.click();
        return this;
    }

    @Step("check of sold charts")
    public SushiPageSteps checkingSoldCharts() {

        String soldText = sushiPage.soldAmount.get(0).getText();
        String parseSoldText = soldText.replace("გაყიდულია ", "");
        int value = Integer.parseInt(parseSoldText);

        String diagram = Objects.requireNonNull(sushiPage.soldDiagram.get(0).getAttribute("data-width"))
                .replace("%", "");

        int diagramPercentage = Integer.parseInt(diagram) / 100;

        int total = 0;
        if (value != 0 && diagramPercentage < 1) {
            total = value / diagramPercentage;
            int currentValue = total * diagramPercentage;
            softAssert.assertEquals(value, currentValue);
        } else if (diagramPercentage == 100) {
            System.out.println("All sold out");
            softAssert.fail();
        } else {
            System.out.println("Nothing is sold");
        }

        softAssert.assertAll();
        return this;
    }

    @Step("Click sorting button")
    public SushiPageSteps clickSorting() {
        sushiPage.sort.click();
        return this;
    }

    @Step("decreasing")
    public SushiPageSteps decreasing() {
        sushiPage.decreasingPrice.click();
        return this;
    }

    @Step("Check decreasing result ")
    public SushiPageSteps checkingDecreasingSort() {

        String firstSushi = sushiPage.sushiPrices.get(0).getText().replace("₾", "");
        String secondSushi = sushiPage.sushiPrices.get(1).getText().replace("₾", "");

        int firstSushiPrice = Integer.parseInt(firstSushi);
        int secondSushiPrice = Integer.parseInt(secondSushi);

        softAssert.assertEquals(true, firstSushiPrice > secondSushiPrice);
        softAssert.assertAll();
        return this;

    }

    @Step("Click Sushi")
    public SushiPageSteps clickingSushi() {
        sushiPage.firstelement.click();
        return this;
    }



}
