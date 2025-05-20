package Paruoštukas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage extends SignInPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    private By email = By.id("field-email");
    private By password = By.id("field-password");
    private By logout = By.cssSelector(".logout");
    private By SignInButton = By.id("submit-login");

    private void click(By locator) {
        driver.findElement(locator).click();
    }

    private void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }
    public void quickSignUp(String FirstName, String LastName, String Email, String Password, String BirthDate){

        SignInPage signinPage = new SignInPage(driver);
        signinPage.clickSignIn();
       signinPage.noAccountClick();
        signinPage.fillSignUpForm(FirstName, LastName, Email, Password, BirthDate);
    }
    public void login(String Email, String Password){
        SignInPage signinPage = new SignInPage(driver);
        signinPage.clickSignIn();
        type(email, Email );
        type(password, Password);
        click(SignInButton);

    }
    public void logout(){
        click(logout);
    }

}
