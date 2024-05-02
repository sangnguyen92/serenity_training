package serenity.v2.defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import serenity.v2.steps.FahasaShopSteps;

public class TestFahasaShopDefs {
    @Steps
    FahasaShopSteps fahasaShopSteps;

    @Given("I am on the webshop home page")
    public void iAmOnTheWebshopHomePage() {
        fahasaShopSteps.access_fahasa_homepage();

    }

    @When("I search with keyword {string}")
    public void iSearchWithKeyword(String keyword) {
        fahasaShopSteps.search_for_keyword(keyword);
        fahasaShopSteps.click_search_btn();

    }

    @When("I select the first product")
    public void iSelectTheFirstProduct() {
        fahasaShopSteps.access_item();

    }


    @When("I add this product into Cart")
    public void iAddThisProductIntoCart() {
        fahasaShopSteps.add_to_cart();
        
    }

    @And("I access the cart")
    public void iAccessTheCart() {
        fahasaShopSteps.go_to_cart();
    }

    @Then("I should see the items and the corresponding quantity and correct total")
    public void iShouldSeeTheItemsAndTheCorrespondingQuantityAndCorrectTotal() {
        fahasaShopSteps.check_order();
    }
}
