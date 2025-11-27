import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class PracticeSesstion_02 {
    WebDriver driver;
    WebDriverWait wait;
    Actions act;


    @BeforeClass
    public void website() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void formCompletion() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='category-cards']//div[contains(@class,'mt-4')]//h5[contains(text(),'Elements')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Text Box')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userName']"))).sendKeys("Tesing");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userEmail']"))).sendKeys("Testing@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='currentAddress']"))).sendKeys("Demo Punjab");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='permanentAddress']"))).sendKeys("Demo Mohali");
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        act = new Actions(driver, Duration.ofSeconds(20));
        act.moveToElement(submitButton).build().perform();
        System.out.println("form Submitted successfully");

    }

    @Test(priority = 2)
    public void checkBox() throws InterruptedException {
        Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Check Box')]"))).click();
        WebElement chkbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        if (chkbox.isEnabled()) {
            chkbox.click();
            System.out.println("checkbox selected");
        } else {
            System.out.println("Checkbox is disabled");
        }
    }

    @Test(priority = 3)
    public void radioButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Radio Button']"))).click();
        Thread.sleep(2000);
        List<WebElement> allButtons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("label[class='custom-control-label']")));
        System.out.println(allButtons.size());
        for (int i = 0; i < allButtons.size(); i++) {
            allButtons.get(i).click();

        }

    }

    @Test(priority = 4, enabled = false)
    public void webTables() {
        List<WebElement> tablevalues = driver.findElements(By.xpath(""));

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
