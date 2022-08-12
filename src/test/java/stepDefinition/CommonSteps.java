package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import pages.MenuPage;
import pages.RoomPage;
import utils.ConfigFileReader;
import utils.SeleniumActions;

public class CommonSteps {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;
    HomePage homePage;


    public CommonSteps(TestContext context) {
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
    public void theUserClicksOnTheTopColumn(String menu) {
        WebElement topMenu = driver.findElement(MenuPage.topMenu(menu));
        topMenu.click();
    }

    @When("User selects the check-in date {string} and check out date {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String CheckInDate, String CheckOutDate) {
        SeleniumActions.click(RoomPage.dateVariable(CheckInDate), driver);
        SeleniumActions.click(RoomPage.dateVariable(CheckOutDate), driver);
    }

    @And("The user clicks on the date picker")
    public void theUserClicksOnTheClickToSelectDatesDatePicker() {
        SeleniumActions.click(CommonPage.inputDate, driver);
    }

    @Then("User validates calendar is displayed")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(CommonPage.calendarTable);
        Assert.assertTrue(calendar.isDisplayed());
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() {
        SeleniumActions.click(CommonPage.disabledDate, driver);
    }

    @And("The user clicks the calendar button {string}")
    public void theUserClicksTheCalendarButton(String calendarButton) {
        SeleniumActions.click(RoomPage.calendarButton(calendarButton), driver);
    }

}
