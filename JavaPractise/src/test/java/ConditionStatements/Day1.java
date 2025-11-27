package ConditionStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day1 {

    public static void main( String[] args){

       int speed = 69;
       double fine=0;
       if (speed >100){
           fine=2000;
       }
       else if (speed>80){
           fine=1500;
       }
       else if (speed>60){
           fine= 1000;
       }
       else if(speed<60){
           fine=0;
       }
        System.out.println("The speed of the vehicle is: "+speed);
        System.out.println("The fine applied will be: "+fine);
    }
}


//Speed Limit Fine:
//If a driver’s speed is greater than 100 km/h, the fine is ₹2,000.
//If the speed is between 80 km/h and 100 km/h, the fine is ₹1,500.
//If the speed is between 60 km/h and 80 km/h, the fine is ₹1,000.
//Otherwise, there is no fine.
