package stepDefinition;

import Elements.RoomElements;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import static java.time.Duration.ofSeconds;


public class RoomSteps {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;

    public RoomSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();

    }

    String url = "https://dev-aluvegh.co.za/index.html";

    @Given("The user has logged in the website")
    public void the_user_has_logged_in_the_website() {
        driver.get(url);
    }

    @When("The user clicks on the {string} top menu")
    public void theUserClicksOnTheTopColumn(String column) {
        WebElement roomColumn = driver.findElement(RoomElements.topColumn(column));
        roomColumn.click();
    }

    @And("The user clicks on the *Click to Select Dates* tab")
    public void theUserClicksOnTheClickToSelectDatesTab() {
        WebElement dateSelect = driver.findElement(RoomElements.inputDate);
        dateSelect.click();
    }

    @Then("User validates that the calendar is present")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomElements.calendarTable);
        calendar.isDisplayed();
    }

    @And("The user clicks the {string} button")
    public void theUserClicksTheApplyButton(String str) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(15));
        WebElement applyButton = wait.until(ExpectedConditions.presenceOfElementLocated(RoomElements.actionButton(str)));
        try {
            applyButton.click();
        } catch (Exception e) {
            Thread.sleep(500);
            applyButton.click();
        }
    }

    @When("User selects the {string} and {string}")
    public void userSelectsTheAnd(String arg0, String arg1) {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(5));
        WebElement findDate1 = wait.until(ExpectedConditions.elementToBeClickable(RoomElements.dateVariable(arg0)));
        findDate1.click();

        WebElement findDate2 = wait.until(ExpectedConditions.elementToBeClickable(RoomElements.dateVariable(arg1)));
        findDate2.click();
    }

    @Then("User validates rooms available")
    public void userValidatesRoomsAvailable() {
        driver.findElement(RoomElements.bestRooms).isDisplayed();
    }

    @When("The user selects an {string}")
    public void theUserSelectsAn(String arg0) {
        WebElement findDate1 = driver.findElement(RoomElements.dateInvalid(arg0));
        findDate1.click();
    }

    @Then("User validates invalid date cannot be selected")
    public void userValidatesInvalidDateCannotBeSelected() {
        WebElement invalidDate = driver.findElement(RoomElements.bestRooms);
        Assert.assertFalse(String.valueOf(invalidDate), invalidDate.isSelected());
    }
}
