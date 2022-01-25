public class E10 {
    public static void main(String[] args) {
        int num1 = 0xA8C5;
        int num2 = 0xB39A;

        System.out.println("num1: "+num1+"\tnum2: "+num2);
        
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println("num1: "+num1+"\tnum2: "+num2);
    }
}
