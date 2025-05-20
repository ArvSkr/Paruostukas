import Paruoštukas.LoginPage;
import Paruoštukas.SignInPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrestaShopTest extends BaseTest {

    private SignInPage signInPage;
    private LoginPage loginPage;

    @Test
    public void SignUpTest() {
        signInPage = new SignInPage(driver);
        signInPage.clickSignIn();
        signInPage.noAccountClick();
        signInPage.fillSignUpForm("Jack", "Ripper", "jack.ripper1@gmail.com", "JackRipper123", "2005-12-12");
       String currenturl = driver.getCurrentUrl();
        assertEquals("http://192.168.91.67/", currenturl, "nuh uh");
    }
    @Test
    public void loginLogoutTest(){
        loginPage = new LoginPage(driver);
        loginPage.quickSignUp("Batman", "BAtman", "batman3@bruce.com", "BruceWayne9000", "1998-12-04");
        loginPage.logout();
        loginPage.login("batman3@bruce.com", "BruceWayne9000");
        String username = driver.findElement(By.cssSelector(".account > span:nth-child(2)")).getText();
        assertEquals("Batman BAtman", username);
    }
}
