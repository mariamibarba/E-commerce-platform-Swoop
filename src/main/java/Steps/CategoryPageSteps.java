package Steps;

import Pages.CategoryPage;
import io.qameta.allure.Step;

public class CategoryPageSteps {
    CategoryPage categoryPage = new CategoryPage();

    @Step("click category button" )
    public CategoryPageSteps goToCategory(){
        categoryPage.categories.hover().click();
        return this;
    }

    @Step("hover kveba button" )
    public CategoryPageSteps goTokveba(){
        categoryPage.kveba.hover();
        return this;
    }
    @Step("click sushi" )
    public CategoryPageSteps goToSushi(){
        categoryPage.sushi.click();
        return this;
    }

}
