package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    By loggedInHeader = By.xpath("//li[@class='nav-item active']/following::a[text()='Home']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenHomePage() {
        ConfigFileReader configReader = new ConfigFileReader();
        driver.get(configReader.getApplicationUrl());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loggedInHeader));
    }
    public static By homePage = By.xpath("(//div[@class='banner-info']/descendant::h5[contains(text(),'Comfortable')])[2]");

}
