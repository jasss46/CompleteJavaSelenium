package SeleniumUnderstanding;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingAlertsAndPopupUnderstanding_11 {

    /*
    Alert is now WebElement

    There are three types of Alerts:
    1. Normal Alert

    2.Confirmation Alert
                                              driver.switchTo().alert().accept();  --This will click on ok
                                              driver.switchTo().alert().dismiss(); --This will click on cancel
    3.Prompt Alert

    We can also denote Alert as
            Alert myalert=  driver.switchTo().alert();
            myalert.sendkeys();
            myalert.accept();
            driver.switchTo().alert().sendKeys("jaswinder singh");



     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



//Normal Alert
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert myalert=  driver.switchTo().alert();
//        System.out.println(myalert.getText());
//         myalert.dismiss();

         //Confirmation Alert
//                 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//              driver.switchTo().alert().accept();
//             driver.switchTo().alert().dismiss();

          //Prompt Alert
        WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement thirdAlert= expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click for JS Prompt']")));
        thirdAlert.click();

        driver.switchTo().alert().sendKeys("jaswinder singh");
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.close();

    }
}
