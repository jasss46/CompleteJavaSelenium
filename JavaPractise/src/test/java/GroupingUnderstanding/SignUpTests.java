package GroupingUnderstanding;

import org.testng.annotations.Test;

public class SignUpTests {

    @Test(priority = 1,groups = {"Regression"})
    void signUpByEmail(){
        System.out.println("Sign up by Email");
    }
    @Test(priority = 2,groups = {"Regression"})
    void signUpByFacebook(){
        System.out.println("Sign up by Facebook");
    }
    @Test(priority = 3,groups = {"Regression"})
    void signUpByTwitter(){
        System.out.println("Sign up by Twitter");
    }
}
