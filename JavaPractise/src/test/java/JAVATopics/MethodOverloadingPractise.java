package JAVATopics;

public class MethodOverloadingPractise {

    /*
    There are four rules for the Method Overloading:
    1. METHOD NAME should be same.                     like m1()
    2. Number of PARAMETERS should be different.
    3. DATA TYPE of parameter should be different.     int, double
    4.Order of PARAMETERS should be different.         double, int

    **NOTE** If the method name is same and there is another method with same name and same parameters with return type then also
    it will not work.

     */

    public static void main(String[] args) {
        MethodOverloadingPractise v90= new MethodOverloadingPractise();
        v90.m1(5584,54);
        v90.m1(9,9948.99);
        v90.m1(849.498,9);
        v90.m1(8898.99,89);
        v90.m1(484.4,4,"Jaswinder Singh");
    }

      public void m1(int a, int b){

        System.out.println(a+b);
      }
      public void m1(int a, double b){

        System.out.println(a+b);
      }
      public void m1(double a, int b )
      {

          System.out.println(a+b);
      }
      public void m1(double a, int b, String name){

        System.out.println(a+b+name);
      }





}
