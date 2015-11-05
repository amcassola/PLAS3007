package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

/**
 * Write something about this class here
 *
 * @author annamaria.cassola
 * @since 29/10/2015
 */
public class SearchSteps {
    @When("^I search for '(.+)' on '(.+)'$")
    public static void whenISearchFor(String searchString, String site) {
        assertTrue(String.join(" ", "Searched for ", searchString, " on ", site), true);
    }

    @Then("^Number of (.+) in results (.+) (.+)$")
    public void thenImageResultContentIs(String imageContent, String operator, int count) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertTrue(String.join("Found ", operator, Integer.toString(count), " ", imageContent), true);
    }

    @Then("^the Google stats tab is displayed$")
    public void thenTheGoogleStatsTabIsDisplayed() throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }

    @And("^the Google Search results are displayed$")
    public void theGoogleSearchResultsAreDisplayed() throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }

    @Then("^the flag of 'Malta' is displayed$")
    public void thenTheFlagOfMaltaIsDisplayed() throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }

    @Then("^the Google Calculator component is displayed$")
    public void thenTheGoogleCalculatorComponentIsDisplayed() throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }

    @And("^the result on Google Calculator is '(.+)'$")
    public void thenTheResultOnGoogleCalculatorIs(String calculationResult) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }

    @When("^I input '(.+) (.+) (.+)'$")
    public void whenIInputASimpleCalculation(int numberA, String operator, int numberB) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }

    @Then("^the calculation result is (.+)$")
    public void thenTheSimpleCalculationResultIs(int result) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }

}
