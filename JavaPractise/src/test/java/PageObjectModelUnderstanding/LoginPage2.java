package PageObjectModelUnderstanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {
    WebDriver driver;


    //Constructor
    LoginPage2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    //Locators
    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement txt_username;
    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement  txt_password;
    @FindBy(xpath="//input[@placeholder='submit']")
    WebElement  txt_login;



    //Action Methods

    public void setUsername(String user){
        txt_username.sendKeys(user);
    }

    public void setPassword(String pwd){
        txt_password.sendKeys(pwd);
    }

    public void clickLogin(){
        txt_login.click();
    }
}

