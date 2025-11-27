package JAVATopics;


/*
In method overriding process the method name should be same but the implementation part inside the methods should be different for difference classes.


1.Possible only in multiple classes inheritence.
2.Methods names are same.
3.Belongs to inheritence.
4.we should not change the signature of the method but body we should change.
 */

class Bank{
    double roi(){
        return 0;
    }
}

class ICICI extends Bank{
    double roi() {
        return 10;
    }
}

class SBI extends Bank{
    double roi(){
        return 14;
}

}
public class MethodOverridingConcept {
    public static void main(String[] args) {
         ICICI ic= new ICICI();
        System.out.println(ic.roi());
        }

    }



