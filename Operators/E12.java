public class E12 {

    static void printVariable(int variable){ System.out.println("Hexagesimal: "+Integer.toHexString(variable)+"\t\tBinary: "+Integer.toBinaryString(variable));}
    public static void main(String[] args) {
        int variable = ~0;

        printVariable(variable);
        variable <<= 1;
        printVariable(variable);

        variable >>= 1;
        printVariable(variable);

        do {
            variable >>>= 1;
            printVariable(variable);
        } while (variable != 0);
    }
}