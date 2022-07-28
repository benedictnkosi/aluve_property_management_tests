package stepDefinition;


import Elements.ChooseRoom;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;
import utils.SeleniumActions;

public class RoomSelect {

    TestContext testContext;
    WebDriver driver;
    ConfigFileReader configReader;
    PageObjectManager pageObjectManager;
    WebDriverWait wait;


    public RoomSelect(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
        configReader = testContext.getConfigFileReader();
        pageObjectManager = testContext.getPageObjectManager();
    }


    @When("The User selects an available room {string}")
    public void theUserSelectsAnAvailableWithDescription(String str) throws InterruptedException {
        WebElement selectingARoom;
        selectingARoom = driver.findElement(ChooseRoom.selectingARoom(str));
        SeleniumActions.click(ChooseRoom.selectingARoom(str), driver);
    }


    @Then("User validates Book Now consent page is visible")
    public void userValidatesBookNowPageIsVisible() {
        driver.findElement(ChooseRoom.consentFormPage).isDisplayed();
    }

    @And("Returns to previous page")
    public void returnsToPreviousPage() {
        driver.navigate().back();
    }

    @When("The User selects an available room with description {string}")
    public void theUserSelectsAnAvailableRoomWithDescription(String str) {
        WebElement selectingARoom = driver.findElement(ChooseRoom.chooseRoom(str));
        try {
            SeleniumActions.click(ChooseRoom.chooseRoom(str), driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("User clicks on the inner Book Now button")
    public void userClicksOnTheInnerBookNowButton() {
        try {
            SeleniumActions.click(ChooseRoom.roomSelectBookNowButton, driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
