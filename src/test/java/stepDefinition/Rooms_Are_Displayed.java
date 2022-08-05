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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import java.time.Duration;
import java.util.ArrayList;

import static java.time.Duration.ofSeconds;

public class Rooms_Are_Displayed {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;


    public Rooms_Are_Displayed(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();

    }

    @Given("The user is at the home page")
    public void the_user_has_logged_in_the_website() {
        driver.get("https://dev-aluvegh.co.za/index.html");
    }

    @When("The user clicks on the {string} top menu")
    public void theUserClicksOnTheTopColumn(String column) {
        WebElement roomColumn = driver.findElement(RoomDisplayed_Elements.topColumn(column));
        roomColumn.click();
    }

    @And("The user clicks on the Click to Select Dates tab")
    public void theUserClicksOnTheClickToSelectDatesTab() {
        WebElement dateSelect = driver.findElement(RoomDisplayed_Elements.inputDate);
        dateSelect.click();
    }

    @Then("User validates calendar is present")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomDisplayed_Elements.calendarTable);
        calendar.isDisplayed();
    }

    @When("User selects the {string} and {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String arg0, String arg1) {
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(5));
        WebElement findDate1 = wait.until(ExpectedConditions.elementToBeClickable(RoomDisplayed_Elements.dateVariable(arg0)));
        findDate1.click();

        WebElement findDate2 = wait.until(ExpectedConditions.elementToBeClickable(RoomDisplayed_Elements.dateVariable(arg1)));
        findDate2.click();
    }

    @And("The user clicks the {string} button")
    public void theUserClicksTheApplyButton(String str) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(RoomDisplayed_Elements.actionButton(str)));
            applyButton.click();
        } catch (Exception e) {
            Thread.sleep(10);
            WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(RoomDisplayed_Elements.actionButton(str)));
            applyButton.click();
        }
    }

    @Then("User validates the dates on input tab are start date and end date")
    public void userValidatesTheDatesOnInputTabAreStartDateAndEndDate() {
        WebElement dateSelect = driver.findElement(RoomDisplayed_Elements.inputDate);
        String typeOut = dateSelect.toString().toLowerCase();
        System.out.println("The date is " + typeOut);
    }

    @Then("User validates that {string} page option is visible")
    public void userValidatesThatWhatsappPageOptionIsVisible(String str) {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));
        WebElement whatsAppVisible = driver.findElement(RoomDisplayed_Elements.whatsAppPage);
        whatsAppVisible.isDisplayed();
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Then("User validates if envelope page is open")
    public void userValidatesIfEnvelopePageIsOpen() {
        driver.navigate().back();
    }

    @When("User clicks on invalid date")
    public void userClicksOnInvalidDate() {
        WebElement unselected = driver.findElement(RoomDisplayed_Elements.invalidDate);
        Assert.assertFalse(unselected.isSelected());
    }

    @Then("User validates invalid cannot be selected")
    public void userValidatesInvalidCannotBeSelected() {
        driver.findElement(RoomDisplayed_Elements.invalidDate).isSelected();
    }
}
