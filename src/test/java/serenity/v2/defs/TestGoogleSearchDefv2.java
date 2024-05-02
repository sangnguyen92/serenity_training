package serenity.v2.defs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import serenity.v2.steps.GoogleSearchStepsv2;

public class TestGoogleSearchDefv2 {

    @Steps
    GoogleSearchStepsv2 gSearchStepsv2;

    @Given("^I am on the Google homepage$")
    public void i_am_on_the_google_homepage() {
        gSearchStepsv2.access_google_search();
    }

    @When("^I search keyword \"([^\"]*)\"$")
    public void i_search_keyword_something(String keyword) {
        gSearchStepsv2.search_for_keyword(keyword);
    }

    @When("^I type keyword \"([^\"]*)\" and click search$")
    public void i_type_keyword_and_click_search(String keyword) {
        gSearchStepsv2.type_keyword(keyword);
        gSearchStepsv2.click_search_btn();
    }

    @When("^I access the MIT page$")
    public void iAccessTheMIT() {
        gSearchStepsv2.access_item();
    }

    @When("^I search \"([^\"]*)\"$")
    public void iSearch(String keyword) throws Throwable {
        gSearchStepsv2.type_keyword2(keyword);
        gSearchStepsv2.click_search();

    }

    @Then("^I should see the Advanced Algorithms courses$")
    public void iShouldSeeTheAdvancedAlgorithmsCourses() {
    }
}
