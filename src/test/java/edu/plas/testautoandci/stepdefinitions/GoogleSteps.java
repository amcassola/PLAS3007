package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.plas.testautoandci.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoogleSteps {
    @When("^I search for '(.*)' on Google Search$")
    public void iSearchForSearchText(String searchText) {
        WebElement searchInput = Driver.getWebDriver().findElement(By.id("lst-ib"));

        searchInput.clear();
        searchInput.sendKeys(searchText);

        searchInput.submit();
//        Driver.getWebDriver().findElement(By.name("btnG")).click();
    }

    @Then("^the Google Calculator component is displayed$")
    public void theGoogleCalculatorComponentIsDisplayed() {
        WebElement googleCalculator = Driver.getWebDriver().findElement(By.id("cwmcwd"));
        assertTrue("Google Calculator should be displayed!", googleCalculator.isDisplayed());
    }

    @Then("^the result on Google Calculator is '(.*)'$")
    public void theResultOnGoogleCalculator(String calculationResult) {
        String actualResult = Driver.getWebDriver().findElement(By.id("cwos")).getText();
        assertEquals(calculationResult, actualResult);
    }

    @When("^I search for '(.*)' on Google Images$")
    public void iSearchForTextOnGoogleImages(String searchText) {
        WebElement searchInput = Driver.getWebDriver().findElement(By.id("lst-ib"));

        searchInput.clear();
        searchInput.sendKeys(searchText);

        searchInput.submit();
//        Driver.getWebDriver().findElement(By.name("btnG")).click();

    }

    @Then ("^there are '(.*)' images")
    public void iSearchForImageOnGoogleImages(String occurrences){
        List<WebElement> imageResults = Driver.getWebDriver().findElements(By.cssSelector("#rg_s .rg_di.rg_el.ivg-i"));

        String occurrenceCount = occurrences.replaceAll("^\\d", "").trim();
        int countInt;
        try{
            countInt = Integer.parseInt(occurrenceCount);
        } catch (NumberFormatException nfe) {
            countInt = 0;
        }

        String operator = occurrences.replaceAll("\\d", "").trim();

        boolean pass = false;

        switch (operator) {
            case "or more" : pass = imageResults.size() >= countInt; break;
            case "or less" : pass = imageResults.size() <= countInt; break;
            case "less than" : pass = imageResults.size() < countInt; break;
            case "more than" : pass = imageResults.size() > countInt; break;
            default: pass = imageResults.size() == countInt;
        }

        assertTrue("Expected number of images found (" + occurrences + ")", pass);
    }

    @Then("^there are '(.*)' images that contain '(.*)'$")
    public void iSearchForTextOnGoogleImages(String occurences, String expectedSearchResult) {
    }

    @Then("^the Google stats tab is displayed$")
    public void theGoogleStatsTabIsDisplayed() {
        List<WebElement> statsResults = Driver.getWebDriver().findElements(By.id("resultStats"));

        assertTrue(statsResults.contains("About"));
        assertTrue(statsResults.contains("results"));
        assertTrue(statsResults.contains("seconds"));
    }

    @Then("^the Google search results are displayed$")
    public void theGoogleSearchResultsAreDisplayed() {
        // CSS
        List<WebElement> searchResults = Driver.getWebDriver().findElements(By.cssSelector("#search .g"));
        // XPath
        // List<WebElement> searchResults = Driver.getWebDriver().findElements(By.xpath("//*[@id='search']//*[@class='g']"));

        assertTrue("Search results should have been shown", searchResults.size() > 1);
    }

    @Then("the flag of '(.*)' is displayed$")
    public void theFlagOfCountryIsDisplayed(String country) {
        // CSS
        WebElement flag = Driver.getWebDriver().findElement(By.cssSelector("#media_result_group .bicc img"));
        // XPath
        // WebElement flag = Driver.getWebDriver().findElement(By.xpath("//*[@id='media_result_group']//*[@class='bicc']//img"));

        assertTrue("Flag is not displayed", flag.isDisplayed());
        assertTrue("Country of flag is incorrect", flag.getAttribute("title").toLowerCase().contains(country.toLowerCase()));
    }

    @Then("the Google logo is displayed")
    public void theGoogleLogoIsDisplayed() {
        WebElement googleLogo = Driver.getWebDriver().findElement(By.id("hplogo"));
        assertTrue(googleLogo.isDisplayed());
    }

    @Then("the I'm Feeling Lucky button is displayed")
    public void theImFeelingLuckyButtonIsDisplayed() throws InterruptedException {
        WebElement iMFeelingLuckyButton = Driver.getWebDriver().findElement(By.name("btnI"));
        assertTrue(iMFeelingLuckyButton.isDisplayed());
        assertEquals("I'm Feeling Lucky", iMFeelingLuckyButton.getAttribute("value"));
    }
}