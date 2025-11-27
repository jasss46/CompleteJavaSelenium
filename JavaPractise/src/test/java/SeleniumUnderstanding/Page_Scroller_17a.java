package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Scroller_17a {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement lastText= driver.findElement(By.xpath("//a[text()='Top 100 smallest countries by area']"));



        //Normal scroller
//        js.executeScript("window.scrollBy(0,3000)","");
//        System.out.println(js.executeScript("return window.pageYOffset;")); //this one is used to capture the location

        //Scroll the page till element is visible
//        js.executeScript("arguments[0].scrollIntoView()",lastText);
//        System.out.println(js.executeScript("return window.pageYOffset;"));

        //Scroll the page till bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
           System.out.println(js.executeScript("return window.pageYOffset;"));

Thread.sleep(3000);
        //Scrolling upto initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)","");


    }
}
