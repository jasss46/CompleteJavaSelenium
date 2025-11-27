package TestNGUnderstanding.BAT;

import java.sql.SQLOutput;

public class HostProvider {

    public static void main(String[] args){
      //Swapping two numbers
//Logic 1
//        int a=10,b=30;

//        int t=a;
//        a=b;
//        b=t;
//        System.out.println(b+""+a);



        //Logic 2
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a+""+b);




        String actualStr= "MadaM";
        String rev="";

        for(int i=actualStr.length()-1; i>=0; i--){
            rev=rev+actualStr.charAt(i);
        }

        System.out.println(rev);

        if(rev.equals(actualStr)) {
            System.out.println("String is Palidrome");
        }else{
                System.out.println("String is not Palidrome");
            }
        }











    }

