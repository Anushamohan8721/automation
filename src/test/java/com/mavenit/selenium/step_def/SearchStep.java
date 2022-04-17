package com.mavenit.selenium.step_def;

import com.mavenit.selenium.page_objects.HeaderPage;
import com.mavenit.selenium.page_objects.SearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchStep {

    private HeaderPage headerPage = new HeaderPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private String searchTerm;

    @Given("^Iam on homepage$")
    public void iam_on_homepage() {
        String actual = headerPage.getCurrentUrl();
        assertThat(actual, endsWith("co.uk/"));
    }

    @Then("^I should be able to see respective products$")
    public void i_should_be_able_to_see_respective_products() {
        String actual = searchResultPage.getProductTitle();
        assertThat(searchTerm, is(equalTo(actual)));
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void iSearchForProduct(String searchItem) {
        this.searchTerm=searchItem;
        headerPage.search(searchItem);
    }

}
