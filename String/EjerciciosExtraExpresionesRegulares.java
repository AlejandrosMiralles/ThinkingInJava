package String;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EjerciciosExtraExpresionesRegulares {
    public static void main(String[] args) {
        System.out.println(W3ResourcesRE.diecinueve("qrss"));
        System.out.println(W3ResourcesRE.diecinueve("sdcsdocsmqqpwqer"));
    }
}

//https://www.w3resource.com/java-exercises/re/index.php
class W3ResourcesRE{

    static String diecinueve(String string){
        final char[] specificCharacterToRemove = {'q', 'r', 's'};
        for (char c : specificCharacterToRemove) {
            string = string.replaceAll("" + c, "");
        }
        return string;
    }

    static boolean deiciocho(int string){
        return Pattern.matches("\\d{4}|\\d{6}|\\d{8}", string + "");
    }

    static int deicisiete(int string){
        return ("" + string).length();
    }

    static String dieciseis(String string, char replacement){
        return string.replaceAll("[aeiou]", "" + replacement);
    }

    static String quince(String string){
        return string.replaceAll("[aeiou]", "");
    }

    static int catorce(String string){
        return string.replaceAll("(?i)[^aeiou]", "").length();
    }

    static String trece(String string){
        return (Pattern.matches("(?i).*python.*", string)) ? "Java" : "C++";
    }

    static String doce(String string){
        string = string.replaceAll("Python", "Java")  ;
        string = string.replaceAll("code", "coding")  ;

        return string;
    }

    static boolean once(String frase, int numeroAAcabar){
        boolean loContiene;

        loContiene = Pattern.matches(numeroAAcabar + "$", frase);

        return loContiene;
    }
    
    static String diez(String iP){
        /** Mi idea (peor :( )
         * 
            StringBuilder idBuena = new StringBuilder();

            for (String parteDeLaIP : iP.split("((^0+)|(\\.0+))")) {
                idBuena.append(parteDeLaIP + '.');
            }

         */

        StringBuilder idNuevaBuena = new StringBuilder(iP.replaceAll("(?<=^|\\.)0+", ""));
        

        return idNuevaBuena.toString();
    }

    static boolean nueve(String frase, int numeroAComenzar){
        boolean loContiene;

        loContiene = Pattern.matches("^" + numeroAComenzar + ".*", frase);

        return loContiene;
    }

    static boolean ocho(String frase){
        boolean loContiene;

        loContiene = Pattern.matches("[\\w_]*", frase);

        return loContiene;
    }

    static String siete(String frase){
        String elPatronEncontrado = null;

        Matcher matcher = Pattern.compile("[a-zA-Z]+g[a-zA-Z]+").matcher(frase);
        if (matcher.find())
            elPatronEncontrado = matcher.group();

        return elPatronEncontrado;
    }

    static String seis(String frase){
        String elPatronEncontrado = null;

        Matcher matcher = Pattern.compile("\\w+g\\w+").matcher(frase);
        if (matcher.find())
            elPatronEncontrado = matcher.group();

        return elPatronEncontrado;
    }

    static boolean cinco(String frase){
        boolean loContiene;

        loContiene = Pattern.matches("p.*q$", frase);

        return loContiene;
    }

    static String cuatro(String frase){
        String elPatronEncontrado = null;

        Matcher matcher = Pattern.compile("[A-Z][a-z]").matcher(frase);
        if (matcher.find())
            elPatronEncontrado = matcher.group();

        return elPatronEncontrado;
    }

    static String tres(String frase){
        String elPatronEncontrado = null;

        Matcher matcher = Pattern.compile("[a-z]+_[a-z]+").matcher(frase);
        if (matcher.find())
            elPatronEncontrado = matcher.group();

        return elPatronEncontrado;
    }

    static boolean dos(String frase){
        boolean loContiene;

        loContiene = Pattern.matches("pq*", frase);

        return loContiene;
    }

    static boolean uno(String frase){
        boolean loContiene;

        loContiene = Pattern.matches("[a-zA-Z0-9]*", frase);

        return loContiene;
    }   
}