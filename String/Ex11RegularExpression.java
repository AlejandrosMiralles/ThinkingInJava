package String;

public class Ex11RegularExpression {
    public static void main(String[] args) {
        String frase ="Airline ate eight apples and one orange ile anita adnt any";
        String patron = "(?i)(((^[aeiou])|(\s+[aeiou]))\\w+?\b)";

        for (String string : frase.split(patron)) {
            System.out.println(string);
        }
    }

}
