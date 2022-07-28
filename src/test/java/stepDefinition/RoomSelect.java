package stepDefinition;


import Elements.ChooseRoom;
import cucumber.TestContext;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

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


    @When("The User selects an available with description {string}")
    public void theUserSelectsAnAvailableWithDescription(String str) {
        WebElement selectingARoom;
        selectingARoom = driver.findElement(ChooseRoom.selectingARoom(str));
        selectingARoom.click();
    }
}
