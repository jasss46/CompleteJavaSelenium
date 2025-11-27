package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

/*
  Drag and drop command
  Actions act= new Actions(driver);
        act.dragAndDrop(imageOne,trash).perform();
                        imageOne is inital location
                        trash is final location in the following
 */
public class DragAndDropUnderstanding14a {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement frame1= driver.findElement(By.xpath("//div[@rel-title=\"Photo Manager\"]//iframe[contains(@class,'demo-frame')]"));
        driver.switchTo().frame(frame1);

//        WebElement image1= driver.findElement(By.xpath("//li[contains(@class,'ui-widget')]//h5[text()='High Tatras']"));
//        WebElement image2= driver.findElement(By.xpath("//li[contains(@class,'ui-widget')]//h5[text()='High Tatras 2']"));
//        WebElement image3= driver.findElement(By.xpath("//li[contains(@class,'ui-widget')]//h5[text()='High Tatras 3']"));
//        WebElement image4= driver.findElement(By.xpath("//li[contains(@class,'ui-widget')]//h5[text()='High Tatras 4']"));

        WebElement trashFolder= driver.findElement(By.xpath("//div[@id=\"trash\"]"));

        Actions act= new Actions(driver);
//               try {
//                   act.dragAndDrop(image1, trashFolder).perform();
//
//                   Thread.sleep(2000);
//
//                   act.dragAndDrop(image2, trashFolder).perform();
//                   Thread.sleep(3000);
//                   act.dragAndDrop(image3, trashFolder).perform();
//                   Thread.sleep(4000);
//                   act.dragAndDrop(image4, trashFolder).perform();
//               }
//               catch(Exception e){
//                   System.out.println(e.getMessage());
//               }

        try{
            List<WebElement> imgList= driver.findElements(By.xpath("//li[contains(@class,'ui-widget')]"));

            for(int i=0; i<imgList.size();i++){
                Thread.sleep(2000);
                act.dragAndDrop(imgList.get(i),trashFolder).perform();
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
