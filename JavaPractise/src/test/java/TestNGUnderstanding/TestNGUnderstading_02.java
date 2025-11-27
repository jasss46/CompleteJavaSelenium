package TestNGUnderstanding;


import net.bytebuddy.build.Plugin;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.lang.management.ThreadInfo;

/*

1.Open app
2.test logo presence
3.login
4 close
 */
public class TestNGUnderstading_02 {
    WebDriver driver;
    WebDriverWait wait;

    @Test(priority=1)
    void openApp(){
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

    }
    @Test(priority=2)
    void testLogoPresence() throws InterruptedException {
        Thread.sleep(3000);
       Boolean logo= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Check if the logo is displayed:"+ logo);

    }
    @Test(priority=3)
    void login() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @Test(priority=4)
    void close(){
        driver.quit();

    }
}
