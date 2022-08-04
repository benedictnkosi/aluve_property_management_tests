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
import java.util.List;

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

    @Given("The user has logged in the website")
    public void the_user_has_logged_in_the_website() {
        driver.get("https://dev-aluvegh.co.za/index.html");
    }

    @When("The user clicks on the {string} top column")
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

    @When("User selects the start date and end date")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate() {
        WebElement today = driver.findElement(RoomDisplayed_Elements.todaysDate);
        today.click();
        List<WebElement> futureDate = driver.findElements(RoomDisplayed_Elements.futureDate);
        WebElement A;
        for (int i = 0; i < futureDate.size(); i++) {
            A = futureDate.get(8);
            A.click();
            break;
        }
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
