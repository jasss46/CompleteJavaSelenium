package TestNGUnderstanding;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

    @Test(enabled = false)
    void hard_Assertions(){
        System.out.println("Jaswinder");
        System.out.println("Jaswinder");

        Assert.assertEquals(1,2);

        System.out.println("new");
        System.out.println("new");

    }
    @Test
    void soft_Assertions(){
        System.out.println("Jaswinder");
        System.out.println("Jaswinder");

        SoftAssert sa= new SoftAssert();

        Assert.assertEquals(1,2);

        System.out.println("new");
        System.out.println("new");

    }
}
