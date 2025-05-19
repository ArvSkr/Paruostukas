import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public abstract class BaseTest {
    protected WebDriver driver;


    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.prestashop.com/#/en/front");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}