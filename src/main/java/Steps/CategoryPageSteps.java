package Steps;

import Pages.CategoryPage;
import io.qameta.allure.Step;

public class CategoryPageSteps {
    CategoryPage categoryPage = new CategoryPage();

    @Step
    public CategoryPageSteps goToCategory(){
        categoryPage.categories.hover().click();
        return this;
    }

    @Step
    public CategoryPageSteps goTokveba(){
        categoryPage.kveba.hover();
        return this;
    }
    @Step
    public CategoryPageSteps goToSushi(){
        categoryPage.sushi.click();
        return this;
    }

}
