package stepDefinition;

import Elements.BookNowElements;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigFileReader;


public class Book_Now {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;
    String url = "https://dev-aluvegh.co.za/index.html";

    public Book_Now(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
    }

    @When("User clicks on {string}")
    public void userClicksOnBookNow() {
        driver.get(url);
    }

    @And("User inputs name in {string} tab")
    public void userInputsValueInYourNameTab(String str) {
        WebElement inputValue = driver.findElement(BookNowElements.inputTab(str));
        inputValue.clear();
        inputValue.sendKeys("Mluleki");
    }

    @And("User inputs phone in {string} tab")
    public void userInputsPhoneInPhoneTab(String str) {
        WebElement inputValue = driver.findElement(BookNowElements.inputTab(str));
        inputValue.clear();
        inputValue.sendKeys("0834889077");
    }

    @And("User inputs email in {string} tab")
    public void userInputsEmailInEmailTab(String str) {
        WebElement inputValue = driver.findElement(BookNowElements.inputTab(str));
        inputValue.clear();
        inputValue.sendKeys("mlu78nkosi@gmail.com");
    }
}
