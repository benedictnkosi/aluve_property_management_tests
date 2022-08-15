package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BookNowPage;
import pages.MenuPage;
import pages.RoomPage;

public class MenuSteps {

    TestContext testContext;
    WebDriver driver;

    public MenuSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @Then("User validates that Contact Us page is open")
    public void userValidatesThatContactUsPageIsOpen() {
        WebElement contactUsPage = driver.findElement(MenuPage.ContactUsHeading);
        Assert.assertTrue(contactUsPage.isDisplayed());
    }

    @Then("User validates booking form is displayed")
    public void user_validates_content_form_is_displayed() {
        WebElement bookNowContentPage = driver.findElement(BookNowPage.BookingForm);
        Assert.assertTrue(bookNowContentPage.isDisplayed());
    }

    @Then("User validates that Rooms page is open")
    public void userValidatesThatRoomsPageIsOpen() {
        WebElement roomPage = driver.findElement(RoomPage.roomPageHeading);
        Assert.assertTrue(roomPage.isDisplayed());
    }
}
