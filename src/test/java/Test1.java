import Data.PriceData;
import Pages.DasvenebaPage;
import Steps.DasvenebaPageSteps;
import Steps.HomePageSteps;
import Steps.KvebaPageSteps;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Test1 extends ConfigTest {


    HomePageSteps homePageSteps = new HomePageSteps();
    DasvenebaPageSteps dasvenebaPageSteps = new DasvenebaPageSteps();
    PriceData priceData = new PriceData();
    DasvenebaPage dasvenebaPage = new DasvenebaPage();
    SoftAssert softAssert = new SoftAssert();

    KvebaPageSteps kvebaPageSteps = new KvebaPageSteps();
    ;
    @Test
    public void firstTest() {
        Configuration.assertionMode = AssertionMode.SOFT;

        homePageSteps.clickOnRest();

        dasvenebaPageSteps
                .setMinPrice()
                .setMaxPrice()
                .clickOnSearch();


        ElementsCollection allPrices = dasvenebaPage.getPrices();
        for (SelenideElement item : allPrices) {
            String items = item.getText();
            String sub = items.substring(0, items.length() - 1);
            int price = Integer.parseInt(sub);
            softAssert.assertTrue(priceData.getMinPrice() < price);
            softAssert.assertTrue(price < priceData.getMaxPrice());


            softAssert.assertAll();


        }

    }
}