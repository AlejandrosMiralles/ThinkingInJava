package Interfaces;

public class Exercise5 {
    static String swampingCharacters(String arg){
        String result = "";

        for (int i = 0; i < arg.length(); i+=2) {
            result+= arg.charAt(i+1);
            result+= arg.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println( swampingCharacters("Pelele"));
    }
}
