package TestNGUnderstanding.BAT;

import org.testng.annotations.*;

public class TestNG_AfterTest {
    @AfterTest
    void logout(){
        System.out.println("Logout from after test");
    }
    @Test
    void search(){
        System.out.println("search from AfterTest");

    }
}
