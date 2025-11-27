package ConditionStatements;

public class Number6 {
    public static void main(String[] args){
        int data= 10;
        int cost=0;
        if(data>100){
            cost=1500;
        }
       else if (data>50){
            cost=1000;
        }
        else if (data>20){
            cost=700;
        }
        else{
            cost=500;
        }
        System.out.println("The data pack is:"+data+"GB");
        System.out.println("The plan of the data will be: Rs"+cost);
    }
}

//Mobile Data Plan Pricing
//If data usage is more than 100GB, the plan costs ₹1,500.
//If data usage is between 50GB and 100GB, the plan costs ₹1,000.
//If data usage is between 20GB and 50GB, the plan costs ₹700.
//Otherwise, the plan costs ₹500.