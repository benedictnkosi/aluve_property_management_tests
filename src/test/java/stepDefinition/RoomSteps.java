package stepDefinition;

import Elements.RoomElements;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


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

    @Given("The user has logged in the website")
    public void the_user_has_logged_in_the_website() {
        driver.get("https://dev-aluvegh.co.za/index.html");
    }

    @When("The user clicks on the {string} top column")
    public void theUserClicksOnTheTopColumn(String column) {
        WebElement roomColumn = driver.findElement(RoomElements.topColumn(column));
        roomColumn.click();
    }

    @And("The user clicks on the Click to Select Dates tab")
    public void theUserClicksOnTheClickToSelectDatesTab() {
        WebElement dateSelect = driver.findElement(RoomElements.inputDate);
        dateSelect.click();
    }

    @Then("User validates calendar is present")
    public void userValidatesCalendarIsPresent() {
        WebElement calendar = driver.findElement(RoomElements.calendarTable);
        calendar.isDisplayed();
    }

    @When("User selects the start date and end date")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate() {
        WebElement today = driver.findElement(RoomElements.todaysDate);
        today.click();
        List<WebElement> futureDate = driver.findElements(RoomElements.futureDate);
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
            WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(RoomElements.actionButton(str)));
            applyButton.click();
        } catch (Exception e) {
            Thread.sleep(10);
            WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(RoomElements.actionButton(str)));
            applyButton.click();
        }
    }

    @Then("User validates the dates on input tab are start date and end date")
    public void userValidatesTheDatesOnInputTabAreStartDateAndEndDate() {
        WebElement dateSelect = driver.findElement(RoomElements.inputDate);
        String typeOut = dateSelect.toString().toLowerCase();
        System.out.println("The date is " + typeOut);
    }

    @When("User clicks footer icon with value {string}")
    public void userClicksFooterIconWithValuePhone(String str) throws InterruptedException {
        WebElement footerIcon = driver.findElement(RoomElements.footerIcons(str));
        try {
            footerIcon.click();
        } catch (Exception e) {
            Thread.sleep(500);
            footerIcon.click();
        }
    }

    @Then("User validates that {string} option is visible")
    public void userValidatesThatPhoneOptionIsVisible(String str) {
        WebElement phoneIcon = driver.findElement(RoomElements.footerIcons(str));
        phoneIcon.isDisplayed();
    }

    @Then("User validates that {string} page option is visible")
    public void userValidatesThatWhatsappPageOptionIsVisible(String str) {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));
        WebElement whatsAppVisible = driver.findElement(RoomElements.whatsAppPage);
        whatsAppVisible.isDisplayed();
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @When("User clicks on footer page reference with value {string}")
    public void userClicksOnFooterPageReferenceWithValueHome(String str) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement footPage = wait.until(ExpectedConditions.visibilityOfElementLocated(RoomElements.footPage(str)));
        try {
            footPage.click();
        } catch (Exception e) {
            Thread.sleep(100);
            footPage.click();
        }
    }

    @Then("User validates {string} page is visible")
    public void userValidatesHomePageIsVisible(String str) {
        driver.findElement(RoomElements.footerPageConfirm(str)).isDisplayed();
    }

    @Then("User validates if envelope page is open")
    public void userValidatesIfEnvelopePageIsOpen() {
        driver.navigate().back();
    }
}
