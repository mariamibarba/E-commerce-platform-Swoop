package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SushiPage {
    public SelenideElement firstProduct = $$(byXpath("//section[@class='container deal-container category-offers ']")).first();
    public SelenideElement firstFavProduct = firstProduct.$(byClassName("deal-box-wishlist"));
    public SelenideElement loginPage = $(".login");
    public SelenideElement closeButton = $("div[class='close-button'] a");

    public SelenideElement sort = $("#sort");
    public SelenideElement decreasingPrice = $(byXpath("//option[contains(text(),'ფასით კლებადი')]"));

    public SelenideElement firstelement = $(By.xpath("//*[@id=\"partialid\"]/section/div[1]/div[1]/a/img"));


    public List<SelenideElement> soldAmount = $$(By.xpath("//p[contains(text(), 'გაყიდულია')]"));
    public List<SelenideElement> soldDiagram = $$(By.xpath("//div[@class = 'voucher-diagram']//div"));
    public List<SelenideElement> sushiPrices = $$("div.discounted-prices p:first-child");
}
