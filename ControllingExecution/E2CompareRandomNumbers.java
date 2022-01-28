package ControllingExecution;

public class E2CompareRandomNumbers {
    static void greLesEqual(int num1, int num2){
        if(num1>num2){ System.out.println(""+num1+" is higher than "+num2);}
        else if(num1<num2){ System.out.println(""+num1+" is less than "+num2);}
        else{System.out.println("Both numbers are equals");}
    }

    static int generateIntNumber(){ return (int) (Math.random() * 100); }

    public static void main(String[] args) {
        int num2, num1 = generateIntNumber();

        final int restriction = 25;
        for (int i = 0; i < restriction; i++){
            ///~while(true){}
            num2 = generateIntNumber();
            greLesEqual(num1, num2);
            num1 = num2;
        }
    }
}