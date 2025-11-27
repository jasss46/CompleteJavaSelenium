package Loops;

public class SimpleLoop {
    public static void main(String[] args) {



// *
//* *
//* * *
//* * * *
//* * * * *
//        for (int i=1;i<=5;i++)
//        {
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

//               for (int j=1;j<=5;j++) {
//                   for (int i = 1; i <= 5; i++) {
//                       System.out.print("*");
//                   }
//                   System.out.println();
//               }

//1
//2 3
//4 5 6
//7 8 9 10
//        int number=1;
//        for (int j=1;j<=5;j++) {
//            for (int i = 1; i <= j; i++) {
//                System.out.print(number);
//                number++;
//            }
//            System.out.println();
//        }

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//     for (int j=1;j<=4;j++) {
//
//         for (int i = 1; i <=j; i++) {
//             System.out.print(i);
//         }
//         System.out.println();
//     }




//        1
//        0 1
//        1 0 1
//        0 1 0 1

        for( int i=1;i<=4;i++) {
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(sum);
                }
                else{
                    System.out.print(sum);
                }


            }
            System.out.println();
        }


    }
}
