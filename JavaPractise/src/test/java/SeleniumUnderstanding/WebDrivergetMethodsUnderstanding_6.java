package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class



WebDrivergetMethodsUnderstanding_6 {

    /*
    There are five types of methods in selenium
    1. get methods.
    2. conditional methods.
    3. browser methods
    4. navigational methods.
    5. wait methods.


    1. getmethods--> we can access these methods through webdriver instance
    --get(url) -         opens the url of the page
    --getTitle() -       returns title of the page
    --getCurrentUrl() -  returns Url of the page
    --getPageSource() -  returns source code of the page
    --getWindowHandle() -returns ID of the single browser window.
    --getWindowHandles() - returns Id's of the multiple browser windows
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://thriveagency-nov.flywheelsites.com/");
        driver.manage().window().maximize();


//           String pageTitle = driver.getTitle();
//           System.out.println(pageTitle);
//           String URL=driver.getCurrentUrl();
//           String sourceCode= driver.getPageSource();
//           String windowhandle= driver.getWindowHandle();

//           System.out.println(URL);
//           System.out.println(sourceCode);
//            System.out.println(windowhandle);
          Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Read Farah’s Case Study »']")).click();
           Set<String> windowids= driver.getWindowHandles();
        System.out.println(windowids);


    }


}
