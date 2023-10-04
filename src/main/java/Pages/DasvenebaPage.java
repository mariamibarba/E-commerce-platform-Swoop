package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DasvenebaPage {

    public SelenideElement minPrice = $(".clearfix").$("#minprice");
    public SelenideElement maxPrice = $(".clearfix").$("#maxprice");
    public SelenideElement searchButton = $(".clearfix").$(".submit-button");
    public ElementsCollection prices = $$(By.xpath("//div[@class= 'discounted-prices']//p[1]"));



}