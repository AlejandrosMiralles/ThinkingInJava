package String;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EjerciciosExtraExpresionesRegulares {
    public static void main(String[] args) {
        System.out.println(W3ResourcesRE.diez("00100.0010.0100.0200"));
        System.out.println(W3ResourcesRE.diez("132400.032410.9100.0200"));
    }
}

//https://www.w3resource.com/java-exercises/re/index.php
class W3ResourcesRE{
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