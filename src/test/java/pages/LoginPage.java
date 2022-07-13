package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import java.time.Duration;


public class LoginPage {
    WebDriver driver;
    By password = By.id("secret");
    By loginButton = By.xpath("//button[@type=\"submit\"]");
    By loginPageHeader = By.xpath("//h2[@class='login-heading']");
    By loggedInHeader = By.xpath("//h1[text()='Guesthouse Management']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //set password in textbox
    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }

    //set password in textbox
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isUserLoggedIn() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(loggedInHeader));
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public void LoginUser(String password) {
        this.setPassword(password);
        this.clickLoginButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loggedInHeader));
    }

    public void OpenLoginPage() {
        ConfigFileReader configReader = new ConfigFileReader();
        driver.get(configReader.getApplicationUrl());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginPageHeader));
    }
}
