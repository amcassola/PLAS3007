package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import edu.plas.testautoandci.driver.Driver;
import edu.plas.testautoandci.helper.DriverWindowHelper;

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


    @When("^.*window is closed$")
    public void closeCurrentWindow() throws Throwable {
        DriverWindowHelper.switchToMainWindow();
    }
}
