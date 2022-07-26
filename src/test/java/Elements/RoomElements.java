package Elements;

import org.openqa.selenium.By;

public class RoomElements {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[contains(@id,'checkindate')]");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By todaysDate = By.xpath("//div[@class='calendar-table']/descendant::td[contains(@class,'today')]");
    public static By futureDate = By.xpath("//div[@class='calendar-table']/descendant::td[contains(@class,'available')]");
    public static By whatsAppPage = By.xpath("//span/a[@data-testid='whatsapp_www_header_logo_link']");

    public static By topColumn(String topColumn) {
        return By.xpath("//div/descendant::li[contains(@class,'nav-item')]/child::a[text()='" + topColumn + "']");
    }

    public static By actionButton(String button) {
        return By.xpath("//div[@class='drp-buttons']/button[text()='" + button + "']");
    }

    public static By footerIcons(String FooterIcon) {
        return By.xpath("//h6[text()='Contact Details']/parent::div[contains(@class,'footer')]/descendant::span[contains(@class,'" + FooterIcon + "')]");
    }

    public static By footPage(String footerPage) {
        return By.xpath("//div[contains(@class,'footer')]/descendant::li/child::a[text()='" + footerPage + "']");
    }

    public static By footerPageConfirm(String footer) {
        return By.xpath("//div[contains(@class,'container')]/descendant::*[text()='" + footer + "']");
    }
}


