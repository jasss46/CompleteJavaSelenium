package ConditionStatements;

public class Loan {

    public static void main(String[] args) {
        int loanAmount = 1000000;
        double interestRate = 0;
        double net = 0;
        if (loanAmount > 100000) {
            interestRate = loanAmount * 0.12;
        } else if (loanAmount > 500000) {
            interestRate = loanAmount * 0.1;
        } else if (loanAmount > 200000) {
            interestRate = loanAmount * 0.08;
        } else {
            interestRate = loanAmount * 0.05;
        }
        net = loanAmount + interestRate;
        System.out.println("The Total Loan Amount is: " + loanAmount);
        System.out.println("The Interest rate Amount will be: " + interestRate);
        System.out.println("The net Loan Amount is: " + net);
    }
}


//Loan Interest Rate:
//If the loan amount is more than ₹10,00,000, the interest rate is 12%.
//If the loan amount is between ₹5,00,000 and ₹10,00,000, the interest rate is 10%.
//If the loan amount is between ₹2,00,000 and ₹5,00,000, the interest rate is 8%.
//Otherwise, the interest rate is 5%.


