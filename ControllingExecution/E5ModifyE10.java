package ControllingExecution;

public class E5ModifyE10 {
    static String intToBinary(int number){
        if (number>-1){
            if (number>1){ return ""+intToBinary(number/2)+number%2; }
            return "" + number;
        }
        char[] resultPositive = intToBinary((-number)-1).toCharArray();
        String finalResult = "";
        //Creo un nuevo array por limitaciones de los arrays (no los puedo ampliar)
        char[] resultTransformer = new char[32];

        for (int i = 0; i < resultTransformer.length; i++) {resultTransformer[i]='0';}
        for (int i = resultPositive.length-1; i >= 0; i--) { resultTransformer[31+i-resultPositive.length-1] = resultPositive[i];}

        for (int i = 0; i < resultTransformer.length; i++) { resultTransformer[i] = resultTransformer[i]=='1' ? '0' : '1';}

        finalResult = String.valueOf(resultTransformer);

        return finalResult;
        
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 3;

        num1 = ~num2;

        System.out.println(num1);

        System.out.println("Mi método:\nNum1: "+intToBinary(num1)+"\tNum2: "+intToBinary(num2));
        System.out.println("Solución:\nNum1: "+Integer.toBinaryString(num1)+"\tNum2: "+Integer.toBinaryString(num2));
        /*
        System.out.println("num1: "+intToBinary(num1)+"\tnum2: "+intToBinary(num2));
        
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println("num1: "+intToBinary(num1)+"\tnum2: "+intToBinary(num2));
        */    
    }
}