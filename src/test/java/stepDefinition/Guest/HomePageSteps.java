package stepDefinition.Guest;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Guest.HomePage;
import utils.SeleniumActions;

public class HomePageSteps {
    TestContext testContext;
    WebDriver driver;

    public HomePageSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @Then("User validates Home page is displayed")
    public void userValidatesHomePageIsDisplayed() {
        SeleniumActions.waitForVisibility(HomePage.homePage, driver);
        WebElement homePage = driver.findElement(HomePage.homePage);
        Assert.assertTrue(homePage.isDisplayed());
    }
}
