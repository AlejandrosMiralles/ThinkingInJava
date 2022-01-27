package Operators;

class E11{
    public static void main(String[] args) {
        int variable = 1;
        do {
            System.out.println("Variable binary: "+Integer.toBinaryString(variable)+"\tHexadecimal: "+Integer.toHexString(variable));
            variable >>>= 1;
            System.out.println(variable);
        } while (variable != 0);
    }
}