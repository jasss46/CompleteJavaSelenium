package TestNGUnderstanding;

import org.testng.Assert;
import org.testng.annotations.Test;

/*

Open app
Login
Search
AdvSearch
logout

 we can create dependencies of the methods like if the we want second method will execute only when the first method gets executed.
 Then we can use (dependsOnMethods={"method name","method name2"})



 */
public class DependencyMethods_7 {

@Test(priority=1)
    void openApp(){
    Assert.assertTrue(true);

    }
 @Test (priority=2, dependsOnMethods ={ "openApp"})
    void login(){
     Assert.assertTrue(false);


 }
  @Test(priority=3,dependsOnMethods = {"login"})
    void search(){
      Assert.assertTrue(true);


  }
    @Test(priority=4,dependsOnMethods = {"login","search"})
    void advSearch(){
        Assert.assertTrue(true);


    }
    @Test(priority=5,dependsOnMethods = {"login"})
    void logout(){
        Assert.assertTrue(true);


    }
}
