package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesUnderstanding_10 {

    /*
   1. Checkbox for single click


   2. Checkbox for multiple checkboxes




     */


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //For single checkbox
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();


        //For selecting multiple check boxes
//        List<WebElement> cbx= driver.findElements(By.xpath("//div[@class='form-check form-check-inline']//input[@type='checkbox']"));
//       for(WebElement cx: cbx){
//           cx.click();
//       }

        //Select last three check boxes
        //Totol number of checkboxes- how many checkboxes you want to select= Starting index
        List<WebElement>  ckb= driver.findElements(By.xpath("//div[@class='form-check form-check-inline']//input[@type='checkbox']"));

        for(int i=3;i<ckb.size();i++){
            Thread.sleep(2000);
            ckb.get(i).click();

        }
        for (int i=0;i<ckb.size();i++){
            if(ckb.get(i).isSelected()){
                Thread.sleep(3000);
                ckb.get(i).click();
            }
        }



    }
}
