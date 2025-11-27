package TestNGUnderstanding;

/*
Annotations

@Test

@BeforeMethod       BeforeMethod and AfterMethod will execute before and after tests
@AfterMethod

@BeforeClass
@AfterClass

@BeforeTest
@AfterTest

@BeforeSuite
@AfterSuite


TC1
1 login      ---@BeforeMethod
2 Search     ---@Test
3 logout     ---@AfterMethod
4 login
5 Adv Search   --@Test
6 logout

 */

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGunderstading_03_beforeAfterMethod {

    @BeforeMethod
    void login(){
        System.out.println("Login");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("search");
    }
    @Test(priority = 2)
    void advsearch(){
        System.out.println("advsearch");
    }
    @AfterMethod
    void logout(){
        System.out.println("logout");
    }
}
