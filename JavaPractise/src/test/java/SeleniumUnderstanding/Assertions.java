package SeleniumUnderstanding;

import TestNGUnderstanding.SoftAssertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

    /*There are the two types of Assertions
    Soft Assertion
    Hard Assertion
     */


@Test(enabled = false)
    public void hardAssertions(){
//        Assert.assertEquals("abd","abd");   passed        we can compare text as well as numbers
//        Assert.assertEquals(123,123);       passed

 //   Assert.assertNotEquals(123,545); passed

//    Assert.assertTrue(true);  passed
//    Assert.assertTrue(false); failed


//    Assert.assertTrue(1==2);  failed
//            Assert.assertTrue(1==1); passed


  //  Problem with HardAssertions
    /* if the assertion part will fail then the next part the assertion will not run

     */

    System.out.println("1");
    System.out.println("2");
    Assert.assertTrue(1==2);

    System.out.println("this will not be printed as the assertion gets failed");
    System.out.println("the above statement and this will only print when the condition inside the assertions is true");





    }
@Test
    public void softAssertions(){

    System.out.println("1");
    System.out.println("2");
    SoftAssert sa= new SoftAssert();
sa.assertTrue(1==2);
    System.out.println("all the text will be printed as we are using soft assertion");


    sa.assertAll(); //This one is mandatory
    }
}
