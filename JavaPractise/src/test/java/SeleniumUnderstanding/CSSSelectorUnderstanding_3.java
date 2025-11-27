package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorUnderstanding_3 {

    /*
    CSS Cascading Styling Sheet

    tag id                             tag#id
    tag class                          tag.classname
    tag attribute                      tag[attribute="value"]
    tag class attribute                tag.classname[attribute="value"]
     */


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.automationtesting.in/Register.html");
//        driver.manage().window().maximize();

//        Example number 1:- tag#id         //tag#id
        driver.findElement(By.cssSelector("input#firstpassword")).sendKeys("Passworkd");
//        we can also remove tag as it is optional   #id
        driver.findElement(By.cssSelector("#secondpassword")).sendKeys("NewPassword");

//        Example number 2:- tag.classname
        driver.findElement(By.cssSelector("input.form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-minlength")).sendKeys("fsdfds");
//        we can also remove tag as it is optional   .classname
        driver.findElement(By.cssSelector("input.form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-minlength")).sendKeys("fsdfds");

//       Exmaple number 3:- tag[attribute='value']
        try {                               //This is an example
       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Jaswinder Singh");
          System.out.println("password is entered");
       }
       catch(Exception e){
       System.out.println(e.getMessage());
       }

//        Example number 4:  tag.classname[attribute="value"]
        driver.get("https://www.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input.form-control[name='email']")).sendKeys("Password typed");

    }
}
