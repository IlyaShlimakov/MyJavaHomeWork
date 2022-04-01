
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private WebDriver driver;
    private static pages.LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ru/");
        WebDriver.Timeouts timeouts1 = driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
    }


    @Test
    public void LoginPageTest() {
        loginPage.enterLoginAndPass("testuser_q@mail.ru", "12345678igna");
        loginPage.clickEnterButton();
    }

}

