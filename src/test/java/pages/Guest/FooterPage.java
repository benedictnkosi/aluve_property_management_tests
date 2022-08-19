package pages.Guest;

import org.openqa.selenium.By;

public class FooterPage {
    public static By whatsappPage = By.xpath("(//img[@alt='WhatsApp Main Page'])[1]");
    public static By footerContactIcons(String contactIcon) {
        return By.xpath("//div[contains(@class,'footer')]/descendant::li/child::a//span[contains(@class,'" + contactIcon + "')]");
    }
    public static By footerMenuLinks(String footerLink) {
        return By.xpath("//div[contains(@class,'footer')]/descendant::a[text()='" + footerLink + "']");
    }

}



