package Steps;

import Data.PriceData;
import Pages.DasvenebaPage;
import Pages.HomePage;
import io.qameta.allure.Step;

public class DasvenebaPageSteps {

    PriceData priceData = new PriceData();
    DasvenebaPage dasvenebaPage = new DasvenebaPage();


    @Step
    public DasvenebaPageSteps setMinPrice(){
        dasvenebaPage.getMinPrice().sendKeys(String.valueOf(priceData.getMinPrice()));

        return this;

    }
    @Step
    public DasvenebaPageSteps setMaxPrice(){
        dasvenebaPage.getMaxPrice().sendKeys(String.valueOf(priceData.getMaxPrice()));
        return this;

    }
    @Step
    public DasvenebaPageSteps clickOnSearch (){
        dasvenebaPage.getSearchButton().click();
        return this;


    }
}