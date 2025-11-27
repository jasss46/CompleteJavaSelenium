package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectionKey;
import java.time.Duration;
import java.util.List;

public class DropdownBoxUnderstanding_14 {

    /*
    Dropdowns
             There are three types of Dropdowns
             1.Select Dropdown
                     WebElement dropdown= driver.findElement(By.xpath("//Select[@id=\"country\"]"));
                      Select drpcntry= new Select(dropdown);
                                                     selectByVisibleText()
                                                     selectByvalue()
                                                     selectByIndex()

             2.BootStrap Dropdown
             3.hidden drop down
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//            driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().window().maximize();

        //Select Dropdown
        //We have predefined Select class for the select type of dropdown
//       WebElement dropdown= driver.findElement(By.xpath("//Select[@id=\"country\"]"));
//        Select drpcntry= new Select(dropdown);
//
//        //Select options from the dropdown
//
//        drpcntry.selectByVisibleText("India");
//        drpcntry.selectByValue("canada");
//        drpcntry.selectByIndex(2);

        //Capture options from the drowdown
//      List<WebElement> options=   drpcntry.getOptions();
//        System.out.println(options.size());
//
//        //Printing the options
//        for( WebElement ele: options){
//            System.out.println(ele.getText());
//        }


//        //SECOND DROPDOWN  Bootstrap dropdown  Multiselect drowpdown
//        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//span[contains(@class,'multiselect')]")).click(); //open the dropdown options
//        Thread.sleep(5000);;



        WebElement dropDown = driver.findElement(By.xpath("//button[contains(@class,'multiselect')]"));
        dropDown.click();
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label[@class='checkbox']"));
        for( WebElement ele:   options){

            if(ele.getText().equals("Bootstrap")){
                ele.click();

            }
        }

        //THIRD DROPDOWN  Hidden Dropdown


    }
}
