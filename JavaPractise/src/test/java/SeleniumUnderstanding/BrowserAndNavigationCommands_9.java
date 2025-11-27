package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserAndNavigationCommands_9 {

    /*
          driver.get("www.com");             we can only pass the URL in String format


          driver.navigate().to("ww.com");     we can pass the URL as object in this
         URL myurl= new URL("https://www.nopcommerce.com/en?srsltid=AfmBOopnpKgmIFdC09HE6sKDIy_G5X_jW__yQCwbTHb90D4L9HjytMnW");
        driver.navigate().to(myurl);

driver.navigate().back();    ----> to navigate back to the previous url
driver.navigate().forward(); ----> to navigate forward to the url
driver.navigate().refresh(); ----> to refresh the current url
driver.getWindowHandles();
driver.getWindowHandle();


     */

    public static void main(String[] args) throws MalformedURLException {
//        WebDriver driver= new ChromeDriver();

//        driver.navigate().to("https://www.nopcommerce.com/en?srsltid=AfmBOopnpKgmIFdC09HE6sKDIy_G5X_jW__yQCwbTHb90D4L9HjytMnW");
//        driver.navigate().to("https://crm.supremetechnologiesindia.com/dashboard/bod-Report");
//
//        driver.navigate().back();
//        System.out.println(driver.getCurrentUrl());
//
//        driver.navigate().forward();
//        System.out.println(driver.getCurrentUrl());
//
//        driver.navigate().refresh();

//        Set<String> windowsID= driver.getWindowHandles();
//
//        List<String> windowList= new ArrayList<>(windowsID);
//        String window1=windowList.get(0);
//        String window2=windowList.get(1);
//        driver.switchTo().window(window2);


//        ----------------------------------------------------------------------------------------------------------------

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {
            driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Approach 1
        Set<String> windowsID = driver.getWindowHandles();

        List<String> windowList = new ArrayList<>(windowsID);
        String window1 = windowList.get(0);
        String window2 = windowList.get(1);


        //After switching to the new window we can perform actions seprately
        driver.switchTo().window(window2);
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Software testing tutorials");
        System.out.println("all the test cases are passed");


        //Approach 2
        // By using for loop

        Set<String> windowsId = driver.getWindowHandles();
        for (String winId : windowsId) {
            String title = driver.switchTo().window(winId).getTitle();
            if (title.equals("OrangeHRM")) {
                System.out.println(driver.getCurrentUrl());


            }
        }

    }
}
