package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Room_Elements;
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
        try {
            SeleniumActions.click(Room_Elements.inputDate, driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("User validates calendar is visible")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(Room_Elements.calendarTable);
        Assert.assertTrue(calendar.isDisplayed());
    }

    @When("User selects the check-in date {string} and check out date {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String dateCheck, String dateCheck1) {
        try {
            SeleniumActions.click(Room_Elements.dateVariable(dateCheck), driver);
            SeleniumActions.click(Room_Elements.dateVariable(dateCheck1), driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("The user clicks the calendar button {string}")
    public void theUserClicksTheCalendarButton(String str) throws InterruptedException {
        SeleniumActions.click(Room_Elements.calendarButton(str), driver);
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() {
        try {
            SeleniumActions.click(Room_Elements.invalidDate, driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("User validates invalid cannot be selected")
    public void userValidatesInvalidCannotBeSelected() {
        WebElement cannotSelect = driver.findElement(Room_Elements.invalidDate);
        WebElement dateSelected = driver.findElement(Room_Elements.activeDate);
        Assert.assertNotSame(cannotSelect, dateSelected);
    }

    @Then("User checks if rooms are displayed")
    public void userChecksIfRoomsAreDisplayed() {
        driver.findElement(Room_Elements.roomView).isDisplayed();
    }
}
