package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BookNowPage;

public class BookNowTopMenuSteps {
    TestContext testContext;
    WebDriver driver;

    public BookNowTopMenuSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @Then("User validates content form is displayed")
    public void user_validates_content_form_is_displayed() {
        WebElement bookNowContentPage = driver.findElement(BookNowPage.contentForm);
        Assert.assertTrue(bookNowContentPage.isDisplayed());
    }
}
