package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ContactUsPage;
import utils.SeleniumActions;

public class ContactUsSteps {
    TestContext testContext;
    WebDriver driver;

    public ContactUsSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @Then("User validates that Contact Us page is open")
    public void userValidatesThatContactUsPageIsOpen() {
        SeleniumActions.waitForVisibility(ContactUsPage.ContactUsHeading, driver);
        WebElement contactUsPage = driver.findElement(ContactUsPage.ContactUsHeading);
        Assert.assertTrue(contactUsPage.isDisplayed());
    }
}
