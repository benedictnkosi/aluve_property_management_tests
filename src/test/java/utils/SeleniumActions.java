package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumActions {
    public static void click(By by, WebDriver driver) {
        boolean isClicked = false;
        int count = 0;
        while (!isClicked && count < 5) {
            try {
                count++;
                driver.findElement(by).click();
                isClicked = true;
            } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
                System.out.println("Can't find it man " + e.getMessage());
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            }
        }
    }
}
