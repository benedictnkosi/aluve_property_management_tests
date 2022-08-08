package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RoomElements;
import utils.SeleniumActions;

import static pages.RoomElements.chooseRoom;

public class SelectARoom {

    TestContext testContext;
    WebDriver driver;

    public SelectARoom(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @When("The User selects an available room with description {string}")
    public void the_User_selects_an_available_room_with_description(String string) {
        try {
            SeleniumActions.click(chooseRoom(string), driver);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("User validates that the selected room is open with description {string}")
    public void userValidatesThatTheSelectedRoomIsOpenWithDescriptionSpaciousDoubleRoom(String roomOpen) {
        WebElement roomIsDisplayed = driver.findElement(RoomElements.openRoom(roomOpen));
        Assert.assertTrue(roomIsDisplayed.isDisplayed());

    }
}

