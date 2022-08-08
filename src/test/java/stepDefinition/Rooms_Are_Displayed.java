package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RoomElements;
import utils.SeleniumActions;

public class Rooms_Are_Displayed {
    TestContext testContext;
    WebDriver driver;

    public Rooms_Are_Displayed(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @And("The user clicks on the *Click to Select Dates* date picker")
    public void theUserClicksOnTheClickToSelectDatesTab() throws InterruptedException {
        SeleniumActions.click(RoomElements.inputDate, driver);
    }

    @Then("User validates calendar is visible")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomElements.calendarTable);
        Assert.assertTrue(calendar.isDisplayed());
    }

    @And("The user clicks the calendar button {string}")
    public void theUserClicksTheCalendarButton(String str) throws InterruptedException {
        SeleniumActions.click(RoomElements.calendarButton(str), driver);
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() throws InterruptedException {

        SeleniumActions.click(RoomElements.invalidDate, driver);
    }

    @Then("User validates that rooms are displayed")
    public void userValidatesThatRoomsAreDisplayed() {
        WebElement roomView = driver.findElement(RoomElements.roomView);
        Assert.assertTrue(roomView.isDisplayed());

    }

    @Then("User validates that Rooms page is open")
    public void userValidatesThatRoomsPageIsOpen() {
        WebElement roomPage = driver.findElement(RoomElements.roomPageVisible);
        Assert.assertTrue(roomPage.isDisplayed());
    }
}
