package Elements;

import org.openqa.selenium.By;

public class ContactUs {
    public static By sendkeysEmail = By.xpath("//div[contains(@class,'map-content')]//input[@placeholder='Email']");
    public static By sendkeysName = By.xpath("//div[contains(@class,'map-content')]//input[@placeholder='Name']");
    public static By sendkeysPhone = By.xpath("//div[contains(@class,'map-content')]//input[@placeholder='Phone Number']");
    public static By sendkeysMessage = By.xpath("//div[contains(@class,'map-content')]//*[@placeholder='Message']");
    public static By successMessage = By.xpath("//div[contains(@id,'success_message')]");

    public static By contactIcons(String icon) {
        return By.xpath("//div[@class='cont-details']/descendant::a[@id='contact_" + icon + "' and text()]");
    }

    public static By inputGuestDetails(String info) {
        return By.xpath("//div[contains(@class,'map-content')]//*[@placeholder='" + info + "']");
    }

    public static By submitButton(String submit) {
        return By.xpath("//div/following::button[text()='" + submit + "']");
    }
}
