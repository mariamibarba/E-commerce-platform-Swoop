package Steps;

import Data.PriceData;
import Pages.DasvenebaPage;
import Pages.HomePage;
import io.qameta.allure.Step;

public class DasvenebaPageSteps {

    PriceData priceData = new PriceData();
    DasvenebaPage dasvenebaPage = new DasvenebaPage();

    @Step("Min price")

    public DasvenebaPageSteps setMinPrice(){
        dasvenebaPage.minPrice.sendKeys(String.valueOf(priceData.getMinPrice()));

        return this;

    }
    @Step("Max price")
    public DasvenebaPageSteps setMaxPrice(){
        dasvenebaPage.maxPrice.sendKeys(String.valueOf(priceData.getMaxPrice()));
        return this;

    }
    @Step("click search button")
    public DasvenebaPageSteps clickOnSearch (){
        dasvenebaPage.searchButton.click();
        return this;


    }
}