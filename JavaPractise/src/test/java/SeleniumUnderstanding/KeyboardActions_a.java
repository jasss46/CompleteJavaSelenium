package SeleniumUnderstanding;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_a {
    /*

Shortcut keys for keyboard actions
     */
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        WebElement textArea1=driver.findElement(By.xpath("//textarea[@name=\"text1\"]"));
        textArea1.sendKeys("Jaswinder Singh ");

        Actions act= new Actions(driver);

        //CTRL+A  Selects all the text
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //key down will perfom click on key keys.control we can select any key then we will send char which we need to click then accordingly we will
        //write up commands


        //CTRL+C  Copy the text into clipboard
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();


        //Tab  Shift to Second box
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //CTRL+V Paste the text
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        System.out.println("Text has been pasted successfully");

        act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();


       // act.keyDown(Keys.CONTROL).click(element).keyDown(Keys.CONTROL).perform();
        // we can also user click where we can pass the elements

        //Switching to new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://thriveagency.com/louisville-digital-marketing-agency/");

        //Switching to new window
        driver.switchTo().newWindow(WindowType.WINDOW);

    }
}
