package String;

import java.util.regex.Pattern;

public class Ex7PatternExercise {
    public static void main(String[] args) {
        Pattern expresionRegular = Pattern.compile("^[A-Z]\\.$");

        encajanONo(expresionRegular, "Achus");
        encajanONo(expresionRegular, "A.");
        encajanONo(expresionRegular, "achus");
        encajanONo(expresionRegular, "achus.");
        
    }

    private static void encajanONo(Pattern expresionRegular, String aEncajar ) {
        if (expresionRegular.matcher(aEncajar).matches()){
            System.out.println("Se relaciona con " + aEncajar);
        }
    }
}
