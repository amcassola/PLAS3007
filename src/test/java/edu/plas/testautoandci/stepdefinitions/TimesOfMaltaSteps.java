package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.Then;
import edu.plas.testautoandci.driver.Driver;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

public class TimesOfMaltaSteps {
    @Then("^the Times Talk section image has a height of (\\d+) pixels and width of (\\d+) pixels$")
    public void theTimesTalkSectionImageHasAHeightOf(int height, int width) {
//        int actualHeight = Driver.getWebDriver().findElement(By.xpath("//div[@id='widget_timestalk']/div/h2/a/img")).getSize().getHeight();
//        int actualWidth = Driver.getWebDriver().findElement(By.xpath("//div[@id='widget_timestalk']/div/h2/a/img")).getSize().getWidth();

        int actualHeight = Driver.getWebDriver().findElement(By.xpath("//img[@alt='TimesTalk']")).getSize().getHeight();
        int actualWidth = Driver.getWebDriver().findElement(By.xpath("//img[@alt='TimesTalk']")).getSize().getWidth();

        assertEquals("Height of times talk widget image is " + height, height, actualHeight);
        assertEquals("Width of times talk widget image is " + width, width, actualWidth);
    }
}