package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RoomPage;
import utils.SeleniumActions;

public class RoomsAreDisplayedSteps {
    TestContext testContext;
    WebDriver driver;

    public RoomsAreDisplayedSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @And("The user clicks on the *Click to Select Dates* date picker")
    public void theUserClicksOnTheClickToSelectDatesTab() {
        SeleniumActions.click(RoomPage.inputDate, driver);
    }

    @Then("User validates calendar is visible")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomPage.calendarTable);
        Assert.assertTrue(calendar.isDisplayed());
    }

    @When("User selects the check-in date {string} and check out date {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String dateSelect, String dateSelect1) {
        SeleniumActions.click(RoomPage.dateVariable(dateSelect), driver);
        SeleniumActions.click(RoomPage.dateVariable(dateSelect1), driver);
    }

    @And("The user clicks the calendar button {string}")
    public void theUserClicksTheCalendarButton(String calendarButton) {
        SeleniumActions.click(RoomPage.calendarButton(calendarButton), driver);
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() {
        SeleniumActions.click(RoomPage.invalidDate, driver);
    }

    @Then("User validates that rooms are displayed")
    public void userValidatesThatRoomsAreDisplayed() {
        WebElement roomView = driver.findElement(RoomPage.roomView);
        Assert.assertTrue(roomView.isDisplayed());
    }

    @Then("User validates that Rooms page is open")
    public void userValidatesThatRoomsPageIsOpen() {
        WebElement roomPage = driver.findElement(RoomPage.roomPageIsVisible);
        Assert.assertTrue(roomPage.isDisplayed());
    }
}
