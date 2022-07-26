package stepDefinition;

import Elements.Elements;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ConfigFileReader;

public class HomePageSteps {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;


    public HomePageSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
    }

    @When("User clicks on the next display arrow")
    public void user_clicks_on_the_next_display_arrow() {
        WebElement nextDisplay = driver.findElement(Elements.displaySwitchNextButton);
        int i = 0;
        while (i < 3) {
            i++;
            nextDisplay.click();
        }
    }

    @When("User clicks on the previous display arrow")
    public void user_clicks_on_the_previous_display_arrow() {
        WebElement previousDisplay = driver.findElement(Elements.displaySwitchPreviousButton);
        int i = 0;
        while (i < 3) {
            i++;
            previousDisplay.click();
        }
    }

    @And("User clicks on the Book Now button")
    public void userClicksOnTheBookNowButton() {
        WebElement buttonBookNow = driver.findElement(Elements.displayBookNowButton);
        buttonBookNow.click();
    }

    @And("returns back to home page")
    public void returnsBackToHomePage() {
        driver.navigate().back();
    }
}
