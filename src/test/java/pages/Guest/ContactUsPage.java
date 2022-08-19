package pages.Guest;

import org.openqa.selenium.By;

public class ContactUsPage {
    public static By ContactUsHeading = By.xpath("//h2[text()='Contact Us']");
    public static By sendMessageButton = By.xpath("//form/descendant::button[contains(@class,'contact')]");
    public static By successMessageDisplay = By.xpath("//div[contains(@id,'success')]");
    public static By sendMessageFormInput(String placeHolder) {
        return By.xpath("//form/descendant::*[@placeholder='" + placeHolder + "']");
    }
}
