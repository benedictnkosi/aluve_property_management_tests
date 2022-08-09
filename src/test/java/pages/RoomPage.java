package pages;

import org.openqa.selenium.By;

public class RoomPage {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[@id='rooms_checkindate']");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By invalidDate = By.xpath("(//div[@class='calendar-table']//td[contains(@class,'disabled')])[1]");
    public static By activeDate = By.xpath("//td[contains(@class,'active') or contains(@class,'available')]");
    public static By roomView = By.xpath("//div[contains(@class,'maghny-gd')]");

    public static By dateVariable(String date) {
        return By.xpath("(//td[contains(@class,'available')])[" + date + "]");
    }

    public static By calendarButton(String button) {
        return By.xpath("//div[@class='drp-buttons']/button[text()='" + button + "']");
    }

    public static By roomPageIsVisible = By.xpath("//h2[text()='Rooms']");

    public static By clickRoomName(String room) {
        return By.xpath("//div[@class='maghny-grid']/descendant::div[@class='room-info']//a[text()='" + room + "']");
    }

    public static By roomHeader(String favRoom) {
        return By.xpath("//*[@class='room-single-block']/descendant::*[@id='room_name' and text()='" + favRoom + "']");
    }
}
