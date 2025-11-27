package GroupingUnderstanding;

public class Grouping_understanding {
}
/*


Sanity Test;-
login by Facebook
login by Email
Login by Twitter



Regression Test:-
signup by facebook
signup by twitter
signup by Email

Functional Test
paymentInRs     sanity, regresstion
paymentInDollars  sanity, regresstion


1.For the groups which we need to run can be categorised in include group
Under group and run
2.For the methods from the classes which we need to exclude we will user exclude inside the group
Under group and run

?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Grouping Suite">
    <test verbose="2" preserve-order="true" name="D:/Zoom/JavaPractise/src/test/java/GroupingUnderstanding">

<groups>
    <run>
        <include name="Sanity"/>
        <exclude name="Regression"/>
    </run>
</groups>

        <classes>
            <class name="GroupingUnderstanding.Logins"/>
            <class name="GroupingUnderstanding.SignUpTests"/>
            <class name="GroupingUnderstanding.PaymentTests"/>
        </classes>


    </test>
</suite>
 */