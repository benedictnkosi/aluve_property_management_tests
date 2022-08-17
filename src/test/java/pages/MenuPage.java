package pages;

import org.openqa.selenium.By;

public class MenuPage {
    public static By topMenu(String topMenu) {
        return By.xpath("//div/descendant::li[contains(@class,'nav-item')]/child::a[text()='" + topMenu + "']");
    }

    public static By ContactUsHeading = By.xpath("//h2[text()='Contact Us']");
    public static By homePage = By.xpath("(//div[@class='banner-info']/descendant::h5[contains(text(),'Comfortable')])[2]");

}
