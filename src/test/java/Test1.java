import Data.PriceData;
import Pages.DasvenebaPage;
import Steps.DasvenebaPageSteps;
import Steps.HomePageSteps;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.open;

public class Test1 extends ConfigTest {

    HomePageSteps homePageSteps = new HomePageSteps();
    DasvenebaPageSteps dasvenebaPageSteps = new DasvenebaPageSteps();
    PriceData priceData = new PriceData();
    DasvenebaPage dasvenebaPage = new DasvenebaPage();
    SoftAssert softAssert = new SoftAssert();
    ;
    @Test
    public void firstTest(){
        open("https://swoop.ge");
        homePageSteps.clickOnRest();

        dasvenebaPageSteps
                .setMinPrice()
                .setMaxPrice()
                .clickOnSearch();


        ElementsCollection allPrices = dasvenebaPage.getPrices();




    }
}