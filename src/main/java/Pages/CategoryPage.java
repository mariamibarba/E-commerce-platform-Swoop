package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {
    public SelenideElement categories =$(".categoriesTitle");
    public SelenideElement kveba = $(By.linkText("კვება"));

    public SelenideElement sushi = $(By.linkText("სუში"));
}
