package ConditionStatements;

public class Number2 {
    public static void main(String[] args) {
        int units = 100;
        int charge = 0;
        if (units > 500) {
            charge = 8;
        } else if (units > 300) {
            charge = 6;
        } else if (units > 100) {
            charge = 4;
        } else {
            charge = 2;
        }
        System.out.println("Total Units are: " + units);
        System.out.println("The charge per unit will be: " + charge + "Rs per unit ");
    }
}


//Electricity Bill Calculation:
//If electricity consumption is greater than 500 units, the charge is ₹8 per unit.
//If consumption is between 300 and 500 units, the charge is ₹6 per unit.
//If consumption is between 100 and 300 units, the charge is ₹4 per unit.
//Otherwise, the charge is ₹2 per unit.