package pages;

import org.openqa.selenium.By;

public class ContactUsPage {
    public static By ContactUsHeading = By.xpath("//h2[text()='Contact Us']");
    public static By contactNumber = By.xpath("//div[@class='cont-details']/descendant::p//a[@id='contact_number']");
    public static By contactMail = By.xpath("//div[@class='cont-details']/descendant::p//a[@id='contact_email']");
    public static By sendMessageButton = By.xpath("//form/descendant::button[contains(@class,'contact')]");

    public static By sendMessageFormInput(String personalInfo) {
        return By.xpath("//form/descendant::input[@placeholder='" + personalInfo + "']");
    }
}
