package SeleniumUnderstanding;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*

To know about the x-axis and y-axis of the specific thing
Then we will use getlocation() command

We can use drag and drop command to drag the pointer
        myact.dragAndDropBy(element,x,y).perform();

 */

public class KeyboardActions_16 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.globalsqa.com/demoSite/practice/slider/range.html");
        driver.manage().window().maximize();


//           Thread.sleep(1000);
//           WebElement startingButton = driver.findElement(By.xpath("//span[contains(@class,'ui-slider')][1]"));
//           System.out.println(startingButton.getLocation());
//             Thread.sleep(5000);
//        Actions myact= new Actions(driver);
//
//        myact.dragAndDropBy(startingButton,500,100).perform();
//        System.out.println("The new Button location is:"+startingButton.getLocation());

        //Ending button
        Thread.sleep(3000);
        WebElement endingButton= driver.findElement(By.xpath("//span[contains(@class,'ui-slider')][2]"));
        System.out.println(endingButton.getLocation());

        Actions newact= new Actions(driver);
        Thread.sleep(3000);
        newact.dragAndDropBy(endingButton,-50,40).perform();
        System.out.println("The new locaiton of the pointer is:"+ endingButton.getLocation());

    }
}
