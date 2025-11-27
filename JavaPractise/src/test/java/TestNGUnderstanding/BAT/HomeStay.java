package TestNGUnderstanding.BAT;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeStay {
    WebDriver driver;
    WebDriverWait wait;
    Actions act;


    @Test(priority = 1)
    void search() {
        driver = new ChromeDriver();
        driver.get("https://www.homestay.com/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='I accept']"))).click();
        System.out.println("Alert successfully handeled");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='location']"))).sendKeys("New Delhi, Delhi, India");

        System.out.println("Location added");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='check_in']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datepicker-days']//tr//td[text()='20']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='datepicker-days']//tr//td[text()='23']"))).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='guests']"));
        Select dropvalues = new Select(dropdown);
        dropvalues.selectByIndex(2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();

    }
    @Test(priority = 2)
    void priceBar(){
        act= new Actions(driver);


    }


}
