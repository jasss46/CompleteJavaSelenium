package ConditionStatements;

public class Number4 {
    public static void main(String[] args){
        int age=50;
        int price=0;
        if (age<18){
            price=1500;

        }
        else if (age>18){
            price=2500;
        }
        else if (age>40){
            price=2000;
        }
        else{
            price=1800;
        }
        System.out.println(age);
        System.out.println(price);
    }
}
