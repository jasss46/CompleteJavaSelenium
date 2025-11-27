package JAVATopics;

/*Exception is an event which will cause program termination.
Types of Errors
Syntax Error and logical error

Types of Exceptions:-
1. Checked Exceptions --The exceptions which are identified by the Java compiler
Example- Interupted Exception, FileNotFound, IO Exception etc.
2. Unchecked Exceptions --The exceptions which are not identified by the Java Compiler
Example- Arithmetic Exception, NullPointerException, ArrayIndexOutOfBoundException etc.


finally Block
finally block will always be executed, either try block will execute then finally will executed
or catch block will execute then finally block will be executed.
In both cases finally block will be executed.

Case 1: Exception occured, catch block handles ---->Finally block will executed.
Case 2: Exception occured, catch block not handled ---->Finally block will executed.
Case 3: Exception does not occured, catch block ignored --->Finally block will be executed.

CHECKED EXCEPTIONS  can be handled in two ways

 */

public class ExceptionHandlingPractise {
    public static void main(String[] args) {
        ExceptionHandlingPractise v9 = new ExceptionHandlingPractise();
        v9.firstTryCatch();
        try {
            Thread.sleep(5844);
        } catch (Exception e) {
        }

        v9.secondTryCatchAlsoWithFinally();
    }
    public void firstTryCatch() {

        int a = 988;

        try {
            System.out.println(a / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will surely executed in the console");
        }
    }
    public void secondTryCatchAlsoWithFinally() {

        String str = "Jaswinder";
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("484000");
        }
    }
}