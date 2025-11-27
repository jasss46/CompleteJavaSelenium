package TestNGUnderstanding.BAT;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_BeforeTest {
    @BeforeTest
    void login(){
        System.out.println("Login from Before Test");
    }
    @Test
    void advsearch(){
        System.out.println("advsearch");
    }
}
