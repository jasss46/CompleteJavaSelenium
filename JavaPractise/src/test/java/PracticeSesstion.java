import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;
import java.time.Duration;
import java.util.List;
@Listeners({TestNGListenersUnderstanding.MyListener.class})


public class PracticeSesstion {
    WebDriver driver;
    WebDriverWait wait;
    Actions act;

    @Test(priority = 0)

    void differentTopics() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        act = new Actions(driver);
        driver.get("https://thriveagency.com/contact/");
        driver.manage().window().maximize();

        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"thrive logo\"]")));
        act.moveToElement(logo).build().perform();
        driver.quit();

    }
    @Test(priority = 1)

    void navigationCommands() throws InterruptedException {
        driver = new ChromeDriver();
        driver.navigate().to("https://thriveagency.com/contact/");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://thriveagency.com/digital-marketing-services/");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.quit();
    }
    @Test(priority = 2)

    void checkboxPractice() throws InterruptedException {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://thriveagency.com/contact/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        List<WebElement> allchkboxes = driver.findElements(By.xpath("//ul[@class=\"gfield_checkbox\"]//input[@type=\"checkbox\" and @value]"));
        for (int i = 0; i < allchkboxes.size() - 1; i++) {
            System.out.println(allchkboxes.get(i).getAttribute("value"));
        }
        driver.quit();

    }
    @Test(priority = 3)

    void alertSesstion() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert myalert = wait.until(ExpectedConditions.alertIsPresent());
        myalert.accept();
        driver.quit();


    }
    @Test(priority = 4)

    void mouseElements() {
        driver = new ChromeDriver();
        driver.get("https://thriveagency.com/midtown-digital-marketing-agency/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        act = new Actions(driver);

        WebElement services = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Services']")));

        act.moveToElement(services).build().perform();
        act.doubleClick(services).build().perform();
        driver.quit();


    }
    @Test(priority = 5)

    void draganddropfunctionality() {
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//div[@rel-title=\"Photo Manager\"]//iframe[contains(@class,'demo-frame')]"));

    driver.switchTo().frame(frame);
    WebElement image1= driver.findElement(By.xpath("//li[contains(@class,'ui-widget')]//h5[text()='High Tatras']"));
    WebElement trashFolder= driver.findElement(By.xpath("//div[@id=\"trash\"]"));
    act= new Actions(driver);
    act.dragAndDrop(image1,trashFolder).build().perform();
        driver.quit();



    }
    @Test(priority = 6)
    void iframeswitching(){
        driver= new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Jaswinder Singh Automation Tester");
        driver.switchTo().defaultContent();

        WebElement frame2= driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Dreams dont work unless you do");
        driver.switchTo().defaultContent();
        driver.quit();


    }

}
