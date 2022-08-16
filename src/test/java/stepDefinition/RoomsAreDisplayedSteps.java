package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.RoomPage;
import utils.SeleniumActions;

public class RoomsAreDisplayedSteps {
    TestContext testContext;
    WebDriver driver;

    public RoomsAreDisplayedSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }


    @Then("User validates that rooms are displayed")
    public void userValidatesThatRoomsAreDisplayed() {
        SeleniumActions.waitForVisibility(RoomPage.roomContainer, driver);
    }

    @Then("User validates that Rooms page is open")
    public void userValidatesThatRoomsPageIsOpen() {
        SeleniumActions.waitForVisibility(RoomPage.roomPageHeading, driver);
    }
}
