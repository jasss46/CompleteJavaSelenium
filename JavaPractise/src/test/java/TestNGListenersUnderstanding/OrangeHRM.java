package TestNGListenersUnderstanding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.time.Duration;

@Listeners({TestNGListenersUnderstanding.MyListener.class})
public class OrangeHRM {
    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    void testLogo() {
        boolean status = driver.findElement(By.xpath("//img[@alt=\"OrangeHRM Logo\"]")).isDisplayed();
        Assert.assertTrue(status);
    }
    @Test(priority = 2)
    void testAppURL() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://wfww.orangehrm.com/");
    }
    @Test(priority = 3, dependsOnMethods = {"testAppURL"})
    void testHomePageTitle() {
        Assert.assertEquals(driver.getTitle(), "Human Resources Management Software | OrangeHRM HR Software ");
    }
    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
