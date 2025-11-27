package TestNGUnderstanding.BAT;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ZipNew {
    @AfterTest
    void logout(){
        System.out.println("Logout from after new test");
    }
    @Test
    void searchNew(){
        System.out.println("search from  new AfterTest");

    }
}
