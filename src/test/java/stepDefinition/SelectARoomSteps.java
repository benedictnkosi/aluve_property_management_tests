package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RoomPage;
import utils.SeleniumActions;



public class SelectARoomSteps {

    TestContext testContext;
    WebDriver driver;

    public SelectARoomSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @When("The User selects an available room with description {string}")
    public void the_User_selects_an_available_room_with_description(String favouriteRoom) {
        SeleniumActions.click(RoomPage.clickRoomName(favouriteRoom), driver);
    }

    @Then("User validates that the selected room is open with description {string}")
    public void userValidatesThatTheSelectedRoomIsOpenWithDescriptionSpaciousDoubleRoom(String roomName) {
        WebElement openedRoomHeader = driver.findElement(RoomPage.roomHeader(roomName));
        Assert.assertTrue(openedRoomHeader.isDisplayed());
    }
}
