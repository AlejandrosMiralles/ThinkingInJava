package ControllingExecution;

public class E9Fibonacci {
    private static int num1= 1, num2 = 1;

    static void resetFibonacci(){ num1 = num2 = 1;}

    static void nextNumber(){
        int num3 = num1;
        num1 = num3+num2;
        num2 = num3;
    }

    static void fibonacci(int restriction){
        switch(restriction){
            case 1: System.out.println(num1); return;
            case 2: System.out.println(""+num1+" "+num2); return;
            default: System.out.printf("%d %d", num1, num2); 
                for (int i = 0; i < restriction; i++) {
                    nextNumber();
                    System.out.print(" "+ num1);
                }
                System.out.println("");
                resetFibonacci();
        }
    }

    public static void main(String[] args) {
        System.out.println("________________-Test1-_________________");
        fibonacci(15);
        System.out.println("________________-Test2-_________________");
        fibonacci(20);
    }
}
