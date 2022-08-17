package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.MenuPage;
import utils.SeleniumActions;

public class MenuSteps {

    TestContext testContext;
    WebDriver driver;

    public MenuSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @When("The user clicks on the {string} top menu")
    public void theUserClicksOnTheTopMenu(String menu) {
        SeleniumActions.click(MenuPage.topMenu(menu), driver);
    }
}
