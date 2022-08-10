package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
    public void theUserClicksOnTheClickToSelectDatesDatePicker() {
        SeleniumActions.click(RoomPage.inputDate, driver);
    }

    @Then("User validates calendar is visible")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomPage.calendarTable);
        Assert.assertTrue(calendar.isDisplayed());
    }

    @When("User selects the check-in date {string} and check out date {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String CheckInDate, String CheckOutDate) {
        SeleniumActions.click(RoomPage.dateVariable(CheckInDate), driver);
        SeleniumActions.click(RoomPage.dateVariable(CheckOutDate), driver);
    }

    @And("The user clicks the calendar button {string}")
    public void theUserClicksTheCalendarButton(String calendarButton) {
        SeleniumActions.click(RoomPage.calendarButton(calendarButton), driver);
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() {
        SeleniumActions.click(RoomPage.disabledDate, driver);
    }

    @Then("User validates that rooms are displayed")
    public void userValidatesThatRoomsAreDisplayed() {
        WebElement roomView = driver.findElement(RoomPage.roomContainer);
        Assert.assertTrue(roomView.isDisplayed());
    }

    @Then("User validates that Rooms page is open")
    public void userValidatesThatRoomsPageIsOpen() {
        WebElement roomPage = driver.findElement(RoomPage.roomPageHeading);
        Assert.assertTrue(roomPage.isDisplayed());
    }
}
