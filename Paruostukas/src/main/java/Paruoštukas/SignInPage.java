package Paruoštukas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage  {
    WebDriver driver;


    public SignInPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    private By signInButton = By.cssSelector(".user-info > a:nth-child(1)");
    private By noAccountLink = By.className("no-account");
    private By selectGender = By.id("field-id_gender-1");
    private By firstName = By.id("field-firstname");
    private By lastName = By.id("field-lastname");
    private By email = By.id("field-email");
    private By password = By.id("field-password");
    private By birthDate = By.id("field-birthday");
    private By acceptTerms = By.name("psgdpr");
    private By customerPrivacy = By.name("customer_privacy");
    private By signUpButton = By.cssSelector(".btn.btn-primary.form-control-submit.float-xs-right");


    public void clickSignIn() {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(signInButton));
        click(signInButton);
    }

    public void noAccountClick() {
        click(noAccountLink);
    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }

    private void type(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void fillSignUpForm(String FirstName, String LastName, String Email, String Password, String BirthDate) {
        click(selectGender);
        type(firstName, FirstName);
        type(lastName, LastName);
        type(email, Email);
        type(password, Password);
        type(birthDate, BirthDate);
        click(acceptTerms);
        click(customerPrivacy);
        click(signUpButton);
    }

}