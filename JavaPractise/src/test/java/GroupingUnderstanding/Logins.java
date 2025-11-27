package GroupingUnderstanding;

import org.testng.annotations.Test;

public class Logins {
    @Test(priority = 1,groups = {"Sanity"})
    void loginByEmail(){
        System.out.println("This is login by Email");
    }
    @Test(priority = 2,groups = {"Sanity"})
    void loginByTwitter(){
        System.out.println("This is login by Twitter");
    }
    @Test(priority = 3,groups = {"Sanity"})
    void loginByFacebook(){
        System.out.println("This is login by Facebook");
    }
}
