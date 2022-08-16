package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
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
        SeleniumActions.click(RoomPage.roomName(favouriteRoom), driver);
    }

    @Then("User validates that the selected room is open with description {string}")
    public void userValidatesThatTheSelectedRoomIsOpenWithDescription(String roomName) {
        SeleniumActions.waitForVisibility(RoomPage.roomHeader(roomName), driver);
    }

    @When("The user clicks on the book now button")
    public void theUserClicksOnTheBookNowButton() {
        SeleniumActions.click(RoomPage.RoomInnerBookNowButton, driver);
    }

}

