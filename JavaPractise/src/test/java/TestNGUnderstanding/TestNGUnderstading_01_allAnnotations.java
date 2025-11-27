package TestNGUnderstanding;



/*
   TEST NG- Test New Generation
   Java Based Unit Testing Tool.
----------------------------------------------
   Advantages:-
   1. Test cases & Test suites.
   2. Grouping of Test Cases.
   3. Prioritize.
   4. Parametrization.
   5. Parallel Testing.
   6. Reports.
------------------------------------------------
   TestNG configuration:-
   1. Install TestNG in eclipse
   2. add testing library to build path/ add testing dependency in pom.xml

   @Test - annotation

1.TestNG executes test methods based on alphabetical order.
2.@Test(priority=number) controls the order of execution  example(priority=1), (priority=2) (priority=3)
3. Once you provide the priority to the test methods, then order of method is not considered.
4. Priorities can be random numbers(no need to have consecutive numbers)
5. If you do not provide any priority then default value is (0).
6. If two methods have same priority then it will follow the alphabetical order of the methods.
7. we can also provide negative numbers in priority.(priority = -1),(priority = 0),(priority = 2)
8. TestNG will execute the test methods only if they are having @Test Annotation.

@Test(enabled= false)   This method will not executed because we have enabled it false
@Test(enabled= true)     This method will be executed because we have enabled it true

Execute test cases using testing XML file
    */

/*
Open app
login
logout
 */

import org.testng.annotations.Test;

public class TestNGUnderstading_01_allAnnotations {

    @Test(priority = 0)
    void openApp(){
        System.out.println("Opening the Application");

    }
    @Test(priority = 2)

    void login(){
    System.out.println("Logged in successfully");

}
    @Test(priority = -1)
    void logout(){
    System.out.println("Logged out successfully");

}
@Test(enabled = true)
    void newOne(){
        System.out.println("This one disable will not show");
    }



}
