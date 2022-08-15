package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RoomPage;

public class RoomsAreDisplayedSteps {
    TestContext testContext;
    WebDriver driver;

    public RoomsAreDisplayedSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }


    @Then("User validates that rooms are displayed")
    public void userValidatesThatRoomsAreDisplayed() {
        WebElement roomView = driver.findElement(RoomPage.roomContainer);
        Assert.assertTrue(roomView.isDisplayed());
    }


}
