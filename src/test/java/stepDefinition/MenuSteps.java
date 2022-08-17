package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BookNowPage;
import pages.MenuPage;
import utils.SeleniumActions;

public class MenuSteps {

    TestContext testContext;
    WebDriver driver;

    public MenuSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @Then("User validates that Contact Us page is open")
    public void userValidatesThatContactUsPageIsOpen() {
        SeleniumActions.waitForVisibility(MenuPage.ContactUsHeading, driver);
        WebElement contactUsPage = driver.findElement(MenuPage.ContactUsHeading);
        Assert.assertTrue(contactUsPage.isDisplayed());
    }

    @Then("User validates booking form is displayed")
    public void user_validates_booking_form_is_displayed() {
        SeleniumActions.waitForVisibility(BookNowPage.BookingForm, driver);
        WebElement bookNowFormPage = driver.findElement(BookNowPage.BookingForm);
        Assert.assertTrue(bookNowFormPage.isDisplayed());
    }

    @Then("User validates Home page is displayed")
    public void userValidatesHomePageIsDisplayed() {
        SeleniumActions.waitForVisibility(MenuPage.homePage, driver);
        WebElement homePage = driver.findElement(MenuPage.homePage);
        Assert.assertTrue(homePage.isDisplayed());
    }
}
