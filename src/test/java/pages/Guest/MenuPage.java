package pages.Guest;

import org.openqa.selenium.By;

public class MenuPage {
    public static By topMenu(String topMenu) {
        return By.xpath("//div/descendant::li[contains(@class,'nav-item')]/child::a[text()='" + topMenu + "']");
    }
}
