package TestNGUnderstanding;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Assertions
Used for validations:

Assert is a predefined class

Two kinds of Assertions:
1.Hard Assertions
2.Soft Assertions




 */
public class AssertionsUnderstanding {
    WebDriver driver;

    @Test
    void titleMatching(){
        driver= new ChromeDriver();
        driver.get("https://thriveagency.com/");
        driver.manage().window().maximize();
        String ActualTitle= "Digital Marketing Agency | Thrive Internet Marketing Agency";
        String expectedTitle= driver.getTitle();
        if(ActualTitle.equals(expectedTitle)){
            System.out.println("test case is passed");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("failed");
            Assert.assertTrue(false);

        }


    }
}
