package JAVATopics;

import java.sql.SQLOutput;

public class DataConversionUnderstanding {

    /*
    Benefits of Wrapper classes
                               1. We can convert one form of data into another.
                           int ----Integer
                           float---Float
                           double--Double
                           char--Character

                           boolean--Boolean

     */

    public static void main(String[] args) {
        String one="125";
        String two="541";
        String s="false";

        /*
        Scenerio 1 String-->int, double, boolean, char
        1.String---> int       Integer.parseint(String)
        2.String---> double    Double.parseDouble(String)
        3.String---> bool      Boolean.parseBoolean(String)
        4.String---> char      NOT POSSIBLE

         */
        System.out.println(Integer.parseInt(one)+Integer.parseInt(two));
        System.out.println(Double.parseDouble(one)+Double.parseDouble(two));
        System.out.println(Boolean.parseBoolean(s));


        /*
        Scenerio 2 int, double,boolean, char--->String
        String.valueOf()   this will convert all primitive data to String

         */

        int a=89;
        double b=98.99;
        char c='a';
        boolean d=false;

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));


    }

}
