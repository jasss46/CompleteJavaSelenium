package ConditionStatements;

public class Number3 {
    public static void main(String[] args) {
        int orderAmount = 50;
        double deliveryCharge = 0;
        if (orderAmount > 5000) {
            deliveryCharge = 0;
        } else if (orderAmount > 2000) {
            deliveryCharge = 50;
        } else if (orderAmount > 500) {
            deliveryCharge = 100;
        } else {
            deliveryCharge = 500;
        }
        System.out.println(deliveryCharge);

    }
}


//Delivery Charges Based on Order Amount
//If order amount is more than ₹5,000, delivery is free.
//If order amount is between ₹2,000 and ₹5,000, delivery charge is ₹50.
//If order amount is between ₹500 and ₹2,000, delivery charge is ₹100.
//Otherwise, delivery charge is ₹150.

