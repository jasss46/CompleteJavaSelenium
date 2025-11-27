package Extras;

public class ConstructorPractise {



    int a,b,c,d;
    String newName;
    public static void main(String[] args) {

        ConstructorPractise v8= new ConstructorPractise();
       v8.show();
        ConstructorPractise v9=              new ConstructorPractise(885,885);
        v9.show();


    }

    ConstructorPractise(){
        a=100;
        b=566;


        }
    ConstructorPractise(int x, int y){
        a=x;
        b=y;
    }
    public void show(){
        System.out.println(a+b);

    }

        }





