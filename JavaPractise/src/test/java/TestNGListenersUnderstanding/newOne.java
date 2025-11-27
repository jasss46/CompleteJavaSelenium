package Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
@Listeners({TestNGListenersUnderstanding.MyListener.class})


public class newOne {
    WebDriver driver;
    @BeforeClass
    void webPage() {
        driver = new ChromeDriver();
        driver.get("https://thriveagency.com/contact/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Test(priority = 1)
    void selectingAllCheckBoxes() {
        List<WebElement> allckbx = driver.findElements(By.xpath(""));
    }

    @Test(priority = 2)
    void testTitle() {
        Assert.assertEquals(driver.getTitle(), "Contact Thrive Internet Marketing Agency | Request More Information");
    }

    @Test(priority= 3)
    void logoVerification(){
        boolean logo= driver.findElement(By.xpath("//p[@itemprop=\"headline\"]//a[@aria-label=\"Thrive Logo\"]")).isDisplayed();
        System.out.println(logo);
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }


}
