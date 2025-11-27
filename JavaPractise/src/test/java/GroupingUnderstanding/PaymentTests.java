package GroupingUnderstanding;

import org.testng.annotations.Test;

public class PaymentTests {
    @Test(priority=1,groups = {"Regression","Sanity","Functional"})
    void paymentInRs(){
        System.out.println("Payment done in Rupees ");
    }
    @Test(priority=2,groups = {"Regression","Sanity","Functional"})
    void paymentInDollars(){
        System.out.println("Payment in dollars");
    }
}
