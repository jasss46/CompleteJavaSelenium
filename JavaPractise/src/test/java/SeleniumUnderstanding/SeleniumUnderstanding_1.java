package SeleniumUnderstanding;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUnderstanding_1 {


    /*
    1.Webdriver is one of the component in selenium.
    2.Webdriver is a Java Interface.
    3.Webdriver is an API(Aplication Programming Interface).

    WebDriver-------Remote Driver----> ChromeDriver, FirefoxDriver, EdgeDriver etc.

     */



    public class FirstTestCase {
        public static void main(String[] args) {


            //Launch the Browser
            //ChromeDriver driver= new ChromeDriver();    First way
            WebDriver driver= new ChromeDriver();         //Second way
            driver.get("https://www.opencart.com/");

            //Window maximiser
            driver.manage().window().maximize();

            //To get the title of the page
            String Title=  driver.getTitle();

            try{
                if(Title.equalsIgnoreCase("OpenCart - Open Source Shopping Cart Solution")){
                    System.out.println("Test Passed");
                }
                else{
                    System.out.println("Test Failed");
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            finally{
                //To quit the browser
                driver.quit();
            }

        }



    }

}
