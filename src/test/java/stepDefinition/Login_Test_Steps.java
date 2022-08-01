package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.ConfigFileReader;

public class Login_Test_Steps {

    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;

    LoginPage loginPage;

    static final Logger log = (Logger) LogManager.getLogger(Login_Test_Steps.class.getName());

    public Login_Test_Steps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
        loginPage = pageObjectManager.getLoginPage();
    }

    @Given("^User is on Login Page$")
    public void user_is_on_Login_Page() {
        loginPage.OpenLoginPage();
    }

    @When("^User logs in with \"(.*)\"$")
    public void user_enters_UserName(String password) {
        loginPage.LoginUser(password);
    }

    @Then("^User is redirected to the Dashboard page$")
    public void user_is_redirected_to_the_Dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        boolean result = loginPage.isUserLoggedIn();
        if (!result) {
            Assert.fail("User is not logged in");
        }

    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() {
        log.debug("Logout application");
        log.debug("Logout application 1234 ");
    }

    @Then("^User is redirected to the Login page$")
    public void user_is_redirected_to_the_Login_page() {
        log.debug("Logout application");
    }


//    @After
//    public void teardown() {
//        testContext.getWebDriverManager().closeDriver();
//    }


}
