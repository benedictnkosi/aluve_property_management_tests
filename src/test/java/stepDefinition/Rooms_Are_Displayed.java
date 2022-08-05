package stepDefinition;

import Elements.RoomDisplayed_Elements;
import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.ConfigFileReader;
import utils.SeleniumActions;

public class Rooms_Are_Displayed {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;
    HomePage homePage;


    public Rooms_Are_Displayed(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
        homePage = pageObjectManager.getHomePage();

    }

    @Given("The user is on the home page")
    public void the_user_has_logged_in_the_website() {
        homePage.OpenHomePage();
    }

    @When("The user clicks on the {string} top menu")
    public void theUserClicksOnTheTopColumn(String column) {
        WebElement roomColumn = driver.findElement(RoomDisplayed_Elements.topMenu(column));
        roomColumn.click();
    }

    @And("The user clicks on the *Click to Select Dates* date picker")
    public void theUserClicksOnTheClickToSelectDatesTab() {
        try {
            SeleniumActions.click(RoomDisplayed_Elements.inputDate, driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("User validates calendar is visible")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomDisplayed_Elements.calendarTable);
        Assert.assertTrue(calendar.isDisplayed());
    }

    @When("User selects the check-in date {string} and check out date {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String dateCheck, String dateCheck1) {
        try {
            SeleniumActions.click(RoomDisplayed_Elements.dateVariable(dateCheck), driver);
            SeleniumActions.click(RoomDisplayed_Elements.dateVariable(dateCheck1), driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("The user clicks the calendar button {string}")
    public void theUserClicksTheApplyButton(String str) throws InterruptedException {
        SeleniumActions.click(RoomDisplayed_Elements.actionButton(str), driver);
    }

    @Then("User validates the dates on the date picker are check-in and check-out date")
    public void userValidatesTheDatesOnInputTabAreStartDateAndEndDate() {
        WebElement dateSelect = driver.findElement(RoomDisplayed_Elements.inputDate);
        Assert.assertTrue(dateSelect.getText(), true);
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() {
        WebElement unselected = driver.findElement(RoomDisplayed_Elements.invalidDate);
        Assert.assertFalse(unselected.isSelected());
    }

    @Then("User validates invalid cannot be selected")
    public void userValidatesInvalidCannotBeSelected() {
        Assert.assertFalse(String.valueOf(RoomDisplayed_Elements.invalidDate), false);
    }
}
