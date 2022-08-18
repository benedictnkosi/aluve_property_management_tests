package pages;

import org.openqa.selenium.By;

public class FooterPage {
    public static By whatsappPage = By.xpath("(//img[@alt='WhatsApp Main Page'])[1]");
    public static By footerContactIcons(String contactIcon) {
        return By.xpath("//div[contains(@class,'footer')]/descendant::li/child::a//span[contains(@class,'" + contactIcon + "')]");
    }
    public static By footerMenuLinks(String footerLink) {
        return By.xpath("//div[contains(@class,'footer')]/descendant::a[text()='" + footerLink + "']");
    }
    public static By termsAndConditions = By.xpath("//div[contains(@class,'roomsingle')]/child::h3[text()='Terms And Conditions']");
}


