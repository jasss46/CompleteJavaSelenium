package ConditionStatements;

public class Proper {
    public static void main(String[] args){
//        Write a program to check if a number is positive, negative, or zero.

//        int number=-98;
//
//        if( number >0){
//            System.out.println("Positive number");
//        }
//       else if (number <0){
//            System.out.println("Negative Number");
//        }
//       else{
//            System.out.println("Number is zero");
//        }


//        Write a program to check if a number is even or odd.

//        int k=54;
//
//        if (k % 2 == 0) {
//            System.out.println("Even Number");
//        }
//        else{
//            System.out.println("Odd Number");
//        }


//        Write a program to find the largest of three numbers.
//
//
//        int a=55,b=56,c=99;
//
//   if ( a>b&& a>c){
//       System.out.println("a is the largest number");
//   }
//   else if( b>a&& b>c){
//       System.out.println("b is the largest number");
//   }
//   else{
//       System.out.println("c is the largest number");
//   }

//

//        Write a program to check if a number is divisible by both 3 and 5.

//

//        Write a program to check if a person is eligible to vote.


//        Write a program to check whether a number is between 100 and 999.
//        int number= 102;
//        if (number>=100&& number<=999){
//            System.out.println("number lies between 100 to 999");
//        }
//        else{
//            System.out.println("number not lies in bewteen the range");
//        }

     //   Write a program to check whether a character is a vowel or consonant.

//        char c= 'A';
//        if ( c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u' ||c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')){
//            System.out.println("c is a vowel");
//        }
//        else {
//            System.out.println("c is a constant");
//        }


//        Online Shopping Discount System
//        Apply discounts based on cart value:
//
//≥ ₹1,000 → 5%
//
//≥ ₹5,000 → 10%
//
//≥ ₹10,000 → 20%
//
//                Apply GST after discount


        double price=98985;
        double discount=0;
        if (price>=1000){
            discount= 0.05*price;

        }else if (price>=5000){
            discount= 0.10*price;

        }else if(price>=10000){
            discount= 0.20*price;
        }
      double   payablePrice= price-discount;
        System.out.println(price);
        System.out.println(discount);
        System.out.println(payablePrice);



    }
}
