package SeleniumUnderstanding;



/*
JavascriptExecutor  interface

               Sometimes click() and sendkeys() method does not work
               Then in that scenerio we use Java ScriptExecutor

               When we get the element interceptor issue then we can use this JavascriptExecutor

executescript()= we can execute Javascript statements

click()
sendkeys()


 */


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorUnderstanding_17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement nameInputBox= driver.findElement(By.xpath("//input[@id=\"name\"]"));
        WebElement sundayCheckBox= driver.findElement(By.xpath("//input[@id=\"sunday\"]"));

        Thread.sleep(2000);
        JavascriptExecutor js= (JavascriptExecutor) driver;

           //Passing the text into the input box
           js.executeScript("arguments[0].setAttribute('value','Jaswinder')",nameInputBox);

           //To perform click action using executor
           js.executeScript("arguments[0].click()",sundayCheckBox);





    }
}
