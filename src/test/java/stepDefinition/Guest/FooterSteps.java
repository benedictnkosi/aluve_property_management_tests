package stepDefinition.Guest;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Guest.FooterPage;
import utils.SeleniumActions;

import java.util.ArrayList;

public class FooterSteps {
    TestContext testContext;
    WebDriver driver;

    public FooterSteps(TestContext context) {
        testContext = context;
        driver = testContext.getWebDriverManager().getDriver();
    }

    @When("User clicks on the footer icon with value {string}")
    public void userClicksOnTheFooterIconWithValuePhone(String contactIcon) {
        SeleniumActions.click(FooterPage.footerContactIcons(contactIcon), driver);
    }

    @Then("User validates WhatsApp page is open and displayed")
    public void userValidatesWhatsAppPageIsOpen() {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));
        driver.switchTo().window(tabs2.get(1));
        WebElement whatsAppVisible = driver.findElement(FooterPage.whatsappPage);
        Assert.assertTrue(whatsAppVisible.isDisplayed());
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @When("User clicks footer link with value {string}")
    public void userClicksFooterLinkWithValueRooms(String link) {
        SeleniumActions.click(FooterPage.footerMenuLinks(link), driver);
    }


}


