package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FrameAndIFrameUnderstanding_13 {

    /*
    Iframes/frames

      driver.switchTo().frame(name);
      driver.switchTo().frame(id);
      driver.switchTo().frame(WebElement);

      Steps: first step firstly we will enter to one frame.
      Then we will come out from that frame and navigate to the page

          driver.switchTo().defaultContent(); --->This will help to come out from the page

          Switching to frame inside frame
                  driver.switchTo().frame(0); // switching to frame by using index value



      Then we can switch to another frame
      NOTE:- We cannot switch from one frame to other frame

      3 Types of Switching methods:
      1.Browser windows
      2.Alerts
      3. Frames


     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://ui.vision/demo/webtest/frames/");
        WebDriverWait expwait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();


      //Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
        driver.switchTo().frame(frame1);

       driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Jaswinder Singh");
       Thread.sleep(3000);

        driver.switchTo().defaultContent();
       //Frame 2
        WebElement frame2= driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
        driver.switchTo().frame(frame2);

       driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Automation Tester");
       driver.switchTo().defaultContent();



       //Frame 4
        WebElement frame4= driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
        driver.switchTo().frame(frame4);

        driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("Keen Automation Tester");

        driver.switchTo().defaultContent();

        //Frame 5
        WebElement frame5= driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//input[@name=\"mytext5\"]")).sendKeys(" Automation Tester");
        driver.switchTo().defaultContent();

        //Frame 3 frame contains other iframe
        WebElement frame3= driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Final understanding of frames");


        //inner frame
        driver.switchTo().frame(0); // switching to frame by using index value
        Thread.sleep(5000);

List<WebElement> radiobutton= driver.findElements(By.xpath("//div[@class=\"AB7Lab Id5V1\"]"));
for (int i=2; i<radiobutton.size();i++){
    radiobutton.get(i).click();

}
driver.findElement(By.xpath("//span[text()='Clear selection']")).click();
        List<WebElement> checkboxes= driver.findElements(By.xpath("//div[@class=\"uHMk6b fsHoPb\"]"));

        for(WebElement ele: checkboxes){
            ele.click();
        }
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        try {
            WebElement ele = expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@jsname=\"YPqjbf\"]")));
            ele.sendKeys("Half of the path is reached now follow the another half and you will reach to get the success");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

   }
    }

