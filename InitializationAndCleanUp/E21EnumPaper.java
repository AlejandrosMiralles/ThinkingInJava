package InitializationAndCleanUp;

enum Papers{
    A1, A2, A4, A5
}

public class E21EnumPaper {
    static String description(Papers type){
        switch(type){
            case A1: return "Hoja estándar";
            case A2: return "Hoja estándar grande";
            case A4: return "Cartulina";
            case A5: return "Estandarte";
            default: return "";
        }
    }

    public static void main(String[] args) {
        for (Papers typePaper : Papers.values()) {
            System.out.println(typePaper+"\tPosición: "+typePaper.ordinal()+"\tDescripción: "+description(typePaper));
        }
    }

}

