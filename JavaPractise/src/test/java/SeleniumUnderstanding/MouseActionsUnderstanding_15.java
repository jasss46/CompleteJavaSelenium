package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


/*
Mouse hover-->  Actions act = new Actions(driver);
                 act.moveToElement(Webelement value).build().perform();

Right Click--> Its also called context click
               Actions act = new Actions(driver);
               act.contextClick(Webelement).perform();


Double click--> Actions act = new Actions(driver);
       act.doubleClick(Webelement).perform();


Drag and Drop-->



 */



//Actions- pre defined class provided in selenium

//Build--> Create an action
//Perform-->Complte an action

public class MouseActionsUnderstanding_15 {
   public static void main(String[]args) throws InterruptedException {
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(5000);
//       driver.get("https://www.flipkart.com/");

//try {
//    WebElement fashion = driver.findElement(By.xpath("//img[@class=\"_2puWtW _3a3qyb\" and @alt=\"Fashion\"]"));
//
//    Actions act = new Actions(driver);// we will use actions class to do actions
//    act.moveToElement(fashion).build().perform();
//
//}
//catch(Exception e){
//    System.out.println(e.getMessage());
//}

       //For Drag and drop

//       Actions myact= new Actions(driver);
//
//       driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//       WebElement image1= driver.findElement(By.xpath("");
//       WebElement image2= driver.findElement(By.xpath(""));
    }
}
