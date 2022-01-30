package ControllingExecution;

public class E10VampireNumber {
    static boolean tooMuchZeros(String number){
        byte count = 0;
        for (int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == '0'){ ++count;}
        }
        return count >= number.length()/2;
    }

    static int transCharNumbToInt(char charact){ return (int) (charact - '0');}

    static boolean testLeftDigits(String number, int i, int j){
        int num1, num2;
        for (int z = 0; z < number.length(); z++) {
            if (z == i || z == j){ continue;}

            for (int k = 0; k < number.length(); k++) {
                if (k == i || k==j || k==z){ continue;}

                num1 =  Integer.parseInt(""+number.charAt(i)+ number.charAt(z));
                num2 = Integer.parseInt(""+number.charAt(j)+ number.charAt(k));

                if (num1 * num2 == Integer.parseInt(number)){ System.out.println(num1+" x "+num2+" = "+number); return true;}
            }
        }

        return false;
    }

    static void banpireNumber(int vampire){
        String banpire = "" + vampire;

        if ((banpire.length() & 1) == 1){ return;}

        if (tooMuchZeros(banpire)){ return;}
 
        for (int i = 0; i < banpire.length(); i++) { char digit = banpire.charAt(i);

            if (digit == '0'){ continue;}

            int secondNumber = (vampire / 100) / transCharNumbToInt(digit);
            for (int j = i+1; j < banpire.length(); j++) {

                if (moreOrLess( transCharNumbToInt(banpire.charAt(j)), secondNumber)){ 
                    if (testLeftDigits(banpire, i, j)){ return ; }
                }
            }
        }
        return;
    }

    private static boolean moreOrLess(int firstNumber, int secondNumber) {
       /*
        switch(secondNumber){
            case (firstNumber):
            case (firstNumber+1):
            case (firstNumber-1): return true;
            default: return false;
        }
        */
        if (secondNumber == firstNumber || secondNumber == firstNumber + 1 || secondNumber == firstNumber -1){ return true;}
        if (secondNumber == firstNumber +2 || secondNumber == firstNumber -2){ return true;}
        return false;
    }

    public static void main(String[] args) {
        
        for (int i = 1000; i < 10000; i++) {
            try{ banpireNumber(i);}
            catch(ArithmeticException e1 ){ System.out.println("Error with the number: "+i);}
            
        }
    }
}