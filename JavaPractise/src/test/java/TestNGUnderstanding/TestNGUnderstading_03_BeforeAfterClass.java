package TestNGUnderstanding;

import org.testng.annotations.*;

/*

Before Class and After class means all the test will cover run and the one with before class and after class will run once
TC2
1.Login      ---@BeforeClass
2.Search     ---@Test
3.AdvSearch  --@Test
4.logout     --@AfterClass
 */
public class TestNGUnderstading_03_BeforeAfterClass {
    @BeforeClass
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
    @AfterClass
    void logout(){
        System.out.println("logout");
    }
}
