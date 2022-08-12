package pages;

import org.openqa.selenium.By;

public class BookNowPage {
    public static By BookingForm = By.xpath("//div[@class='booking-form-content']");
    public static By dateSelectorInput = By.xpath("//div[@class='hny-frm_grid']//input[contains(@class,'date-picker')]");
    public static By selectRoomAddButton = By.xpath("(//div[contains(@class,'select-room')]/child::button[text()='Add'])[1]");
    public static By selectRoomRemoveButton = By.xpath("(//div[contains(@class,'select-room')]/child::button[text()='Remove'])[1]");
    public static By roomTile = By.xpath("//div[contains(@class,'select-room')]");
    public static By nightsMessage = By.xpath("//div[@class='hny-frm_grid']//p[@id='nights_message']");
    public static By TermsConditionsCheckBox = By.xpath("//input[@value='accept_terms']");
    public static By BookingFormBookNowButton = By.xpath("//button[text()='Book Now']");

    public static By GuestDetailInput(String GuestInfo) {
        return By.xpath("//div[@class='hny-frm_grid']//input[@placeholder='" + GuestInfo + "']");
    }

}
