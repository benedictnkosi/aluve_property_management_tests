package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }

    public static void clickUntil(By toBeDisplayed, By toClick, WebDriver driver) {
        int maxLoopCount = 0;
        while (!driver.findElement(toBeDisplayed).isDisplayed() && maxLoopCount < 5) {
            System.out.println("element is not displayed");
            maxLoopCount++;
            SeleniumActions.click(toClick, driver);
            try {
                if (driver.findElement(toBeDisplayed).isDisplayed()) {
                    System.out.println("element is displayed");
                    Thread.sleep(3000);
                } else {
                    System.out.println("element is not displayed");
                    Thread.sleep(3000);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void wait(By by, WebDriver driver) {
        WebDriverWait waitElement = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitElement.until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
    }
}
