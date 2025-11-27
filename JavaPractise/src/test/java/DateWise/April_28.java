import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class April_28 {


public static void main(String[] args){
    April_28 a89= new April_28();
    a89.catchFinally();
    a89.conversionSystem();
    a89.patternPrinting();

    }
    public void catchFinally(){

    try{
        int a=10;
        System.out.println(a/0);
   }
    catch(Exception e){
        System.out.println(e.getMessage());
        }
    finally {
        System.out.println("exception handled easily");
    }




    }

    public void conversionSystem(){
    String n2="123456";
    String n1="88989";

        System.out.println(Integer.parseInt(n2)+Integer.parseInt(n1));
    }

    public void patternPrinting(){

        for(int j=1;j<=4;j++) {
            for (int i = j; i <= 4; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}



