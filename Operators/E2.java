package Operators;

class E2{

    float value;

    static void reValueF(E2 object){ object.value = 345;}
    public static void main(String[] args) {
        E2 tester1 = new E2();

        tester1.value = 23;

        System.out.println("Float = "+ tester1.value);

        reValueF(tester1);

        System.out.println("Float = "+tester1.value);
    }
}