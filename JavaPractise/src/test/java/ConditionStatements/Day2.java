package ConditionStatements;

public class Day2 {
    public static void main(String[] args) {
        int income = 10000;
        double tax = 0;
        double net = 0;
        double netPayable = 0;
        if (income > 1000) {
            tax = income * 0.03;
        } else if (income > 700) {
            tax = income * 0.02;
        } else if (income > 500) {
            tax = income * 0.01;
        } else {
            tax = 0;
        }
        netPayable = income - tax;
        System.out.println(income);
        System.out.println(tax);
        System.out.println(netPayable);
    }
}
