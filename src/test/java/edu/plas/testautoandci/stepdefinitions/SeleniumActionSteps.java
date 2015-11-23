package edu.plas.testautoandci.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.plas.testautoandci.driver.Driver;
import edu.plas.testautoandci.helper.DriverWindowHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Write something about this class here
 *
 * @author AnnaMaria.Cassola
 * @since 21/11/2015
 */
public class SeleniumActionSteps {

    @When("^(.*) is selected$")
    public void optionIsSelected(String option) {
        Select select = new Select(Driver.getWebDriver().findElement(By.id("Parking")));
        select.selectByVisibleText(option);
    }

    @Then("^(.*) and (.*) are displayed$")
    public void textIsDisplayedBelow(String option, String code) throws Throwable {
        WebElement selectResult = Driver.getWebDriver().findElement(By.id("selectResult"));

        String displayedText = selectResult.getText();
        assertTrue("Selected option and code must be displayed", displayedText.contains(option) && displayedText.contains(code));
    }

    @When("^the '(.*)' element is hovered over$")
    public void elementIsHoveredOver(String elementText) throws Throwable {
        WebElement hoverOverElement = Driver.getWebDriver().findElement(By.xpath("//div[@id='hoverSection']//*[contains(., '" + elementText + "')]"));
        Actions action = new Actions(Driver.getWebDriver());
        action.moveToElement(hoverOverElement).build().perform();
    }

    @Then("^Some additional text is displayed$")
    public void additionalTextIsDisplayed() throws Throwable {
        WebElement hoverOverElement = Driver.getWebDriver().findElement(By.cssSelector("div#hoverSection .onHoverOnly"));

        assertTrue("Some additional text must be displayed", hoverOverElement.isDisplayed());
    }

    @When("^the '(.*)' element is hovered away from$")
    public void elementIsHoveredAwayFrom(String elementText) throws Throwable {
        WebElement hoverOverElement = Driver.getWebDriver().findElement(By.xpath("//div[@id='hoverSection']//*[contains(., '" + elementText + "')]"));
        Actions action = new Actions(Driver.getWebDriver());
        action.moveToElement(hoverOverElement, -10, -10).build().perform();
    }

    @Then("^No additional text is displayed$")
    public void noAdditionalTextIsDisplayed() throws Throwable {
        WebElement hoverOverElement = Driver.getWebDriver().findElement(By.cssSelector("div#hoverSection .onHoverOnly"));
        assertTrue("No additional text must be displayed", ! hoverOverElement.isDisplayed());
    }

    @When("^the '(.*)' (?:link|button) is clicked$")
    public void elementIsClicked(String elementText) throws Throwable {
        WebElement clickableElement = Driver.getWebDriver().findElement(By.xpath("//*[text()='" + elementText + "']"));
        Actions action = new Actions(Driver.getWebDriver());
        action.click(clickableElement).build().perform();
    }

    @Then("^the Google Search window is opened$")
    public void switchToLatestOpenedWindow() throws Throwable {
        DriverWindowHelper.switchToWindow();

        assertEquals("New window URL must match link URL", Driver.getWebDriver().getTitle(), "Google");
    }

    @Then("^the '(.*)' is underlined$")
    public void textIsUnderlined(String text) throws Throwable {
        WebElement elementWithText = Driver.getWebDriver().findElement(By.xpath("//*[text()='" + text + "']"));

        assertEquals(text + " must be underlined", elementWithText.getCssValue("text-decoration"), "underline");
    }

    @Then("^the first level IFrame contains the text '(.*)'$")
    public void firstLevelIFrameContainsText(String text) throws Throwable {
        WebElement frame = Driver.getWebDriver().findElement(By.id("firstFrame"));
        Driver.getWebDriver().switchTo().frame(frame);

        WebElement textElement = Driver.getWebDriver().findElement(By.tagName("h1"));

        assertEquals("1st level IFrame text must match expected text", textElement.getText(), text);
    }

    @And("^the second level IFrame contains the text '(.*)'$")
    public void secondLevelIFrameContainsText(String text) throws Throwable {
        WebElement frame = Driver.getWebDriver().findElement(By.id("secondFrame"));
        Driver.getWebDriver().switchTo().frame(frame);

        WebElement textElement = Driver.getWebDriver().findElement(By.tagName("h3"));

        assertEquals("2nd level IFrame text must match expected text", textElement.getText(), text);
    }

    @And("^there are '(\\d+)' horizontal rule lines in the main HTML document$")
    public void mainHTMLHasHorizontalRules(int count) throws Throwable {
        Driver.getWebDriver().switchTo().defaultContent();

        List<WebElement> horizontalRules = Driver.getWebDriver().findElements(By.xpath("//hr"));

        assertEquals("Expected number of HR elements must match", count, horizontalRules.size());
    }

    @Then("^an alert is displayed$")
    public void alertIsDisplayed() throws Throwable {
        Driver.getWebDriver().switchTo().alert();
    }

    @When("^I (accept|dismiss) the alert$")
    public void I_action_the_alert(String actionType) throws Throwable {
        Alert alert = Driver.getWebDriver().switchTo().alert();

        if ("accept".equals(actionType)) {
            alert.accept();
        } else {
           alert.dismiss();
        }
    }

    @Then("^'(.*)' is displayed$")
    public void textIsDisplayed(String text) throws Throwable {
        WebElement textElement = Driver.getWebDriver().findElement(By.id("alertResult"));

        assertEquals("Expected text must match", textElement.getText(), text);
    }

    @When("^the image is dragged and dropped into the box$")
    public void imageIsDraggedAndDroppedIntoBox() throws Throwable {
        WebElement imageToDrag = Driver.getWebDriver().findElement(By.id("drag1"));
        WebElement boxToDragInto = Driver.getWebDriver().findElement(By.id("drop1"));

        Actions action = new Actions(Driver.getWebDriver());
        action.dragAndDrop(imageToDrag, boxToDragInto).build().perform();
    }

    @Then("^the image is displayed inside the box$")
    public void imageIsDisplayedInsideBox() throws Throwable {
        List<WebElement> draggedImage = Driver.getWebDriver().findElements(By.cssSelector("#drop1 #drag1"));

        assertTrue("Image must be in box", draggedImage.size() == 1);
    }
}
