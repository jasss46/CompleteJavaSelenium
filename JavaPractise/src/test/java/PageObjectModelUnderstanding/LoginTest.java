package PageObjectModelUnderstanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners({TestNGListenersUnderstanding.MyListener.class})


public class LoginTest {
    WebDriver driver;
    @BeforeClass
    void setUP(){
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }
    @Test
    void login() throws InterruptedException {
        LoginPage2 lp= new LoginPage2(driver);
        Thread.sleep(2000);
        lp.setUsername("Admin");
        Thread.sleep(2000);
        lp.setPassword("admin123");
        lp.clickLogin();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

    }

    @AfterClass
    void teardown(){
driver.quit();
    }
}
