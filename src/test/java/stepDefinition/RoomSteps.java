package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RoomPage;
import utils.SeleniumActions;

public class RoomSteps {
    TestContext testContext;
    WebDriver driver;

    public RoomSteps(TestContext context) {
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

    @When("The User selects an available room with description {string}")
    public void the_User_selects_an_available_room_with_description(String favouriteRoom) {
        SeleniumActions.click(RoomPage.roomName(favouriteRoom), driver);
    }

    @Then("User validates that the selected room is open with description {string}")
    public void userValidatesThatTheSelectedRoomIsOpenWithDescription(String roomName) {
        SeleniumActions.waitForVisibility(RoomPage.roomHeader(roomName), driver);
        WebElement roomHeader = driver.findElement(RoomPage.roomHeader(roomName));
        Assert.assertTrue(roomHeader.isDisplayed());
    }

    @When("The user clicks on the book now button")
    public void theUserClicksOnTheBookNowButton() {
        SeleniumActions.click(RoomPage.RoomInnerBookNowButton, driver);
    }

    @When("The user clicks on the image of the room with the description {string}")
    public void theUserClicksOnTheImageFromTheRoomWithTheDescriptionFavouriteRoom(String image) {
        SeleniumActions.click(RoomPage.roomImage(image), driver);
    }

}
