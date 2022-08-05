package Elements;

import org.openqa.selenium.By;

public class RoomDisplayed_Elements {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[@id='rooms_checkindate']");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By todayDate = By.xpath("//div[@class='calendar-table']/descendant::td[contains(@class,'today')]");
    public static By futureDate = By.xpath("//div[@class='calendar-table']/descendant::td[contains(@class,'available')]");
    public static By whatsAppPage = By.xpath("//span/a[@data-testid='whatsapp_www_header_logo_link']");
    public static By invalidDate = By.xpath("(//div[@class='calendar-table']//td[contains(@class,'disabled')])[1]");

    public static By topColumn(String topColumn) {
        return By.xpath("//div/descendant::li[contains(@class,'nav-item')]/child::a[text()='" + topColumn + "']");
    }

    public static By actionButton(String button) {
        return By.xpath("//div[@class='drp-buttons']/button[text()='" + button + "']");
    }

    public static By dateVariable(String date) {
        return By.xpath("(//td[contains(@class,'available')])[" + date + "]");
    }
}
