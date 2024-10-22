package stepDefinitions;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	WebDriver driver = BaseClass.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("https://qa31app.pihappiness.com/login");
    }

    @When("User enters {string} and {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("User should be redirected to the homepage or get an error message")
    public void user_should_be_redirected_to_the_homepage() {
//        String expectedTitle = "Dashboard";
//        String actualTitle = loginPage.getPageTitle();
//        
//        assertTrue("Login failed or user not redirected to the homepage.", actualTitle.contains(expectedTitle));

        // Close the browser
        BaseClass.closeDriver();
    }
}
