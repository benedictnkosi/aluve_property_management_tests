package pages;

import org.openqa.selenium.By;

public class Room_Elements {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[@id='rooms_checkindate']");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By invalidDate = By.xpath("(//div[@class='calendar-table']//td[contains(@class,'disabled')])[1]");
    public static By activeDate = By.xpath("//td[contains(@class,'active') or contains(@class,'available')]");
    public static By roomView = By.xpath("//div[contains(@class,'maghny-gd')]/descendant::h3[@class='room-title']");
    public static By dateVariable(String date) {
        return By.xpath("(//td[contains(@class,'available')])[" + date + "]");
    }
    public static By calendarButton(String button) {
        return By.xpath("//div[@class='drp-buttons']/button[text()='" + button + "']");
    }


}
