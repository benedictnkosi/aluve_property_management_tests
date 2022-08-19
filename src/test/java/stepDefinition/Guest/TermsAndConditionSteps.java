package stepDefinition.Guest;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Guest.TermsAndConditionsPage;
import utils.SeleniumActions;

public class TermsAndConditionSteps {
    TestContext testContext;
    WebDriver driver;

    public TermsAndConditionSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @Then("User validates Terms and Conditions page is displayed")
    public void userValidatesTermsAndConditionsPageIsDisplayed() {
        SeleniumActions.waitForVisibility(TermsAndConditionsPage.termsAndConditions, driver);
        WebElement terms = driver.findElement(TermsAndConditionsPage.termsAndConditions);
        Assert.assertTrue(terms.isDisplayed());
    }
}
