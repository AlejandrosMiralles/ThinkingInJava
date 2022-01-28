package ControllingExecution;

class E4CheckingPrimeNumbers{
    public static void main(String[] args) {
        for (int i = 3; i < 100; i++) {
            for (int j = 1; j<=i; j+=2) {
                if(i==j ? true : false){ printPrime(i);}
                else if (i%j==0 && j!=1 ? true : false){ 
                    printNoPrime(i);
                    break;
                }
            }
        }  
    }

    private static void printNoPrime(int i) {
        System.out.println(""+i+" is not a prime number.\tBinary: "+Integer.toBinaryString(i));
    }

    private static void printPrime(int i) {
        System.out.println(""+i+" is a prime number.\t\tBinary: "+Integer.toBinaryString(i));
    }
}