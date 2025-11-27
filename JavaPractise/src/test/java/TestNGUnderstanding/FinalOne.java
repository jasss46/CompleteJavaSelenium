package TestNGUnderstanding;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.lang.management.ThreadInfo;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class FinalOne {

    public static WebDriver driver;
    public static WebDriverWait wait;


    @Test(enabled = false)
    public void starting() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //To match the page title

//        String title= driver.getTitle();
//
//        if ( title.equalsIgnoreCase("OpenCart - Open Source Shopping Cart Solution")){
//
//            System.out.println("title Matched");
//        }
//        else{
//            System.out.println("title are not matching");
//        }

/* Different types of locators

//tagname[@Atrribute='value']
//tagname[contains(@attribute,'value')]
//tagname[text()='value']
//tagname[starts-with(attribute,'value')]
There are two types of XPath
1. Absolute Xpath and second one is Relative Xpath




 */
        String Url = driver.getCurrentUrl();
        String pageTitle = driver.getTitle();
        String windowHandle = driver.getWindowHandle();

        System.out.println("The page url of the page is:" + Url);
        System.out.println("The page title of the page is:" + pageTitle);
        System.out.println("The windown hadle of the window is:" + windowHandle);


//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(3000);
//
//        driver.navigate().forward();
//        Thread.sleep(3000);


        WebElement quickGuideText = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Quick Guide")));

        if (!quickGuideText.isDisplayed()) {
            System.out.println("It is not displayed on the page");
            quickGuideText.click();
        } else {
            System.out.println("It is present on the page");
        }


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");

        WebElement emailAddressField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter your email address']")));

        if (emailAddressField.isEnabled()) {
            System.out.println("The field is enabled");
            emailAddressField.sendKeys("tesing@gmail.com");
        } else {
            System.out.println("The field is disabled");
        }
    }

    @Test(enabled = false)
    public void proper() {
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sundayCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox' and  @value='sunday']")));
//         if (!sundayCheckbox.isSelected()){
//             sundayCheckbox.click();
//         }
//         else{
//             System.out.println("It is already selected");
//         }
//Single checkbox
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox' and @value='wednesday']"))).click();

        //Multiple checkbox

        List<WebElement> chboxes = driver.findElements(By.xpath("//div[@class='form-group']//input[@type='checkbox']"));
        String value = "Thursday";

        for (int i = 0; i < chboxes.size(); i++) {
            if (chboxes.get(i).getAttribute("value").equalsIgnoreCase("Thursday")) {
                chboxes.get(i).click();
            }
        }

    }

    @Test(enabled = false)
    public void checkboxes() {
        driver = new ChromeDriver();
        driver.get("https://thriveagency.com/contact/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='AI Search Optimization']"))).click();

        List<WebElement> chkboxes= driver.findElements(By.xpath(""));

    }
    @Test(enabled = false)
    public void otherOption() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        WebElement alert1= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//        alert1.click();


        WebElement alert2= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        alert2.click();
//        Alert newAlert= driver.switchTo().alert();
//        newAlert.dismiss();
//
//        Thread.sleep(5000);
//        WebElement alert3= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
//        alert3.click();
//        newAlert.sendKeys("Jaswinder Singh");
//        newAlert.accept();
//
//        //By using explicit wait

         Alert alertPopUp= wait.until(ExpectedConditions.alertIsPresent());
         alertPopUp.accept();


    }


    public void previous() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       WebElement frame3= driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
       driver.switchTo().frame(frame3);

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"mytext3\"]"))).sendKeys("Most recent one");
       Thread.sleep(2000);

       driver.switchTo().frame(0);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"uHMk6b fsHoPb\"]"))).click();

    }

    public void pro() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://thriveagency.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Actions act= new Actions(driver);


    WebElement results= driver.findElement(By.xpath("//span[text()='Results']"));
    act.moveToElement(results).build().perform();
    Thread.sleep(3000);

    act.doubleClick(results).perform();
    Thread.sleep(3000);

    act.contextClick(results).perform();

}
public void Scroller() throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
    driver.manage().window().maximize();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    JavascriptExecutor js= (JavascriptExecutor) driver;
    WebElement lastText= driver.findElement(By.xpath("//a[text()='Top 100 largest countries by area']"));


//    js.executeScript("window.scrollTo(0, 5000);");   // Normal Scroller


//    js.executeScript("arguments[0].scrollIntoView()",lastText); //This one is used to the scroll down to the last element

      js.executeScript("window.scrollBy(0,document.body.scrollHeight)",""); //till the bottom of the page
Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)",""); // to relocate the initial position





}
@Test
public void dropdown(){

        driver = new ChromeDriver();
        driver.get("https://thriveagency.com/contact/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropdown= driver.findElement(By.xpath("(//select[contains(@class,'gfield_select')])[1]"));
    Select slc= new Select(dropdown);
    //slc.selectByVisibleText("$750-$1,500");

//    slc.selectByIndex(3);

//    slc.selectByValue("$3,000-$10,000");






}
}

