package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for username, password, and login button
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//button[text()='Login']");

    // Actions for the login page
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    // Additional methods can be added here for page validation
    public String getPageTitle() {
        return driver.getTitle();
    }

}
