package SeleniumUnderstanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverConditionalMethodsUnderstanding_7 {
     /*
   2. Conditional methods- access these commands through Webelement
     returns boolean value(true/false)
      isDisplayed()    we can check the display status of the element
      isEnabled()      we can check enable/disable status of the element
      isSelected()     we can use to check the element is selected or not


3. Browser methods-
     close()
     quit()
     */

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://thriveagency-nov.flywheelsites.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)); //Implicit wait

//        try{
//            //isDisplayed()
//            WebElement logo= driver.findElement(By.xpath("//img[contains(@alt,'svg+xml;nitro-empty-id=MTk0NToxMDY=-1')]"));
//            System.out.println(logo.isDisplayed());
//
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        //isEnabled()
//        driver.get("https://thriveagency-nov.flywheelsites.com/contact/");
//        boolean button= driver.findElement(By.xpath("//span[@id=\"input_100_1_3_container\"]//input[@placeholder=\"First Name*\"]")).isEnabled();
//        System.out.println(button);

        //isSelected()
//        try{
//            driver.get("https://thriveagency-nov.flywheelsites.com/contact/");
//            driver.findElement(By.id("choice_100_53_1")).click();
//            Thread.sleep(2000);
//            WebElement seoButton= driver.findElement(By.id("choice_100_53_1"));
//            System.out.println(seoButton.isSelected());
//
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }

         driver.close();  //this will close the window where the driver is focused
         driver.quit();   //this will close all the windows of the browser


    }
}
