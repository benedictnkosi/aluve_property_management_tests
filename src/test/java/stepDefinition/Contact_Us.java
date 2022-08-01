package stepDefinition;

import Elements.ContactUs;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigFileReader;
import utils.SeleniumActions;

import java.util.ArrayList;

public class Contact_Us {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;

    public Contact_Us(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
    }

    @Then("User validates Map page is open and returns to website")
    public void userValidatesMapPageIsOpenAndReturnsToWebsite(String str) {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));
        WebElement mapVisible = driver.findElement(ContactUs.contactIcons(str));
        mapVisible.isDisplayed();
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @When("User inputs guest information {string}")
    public void userInputsGuestInformationName(String str) throws InterruptedException {
        WebElement guestInfo = driver.findElement(ContactUs.inputGuestDetails(str));
        SeleniumActions.click(ContactUs.inputGuestDetails(str), driver);
    }

    @And("User inputs guest information on the selected tab name")
    public void userInputsOnTheSelectedTab() {
        driver.findElement(ContactUs.sendkeysName).sendKeys("Mluleki");
    }

    @And("User clicks on the contact icons with value {string}")
    public void userClicksOnTheContactIconsWithValueName(String str) throws InterruptedException {
        WebElement iconSelect = driver.findElement(ContactUs.contactIcons(str));
        SeleniumActions.click(ContactUs.contactIcons(str), driver);
    }

    @And("User inputs guest information on the selected tab email")
    public void userInputsGuestInformationOnTheSelectedTabEmail() {
        driver.findElement(ContactUs.sendkeysEmail).sendKeys("mlu78nkosi@gmail.com");
    }

    @And("User inputs guest information on the selected tab phone")
    public void userInputsGuestInformationOnTheSelectedTabPhone() {
        driver.findElement(ContactUs.sendkeysPhone).sendKeys("0834889077");
    }

    @And("User inputs a message")
    public void userInputsAMessage() {
        driver.findElement(ContactUs.sendkeysMessage).sendKeys("Hi ", "Are you guys available?");
    }

    @And("The user clicks on {string} button")
    public void theUserClicksOnSendMessageButton(String str) {
        try {
            SeleniumActions.click(ContactUs.submitButton(str), driver);
        } catch (InterruptedException e) {
            System.out.println("Not available");
        }
    }

    @Then("User validates if inputs were successfully sent")
    public void userValidatesIfInputsWereSuccessfullySent() {
        driver.findElement(ContactUs.successMessage);
    }
}

