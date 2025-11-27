package DateWise;

public class Calculator {

    public static void main(String[] args){

        Calculator a8= new Calculator();
        a8.add(77,99);
        a8.subtract(90,88);
        a8.multiply(88,9);

    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void subtract(int a, int b){
        System.out.println(a-b);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
}
