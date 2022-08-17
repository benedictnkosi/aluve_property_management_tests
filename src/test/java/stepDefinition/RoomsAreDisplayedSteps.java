package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement roomContainer = driver.findElement(RoomPage.roomContainer);
        Assert.assertTrue(roomContainer.isDisplayed());
    }

    @Then("User validates that Rooms page is open")
    public void userValidatesThatRoomsPageIsOpen() {
        SeleniumActions.waitForVisibility(RoomPage.roomPageHeading, driver);
        WebElement roomPageHeading = driver.findElement(RoomPage.roomPageHeading);
        Assert.assertTrue(roomPageHeading.isDisplayed());
    }
}
