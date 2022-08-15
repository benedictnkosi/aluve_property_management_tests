package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BookNowPage;
import utils.SeleniumActions;

public class BookNowMenuLevelSteps {
    TestContext testContext;
    WebDriver driver;

    public BookNowMenuLevelSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @When("The user enters {string} in field {string}")
    public void theUserClicksTheInputGridForGuestInformationWithValueName(String inputGrid, String guestInfo) {
        WebElement guestInfoInput = driver.findElement(BookNowPage.GuestDetailInput(inputGrid));
        SeleniumActions.click(BookNowPage.GuestDetailInput(inputGrid), driver);
        guestInfoInput.sendKeys(guestInfo);

    }

    @Then("User validates that rooms tiles are displayed")
    public void userValidatesThatRoomsTilesAreDisplayed() {
        WebElement roomContainer = driver.findElement(BookNowPage.roomTile);
        Assert.assertTrue(roomContainer.isDisplayed());
    }

    @When("User clicks on the room select Add button")
    public void userClicksOnTheRoomSelectAddButton() {
        SeleniumActions.clickUntil(BookNowPage.nightsMessage, BookNowPage.selectRoomAddButton, driver);
    }


    @Then("User validates room has been added")
    public void userValidatesRoomHasBeenAdded() {
        WebElement roomAddedText = driver.findElement(BookNowPage.nightsMessage);
        Assert.assertTrue(roomAddedText.isDisplayed());
    }

    @When("The user checks the Terms & Conditions checkbox")
    public void theUserChecksTheTermsConditionsCheckbox() {
        SeleniumActions.click(BookNowPage.TermsConditionsCheckBox, driver);
    }

    @Then("User validates Terms & Conditions checkbox is selected")
    public void userValidatesTermsConditionsCheckboxIsSelected() {
        WebElement TermsConditionsChecked = driver.findElement(BookNowPage.TermsConditionsCheckBox);
        Assert.assertTrue(TermsConditionsChecked.isSelected());
    }

    @When("The user clicks on the book now button on the booking form page")
    public void theUserClicksOnTheBookNowButtonOnTheBookingFormPage() {
        SeleniumActions.click(BookNowPage.BookingFormBookNowButton, driver);
    }

    @Then("User validates booking is successful")
    public void userValidatesBookingIsSuccessful() {
    }
}

