package Elements;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;

public class VariousElements {
    public static By previousMonth = By.xpath("//div[@class='drp-calendar left']//table/descendant::th[@class='prev available']");
    public static By nextMonth = By.xpath("//div[@class='drp-calendar right']//table/descendant::th[@class='next available']");
    public static By roomsInputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/descendant::input[@id='rooms_checkindate']");
    public static By mapVisible = By.xpath("//div[contains(@class,'footer')]/descendant::iframe");
    public static By selectRoom = By.xpath("//div[@class='booking-form-content']/descendant::div[@class='div-select-room-name']");
    public static By bookNowButton = By.xpath("//button[text()='Book Now']");
    public static By roomSelectBookNowButton = By.xpath("//div[@class='border-line']/descendant::a[text()='Book Now']");
    public static By backToRoomsColumn = By.xpath("//div[@class='border-line']/descendant::a/following::a[@class='back']");
    public static By displaySwitchPreviousButton = By.xpath("//div[@class='owl-nav']/button[@class='owl-prev']");
    public static By displaySwitchNextButton = By.xpath("//div[@class='owl-nav']/button[@class='owl-next']");
    public static By displayBookNowButton = By.xpath("//div[@class='banner-info-bg']/child::a[text()=' BOOK NOW']");
    public static By PageNotFound = By.xpath("//h1[text()='Not Found']");

    public static By inputTab(String inputTab) {
        return By.xpath("//div[@class='hny-frm_grid']/child::h5/following::input[contains(@placeholder,'" + inputTab + "')]");
    }

    public static By selectDate(DataTable dateStart) {
        return By.xpath("//div[@class='calendar-table']/descendant::td[contains(@class,'available') and text()='" + dateStart + "']");
    }

    public static By mapExpander(String mapExpand) {
        return By.xpath("//a[@aria-label='View larger map' and text()='" + mapExpand + "']");
    }

    public static By roomsDisplay(String roomFunctions) {
        return By.xpath("//div[@class='maghny-grid']/descendant::a[text()='" + roomFunctions + "']");
    }
}
