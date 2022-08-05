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
    public void theUserClicksOnTheClickToSelectDatesTab() {
        SeleniumActions.click(RoomElements.inputDate, driver);
    }

    @Then("User validates calendar is visible")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomElements.calendarTable);
        Assert.assertTrue(calendar.isDisplayed());
    }

    @When("User selects the check-in date {string} and check out date {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String dateCheck, String dateCheck1) {
        SeleniumActions.click(RoomElements.dateVariable(dateCheck), driver);
        SeleniumActions.click(RoomElements.dateVariable(dateCheck1), driver);
    }

    @And("The user clicks the calendar button {string}")
    public void theUserClicksTheCalendarButton(String str) {
        SeleniumActions.click(RoomElements.calendarButton(str), driver);
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() {

        SeleniumActions.click(RoomElements.invalidDate, driver);
    }

    @Then("User validates that rooms are displayed")
    public void userValidatesThatRoomsAreDisplayed() {
        driver.findElement(RoomElements.roomView).isDisplayed();
    }

    @Then("User validates that Rooms page is open")
    public void userValidatesThatRoomsPageIsOpen() {
        driver.findElement(RoomElements.roomPageVisible).isDisplayed();
    }
}
