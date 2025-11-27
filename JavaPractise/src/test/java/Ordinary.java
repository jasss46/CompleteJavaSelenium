import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.SQLOutput;
import java.time.Duration;

public class Ordinary {
    public static WebDriver  driver;
    public static WebDriverWait wait;


    @BeforeClass
    public void browserSetup(){
        driver= new ChromeDriver();
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
       driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }


    @Test(enabled = false)
    public void alertHandling() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"alertBtn\"]"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.alertIsPresent()).accept();  //By using explicit wait
    }

    @Test(enabled = false)
    public void Iframes() throws InterruptedException {
//        To run this comment the website URL in base class
        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement frame1= driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
//         driver.switchTo().frame(frame1);
//
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"mytext1\"]"))).sendKeys("Jaswinder Singh");
//          Thread.sleep(2000);
//          driver.switchTo().defaultContent();
//          WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
//          driver.switchTo().frame(frame2);
//
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"mytext2\"]"))).sendKeys("nice one");

          //Using Explicit wait

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"mytext1\"]"))).sendKeys("Jaswinder Singh");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        //inner frame
        driver.switchTo().frame(0); // switching to frame by using index value
        Thread.sleep(5000);



    }

    @Test(priority = 1)
    public void staticAndDynamicTable(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
     int rows=  driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();  //read all rows
     int columns= driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size(); //read all columns
//        System.out.println(rows+" "+columns);

//        WebElement name= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[2]"));//read specific text
//        System.out.println(name.getText());


        //read all rows and columns

        for( int r=2; r<=rows;r++){
            for( int c=1; c<=columns;c++){
                String value= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
                System.out.println(value);
            }
            System.out.println();
        }
    }


@AfterClass
    public void tearDown(){
        driver.quit();
    }

}
