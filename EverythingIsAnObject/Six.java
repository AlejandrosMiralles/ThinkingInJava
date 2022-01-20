package EverythingIsAnObject;

public class Six {
    int storage(String s){ return s.length() * 2;}

    public static void main(String[] args) {
        Six object = new Six();

        System.out.println(object.storage("SuperCalifragilisticoEspiadiloso"));
    }
}