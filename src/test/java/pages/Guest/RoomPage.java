package pages.Guest;

import org.openqa.selenium.By;

public class RoomPage {

    public static By roomContainer = By.xpath("//div[contains(@class,'maghny-gd')]");
    public static By roomPageHeading = By.xpath("//h2[text()='Rooms']");

    public static By roomName(String room) {
        return By.xpath("//div[@class='maghny-grid']/descendant::div[@class='room-info']//a[text()='" + room + "']");
    }

    public static By roomHeader(String favRoom) {
        return By.xpath("//*[@class='room-single-block']/descendant::*[@id='room_name' and text()='" + favRoom + "']");
    }
    public static By RoomInnerBookNowButton = By.xpath("//div[@class='container']/descendant::div[contains(@class,'book-btn')]/child::a[text()='Book Now']");
    public static By roomImage(String roomDescription) {
        return By.xpath("//a[text()='" + roomDescription + "']/ancestor::div/ancestor::div[@class='maghny-grid']/descendant::figcaption/preceding-sibling::img/parent::figure");
    }
}
