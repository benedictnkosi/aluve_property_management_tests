package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.CommonAdminPage;
import utils.ConfigFileReader;

public class GeneralAminSteps {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;
    CommonAdminPage commonAdminPage;

    public GeneralAminSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
        commonAdminPage = pageObjectManager.getCommonAdminPage();
    }

    @Given("The user has logged in")
    public void theUserHasLoggedIn() {
        commonAdminPage.OpenLoginPage();
        commonAdminPage.LoginUser();
    }
}

