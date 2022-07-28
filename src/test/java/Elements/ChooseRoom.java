package Elements;

import org.openqa.selenium.By;

public class ChooseRoom {

    public static By roomSelectBookNowButton = By.xpath("//div[contains(@class,'book-btn')]");

    public static By chooseRoom(String room) {
        return By.xpath("//div[@class='maghny-grid']/descendant::div[@class='room-info']//a[text()='" + room + "']");
    }

    public static By consentFormPage = By.xpath("//div[@class='booking-form-content']");

    public static By selectingARoom(String favRoom) {
        return By.xpath("//a[text()]/ancestor::div/descendant::a[contains(@class,'btn mt')][" + favRoom + "]");
    }


}