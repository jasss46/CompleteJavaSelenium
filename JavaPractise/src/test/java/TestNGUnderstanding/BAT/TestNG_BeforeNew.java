package TestNGUnderstanding.BAT;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_BeforeNew {
    @BeforeTest
    void login(){
        System.out.println("New Login from Before Test");
    }
    @Test
    void advsearch2(){
        System.out.println("New advsearch");
    }
}
