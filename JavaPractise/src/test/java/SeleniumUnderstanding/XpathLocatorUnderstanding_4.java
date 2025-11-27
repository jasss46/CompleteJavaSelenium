package SeleniumUnderstanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorUnderstanding_4 {

    /*
    Xpath is the address of an element
     DOM document object model

    There are two types of Xpath
    1. Absolute XPath  -->It is also referred to full path.
        -Absolute Xpath starts with /
        -Absolute Xpath do not use attribute.
        -Absolute Xpath traverse through each node till it finds the element.

    2. Relative Xpath  -->It is referred to partial path.
        -Relative Xpath starts with //
        -Relative Xpath do not use attribute.
        -Relative Xpath directly jump and find the element by using attribute.

      RELATIVE XPATH
           XPath with SINGLE Attribute  ---->      SYNTAX- //tagname[@attribute='value']
           Xpath with MULTIPLE Attributes --->             //tagname[@attribute='value'][@attribute='value']
           Xpath with and  or operator  --->               //tagname[@attribute='value' and @attribute='value']        for this both attributes should match
                                                           //tagname[@attribute='value' or @attribute='value']         one attribure  match will get this

           Xpath with inner text= text()                   //tagname[text()='value']

           Xpath with contains                             //tagname[contains(@attribute,'value')]               contains and starts-with is used for dynamic
           Xpath with starts-with()                        //tagname[starts-with(@attribute,'value')]              attributes
     */


    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://thriveagency-nov.flywheelsites.com/contact/");
        driver.manage().window().maximize();

        //Single Attribute
//       driver.findElement(By.xpath("//input[@placeholder='First Name*']")).sendKeys("Jaswinder Singh");
//       driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("jaswinder@thriveagency.com");
//
//       //Multiple Attribute
//        driver.findElement(By.xpath("//input[@class='medium'][@placeholder='Company/Organization*']")).sendKeys("Jass");


        //with text()
//        driver.findElement(By.xpath("//span[text()='Local']")).click();
//        driver.findElement(By.xpath("//span[text()='Contact']")).click();
//          driver.findElement(By.xpath("//a[text()='HVAC AND EMS SUPPLIER']")).click();

        //with contains
//        driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Testing");
//        driver.findElement(By.xpath("//a[contains(@class,'contactus')]")).click();
//        driver.findElement(By.xpath("//a[contains(text(),'PRIVATE')]")).click();

        // starts-with
//        driver.findElement(By.xpath("//a[starts-with(text(),'PRIVATE')]")).click();

    }

}
