package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.Given;
import edu.plas.testautoandci.driver.Driver;

/**
 * Write something about this class here
 *
 * @author annamaria.cassola
 * @since 29/10/2015
 */

public class NavigationSteps {

    @Given("^I navigate to (.*)$")
    public void iNavigateTo(String site) {
        Driver.getWebDriver().get(site);
    }

}
