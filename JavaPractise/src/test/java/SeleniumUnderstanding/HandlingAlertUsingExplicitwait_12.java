package SeleniumUnderstanding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


/*
Handling alert with the help of Explicit wait
//      WebElement firstAlert=   expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Alert']")));
          Alert myalert= expwait.until(ExpectedConditions.alertIsPresent());
//          myalert.dismiss();


Authentication Popup:-



 */

public class HandlingAlertUsingExplicitwait_12 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        WebDriverWait expwait= new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

//      WebElement firstAlert=   expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Alert']")));
   try{
       WebElement secondAlert= expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Confirm']")));
       secondAlert.click();
   }
   catch(Exception e ){
       System.out.println(e.getMessage());
   }

          Alert myalert= expwait.until(ExpectedConditions.alertIsPresent());

//          firstAlert.click();
//          myalert.dismiss();

        System.out.println("Second Alert clicked");
         Thread.sleep(5000);
         myalert.dismiss();



//          myalert.sendKeys();


    }
}
