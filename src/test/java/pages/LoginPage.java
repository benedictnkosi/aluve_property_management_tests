package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigFileReader;

import java.time.Duration;


public class LoginPage {
    WebDriver driver;
    By email = By.xpath("//input[@placeholder='Email']");
    By password = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//input[@type=\"submit\"]");
    By loginPageHeader = By.xpath("//h1[text()='Log In Page']");
    By loggedInHeader = By.xpath("//div[@class='profile-top']/descendant::h5[text()='Calendar']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String strEmail) {
        driver.findElement(email).sendKeys(strEmail);
    }

    //set password in text-box
    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }

    //set password in text-box
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
