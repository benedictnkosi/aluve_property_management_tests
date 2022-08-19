package pages.Guest;

import org.openqa.selenium.By;

public class CommonPage {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[contains(@id,'checkindate')]");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By disabledDate = By.xpath("(//div[@class='calendar-table']//td[contains(@class,'disabled')])[1]");
    public static By dateVariable(String date) {
        return By.xpath("(//td[contains(@class,'available')])[" + date + "]");
    }
    public static By calendarButton(String button) {
        return By.xpath("//div[@class='drp-buttons']/button[text()='" + button + "']");
    }

}
