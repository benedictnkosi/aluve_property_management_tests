package Elements;

import org.openqa.selenium.By;

public class RoomElements {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[contains(@id,'checkindate')]");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By todaysDate = By.xpath("//div[@class='calendar-table']/descendant::td[contains(@class,'today')]");
    public static By futureDate = By.xpath("//div[@class='calendar-table']/descendant::td[contains(@class,'available')]");
    public static By whatsAppPage = By.xpath("//span/a[@data-testid='whatsapp_www_header_logo_link']");
    public static By bestRooms = By.xpath("//div[contains(@class,'best-rooms')]");

    public static By dateVariable(String date) {
        return By.xpath("(//td[contains(@class,'available')])[" + date + "]");
    }

    public static By dateInvalid(String date) {
        return By.xpath("(//td[@class='off disabled'])[" + date + "]");
    }

    public static By topColumn(String topColumn) {
        return By.xpath("//div/descendant::li[contains(@class,'nav-item')]/child::a[text()='" + topColumn + "']");
    }

    public static By actionButton(String button) {
        return By.xpath("//div[contains(@class,'daterangepicker')]/descendant::button[text()='" + button + "']");
    }

}


