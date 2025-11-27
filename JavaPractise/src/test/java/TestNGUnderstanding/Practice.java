package TestNGUnderstanding;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Practice {
    WebDriver driver;
    WebDriverWait wait;
    Actions act;

    @Test(enabled = false)
    void titleVerification() {
        driver = new ChromeDriver();
        driver.get("https://thriveagency.com/digital-marketing-services/online-reputation-management/");
        driver.manage().window().maximize();
        String expected_Title = "Custom Online Reputation Management (ORM) Services";
        String actual_title = driver.getTitle();
        if (actual_title.equals(expected_Title)) {
            System.out.println("testCase Passed");
        }
    }

    @Test(enabled = false)
    void hoverAction() {
        WebElement Local = driver.findElement(By.xpath("//span[text()='Local']"));
        act = new Actions(driver);
        act.moveToElement(Local).build().perform();
        System.out.println("Action performed");
    }

    @Test(priority = 1)
    void checkBoxes() {
        driver = new ChromeDriver();
        driver.get("https://thriveagency.com/contact/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type=\"checkbox\" and @value=\"SEO\"]")).click();
        System.out.println("Seo Checkbox selected");
    }

    @Test(priority = 2)
    void selectAllCheckBoxes() throws InterruptedException {
        Thread.sleep(3000);
       try {
           List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//ul[@class=\"gfield_checkbox\"]//input"));
           for (int i = 0; i < allCheckBoxes.size()-1; i++) {
               Thread.sleep(1000);
               allCheckBoxes.get(i).click();
               System.out.println(allCheckBoxes.get(i).getAttribute("value"));
           }
       }
        catch(Exception e){
               System.out.println(e.getMessage());
           }
       finally {
           driver.quit();
       }
        }


    @Test(priority = 3)
    void thirdOne() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Jaswinder Singh");
        System.out.println("first statement printed");
         driver.switchTo().defaultContent();
         Thread.sleep(2000);
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("Automation tester");
        System.out.println("second statement printed");
        driver.quit();

    }
}
