package Elements;

import org.openqa.selenium.By;

public class RoomDisplayed_Elements {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[@id='rooms_checkindate']");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By invalidDate = By.xpath("(//div[@class='calendar-table']//td[contains(@class,'disabled')])[1]");

    public static By topMenu(String topMenu) {
        return By.xpath("//div/descendant::li[contains(@class,'nav-item')]/child::a[text()='" + topMenu + "']");
    }

    public static By actionButton(String button) {
        return By.xpath("//div[@class='drp-buttons']/button[text()='" + button + "']");
    }

    public static By dateVariable(String date) {
        return By.xpath("(//td[contains(@class,'available')])[" + date + "]");
    }
}
