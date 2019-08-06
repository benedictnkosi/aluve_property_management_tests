package stepDefinition;

import MoneyAppTests.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ConfigPage;
import pages.Homepage;
import pages.LoginPage;
import properties.Application;
import org.apache.log4j.Logger;


public class Config_Test_Steps extends BaseClass{

    WebDriver driver;

    Homepage homePage;
    LoginPage loginPage;
    ConfigPage config;

    Logger log = Logger.getLogger("devpinoyLogger");


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        super.setup();
        this.driver = super.driver;
        loginPage = new LoginPage(driver);
        loginPage.LoginUser(Application.application_username,Application.application_password);
    }


    @When("^User navigates to the config page$")
    public void user_enters_UserName_and_Password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.driver = super.driver;
        homePage = new Homepage(driver);

        log.debug("navigating to the config page");
        homePage.OpenConfigPage();
        log.debug("config page opened");
    }


    @When("^User selects category \"(.*)\"$")
    public void selectCategory(String category) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        config = new ConfigPage(driver);

        log.debug("Selecting transaction category ");
        config.selectCategory(category);
        log.debug("Selected transaction category ");
    }



    @When("^User enters \"(.*)\"$")
    public void setTransactionName(String transactionName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        config = new ConfigPage(driver);

        log.debug("Populating transaction name fiel ");
        config.setTransactionName(transactionName);
        log.debug("Transaction name field populated");
    }

    @When("^User clicks the create button$")
    public void submitNewCustomTransactionForm() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        config = new ConfigPage(driver);

        log.debug("Submitting the new transaction form");
        config.submitNewCustomTransactionForm();
        log.debug("transaction form submitted");
    }



    @When("^User clicks the delete button on \"([^\"]*)\"$")
    public void clickDeleteButton(String transactionName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        config = new ConfigPage(driver);

        log.debug("clicking the delete button on transaction name ");
        config.clickDeleteButtonOnTransaction(transactionName);
        log.debug("Clicked the delete button on transaction name");
    }


    @When("^A message is displayed : \"(.*)\"$")
    public void checkOutputMessage(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        config = new ConfigPage(driver);

        log.debug("Checking output message");
        config.checkOutputMessage(message);
        log.debug("Checked output message");
    }

    @Then("^transaction \"([^\"]*)\" is added to the list$")
    public void transaction_is_added_to_the_list(String transactionName) throws Throwable {
        config = new ConfigPage(driver);
        config.checkTransactionIsAdded(transactionName);
    }

    @Then("^The \"(.*)\" is removed from the list$")
    public void transaction_is_removed_from_the_list(String transactionName) throws Throwable {
        config = new ConfigPage(driver);
        config.checkTransactionIsRemoved(transactionName);
    }


    @After
    public void teardown() {

        driver.quit();
    }


}
