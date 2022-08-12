package pages;

import org.openqa.selenium.By;

public class CommonPage {
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[contains(@id,'checkindate')]");
    public static By calendarTable = By.xpath("//div[@class='calendar-table']");
    public static By disabledDate = By.xpath("(//div[@class='calendar-table']//td[contains(@class,'disabled')])[1]");
}
