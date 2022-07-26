package Elements;

import org.openqa.selenium.By;

public class BookNowElements {
    public static By bookNowButton = By.xpath("//button[text()='Book Now']");
    public static By inputDate = By.xpath("//div[@class='hny-frm_grid']/child::span/input[@id='checkindate']");

    public static By inputTab(String inputTab) {
        return By.xpath("//div[@class='hny-frm_grid']/child::h5/following::input[contains(@placeholder,'" + inputTab + "')]");
    }
}
