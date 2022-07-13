package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
    public void user_is_on_Login_Page() throws Throwable {
        OpenLoginPage();
    }

    public void OpenLoginPage() {
        configReader = new ConfigFileReader();
        driver.get(configReader.getApplicationUrl());
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
    public void user_LogOut_from_the_Application() throws Throwable {
        log.debug("Logout application");
        log.debug("Logout application");
    }

    @Then("^User is redirected to the Login page$")
    public void user_is_redirected_to_the_Login_page() throws Throwable {
        log.debug("Logout application");
    }


    @After
    public void teardown() {
        testContext.getWebDriverManager().closeDriver();
    }


}
