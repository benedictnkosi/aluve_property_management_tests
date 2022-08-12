package pages;

import org.openqa.selenium.By;

public class RoomPage {

    public static By roomContainer = By.xpath("//div[contains(@class,'maghny-gd')]");

    public static By dateVariable(String date) {
        return By.xpath("(//td[contains(@class,'available')])[" + date + "]");
    }

    public static By calendarButton(String button) {
        return By.xpath("//div[@class='drp-buttons']/button[text()='" + button + "']");
    }

    public static By roomPageHeading = By.xpath("//h2[text()='Rooms']");

    public static By roomName(String room) {
        return By.xpath("//div[@class='maghny-grid']/descendant::div[@class='room-info']//a[text()='" + room + "']");
    }

    public static By roomHeader(String favRoom) {
        return By.xpath("//*[@class='room-single-block']/descendant::*[@id='room_name' and text()='" + favRoom + "']");
    }
}
