package SeleniumUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DifferentTypesOfLocators_2 {
    /* There are two types of locators
    1.Basic locators.
    2.Customized locators.


    1. Basic locators:-
                      id,name,PartialLinkText,LinkText, Class Name and Tag Name.

     2. Customized locators:- CSS Selector                        XPath
                               Tag and Id                 Absolute XPath, Relative XPath
                               Tag and class
                               Tag and Attribute
                               Tag,class and Attribute


By.name("");
By.id();
By.linktext();          For the link text value we need to pass complete text
By.partialLinkText();   For the partial link text value we can pass the partial text

tagname       These are used to find group of elements
className


findelement()  - This we used to find only for one element
id
linktext
partiallinktext




findelements() - This we used to find multiple elements
tagname       These are used to find group of elements
className



     */

    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/");

        driver.findElement(By.linkText("Marketplace")).click(); //here we pass complete link text
        driver.findElement(By.partialLinkText("Market")).click(); //here we pass partial  link text

        List<WebElement> headerlist=driver.findElements(By.className("list-unstyled"));
        System.out.println(headerlist.size());


        List<WebElement> linkschecker= driver.findElements(By.tagName("a"));
        List<WebElement> Imagechecker= driver.findElements(By.tagName("img"));

        System.out.println(linkschecker.size());
        System.out.println(Imagechecker.size());
    }
    }

