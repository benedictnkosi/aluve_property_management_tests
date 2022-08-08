package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.MenuPage;
import pages.RoomElements;
import utils.ConfigFileReader;
import utils.SeleniumActions;

public class CommonSteps {
    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;
    HomePage homePage;


    public CommonSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
        homePage = pageObjectManager.getHomePage();

    }

    @Given("The user is on the home page")
    public void the_user_has_logged_in_the_website() {
        homePage.OpenHomePage();
    }

    @When("The user clicks on the {string} top menu")
    public void theUserClicksOnTheTopColumn(String menu) {
        WebElement topMenu = driver.findElement(MenuPage.topMenu(menu));
        topMenu.click();
    }

    @When("User selects the check-in date {string} and check out date {string}")
    public void userSelectsTheStartDateStartdateAndEndDateEnddate(String dateCheck, String dateCheck1) throws InterruptedException {
        SeleniumActions.click(RoomElements.dateVariable(dateCheck), driver);
        SeleniumActions.click(RoomElements.dateVariable(dateCheck1), driver);
    }

}
