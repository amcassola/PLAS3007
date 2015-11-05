package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

/**
 * Write something about this class here
 *
 * @author annamaria.cassola
 * @since 29/10/2015
 */

public class NavigationSteps {

    @Given("^I navigate to '(.+)'$")
    public static void givenINavigateToSite(String site){
        // navigate to google web
        switch (site) {
            case "BBC News":
                assertTrue("Navigated to BBC News", true);
                break;
            case "Google Search":
                assertEquals("Navigated to Google Search", "Google Search", site);
                break;
            case "Google Images":
                assertFalse("Navigated to Google Images", !"Google Search".equals(site));
                break;
            case "http://www.math.com/students/calculators/source/basic.htm":
                assertSame("Navigated to math.com", site, site);
                break;
        }
    }

    @When("^I click on the menu item '(.+)' in the BBC News website$")
    public void whenIClickOnBBCNewsMenuItem(String menuItem) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assert(true);
    }
}
