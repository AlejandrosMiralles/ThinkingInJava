package Operators;

class E14 {
    public static void main(String[] args) {
        String rimaXXIBecquer = "¿Qué es poesía?, dices mientras en mi pupila tu pupila azul, ¡Qué es poesía! ¿Y tú me lo preguntas? Poesía...eres tú.";
        String almaAusenteLorca = "Tardará mucho en nacer, si es que nace, un andaluz tan claro, tan rico de aventura. Yo canto su elegancia con palabras que gimen y recuerdo una brisa triste por los olivos";
        
        String malaCopia = "¿Qué es poesía?, dices mientras en mi pupila tu pupila azul, ¡Qué es poesía! ¿Y tú me lo preguntas? Poesía...eres tú.";
        String buenaCopia = rimaXXIBecquer;

        System.out.print("Lorca == Becquer: "+(rimaXXIBecquer == almaAusenteLorca)+"\nLorca.equals(Becquer): "+almaAusenteLorca.equals(rimaXXIBecquer));
        System.out.println("\nLorca != Becquer: "+(rimaXXIBecquer != almaAusenteLorca));
        System.out.println("\n\nCopia mala con ==: "+(malaCopia == rimaXXIBecquer)+"\tBuena copia con ==: "+(buenaCopia == rimaXXIBecquer));
        System.out.println("Copia mala con equals: "+malaCopia.equals(rimaXXIBecquer)+"\tBuena copia con equals: "+buenaCopia.equals(rimaXXIBecquer));
    }
}
