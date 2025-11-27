package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitCommandsUnderstanding_8 {

    /*
    Synchronization

    There are two types of waits used in Selenium
    1. Implicit wait        Implicit wait is applicable to all the elements in the test script
          Syntax Implicit Wait -->        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

    ADVANTAGES- 1.Single time one statement
                2.It will not wait till the maximum time if the element is available
                3. Applicable for all elements.
                4. Easy to USE.

     Disadvantage- If the time is not sufficient then you will get exception.

    2. Explicit wait        Explicit wait is applicable to specific element only
      declaration
      use
             1.Conditional based, it will work more effectively.
             2.finding elements is inclusive(for some conditions)
             3. It will wait for the condition to be true then consider the time
             4. we need to write multiple statements for multiple elements.
     */

    public static void main(String[] args) {
//        WebDriver driver= new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
//
//        driver.get("https://thriveagency-nov.flywheelsites.com/contact/");
//        driver.manage().window().maximize();
//
//        driver.findElement(By.xpath("//input[@id=\"input_100_1_3\"]")).sendKeys("Jaswinder");
//        System.out.println("First name entered");
//
//        driver.findElement(By.xpath("//input[@id=\"input_100_1_6\"]")).sendKeys("singh");
//        System.out.println("last  name entered");
//
//        driver.findElement(By.xpath("//input[@id=\"input_100_11\"]")).sendKeys("testing");
//        System.out.println("company nam  name entered");
//
//        driver.close();

         WebDriver driver= new ChromeDriver();
       WebDriverWait expwait= new WebDriverWait(driver,Duration.ofSeconds(50));
            WebElement newOne=  expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
                    newOne.click();



    }
}
