package Loops;

public class ThisAndThat {
    public static void main(String[] args){

        ThisAndThat   v8=    new ThisAndThat();
        v8.newMethod_1();
       String v0=    v8.newMethod_2();
        System.out.println(v0);

        v8.newMethod_3(89,99,"Jaswinder Singh");

     newRecentOne(58,5455,44,"Jass");
    }

    public void newMethod_1(){
        int a=102;
        int b=545;
        System.out.println(a+b);
    }

    public String newMethod_2(){
        return "Jaswinder Singh";
    }

    public void newMethod_3(int a, int b, String name){
        System.out.println(a+" "+b+name);
    }

    public static void newRecentOne(int c, int u, int e, String few){
        System.out.println(c+" "+u+" "+e+" "+few);
    }



}
