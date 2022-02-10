package InitializationAndCleanUp;

public class E16CreatingStringArrays {

    static E16CreatingStringArrays[] lista = { 
        new E16CreatingStringArrays("Yooooooo"),
        new E16CreatingStringArrays("What's up")
    };

    public E16CreatingStringArrays(String arg) {
        System.out.println(arg);
    }

    static void printStringArray(String... array){
        for (String aImprimir : array) {
            System.out.print(aImprimir);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStringArray("Hola", "Mundo","!");

        
        printStringArray("Esto es jodida","mente alucinante");

    }
}
