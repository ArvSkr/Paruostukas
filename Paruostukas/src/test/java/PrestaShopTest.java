import Paruoštukas.SignInPage;
import org.junit.jupiter.api.Test;

public class PrestaShopTest extends BaseTest {

    private SignInPage signInPage;

    @Test
    public void SignUpTest() {
        signInPage = new SignInPage(driver);
        signInPage.clickSignIn();
        signInPage.noAccountClick();
        signInPage.fillSignUpForm("Jack", "Ripper", "jack.ripper@gmail.com", "JackRipper123", "2005-12-12");
    }
}
