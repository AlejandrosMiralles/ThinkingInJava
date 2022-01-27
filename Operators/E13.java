package Operators;

class E13 {
    static String charToBinary(char character){
        return Integer.toBinaryString(Character.getNumericValue(character));
    }

    static void tester(char character){ System.out.println("Character: '"+character+"'\t\tBinary: "+charToBinary(character));}

    public static void main(String[] args) {
        System.out.println("____________Pruebas___________\n");
        
        tester('a');
        tester('b');
        tester(' ');
        tester('2');
        tester('9');
    }
}
