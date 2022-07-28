package Elements;

import org.openqa.selenium.By;

public class ChooseRoom {

    public static By roomSelectBookNowButton = By.xpath("//div[@class='border-line']/descendant::a[text()='Book Now']");

    public static By chooseRoom(String room) {
        return By.xpath("//div[@class='maghny-grid']/descendant::div[@class='room-info']//a[text()='" + room + "']");
    }

    public static By selectingARoom(String favRoom) {
        return By.xpath("//a[contains(@class,'btn mt')] /ancestor::div/descendant:: a[text()='" + favRoom + "']");
    }
}