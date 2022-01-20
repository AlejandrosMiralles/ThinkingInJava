package EverythingIsAnObject;

public class Four {
    int i;
    char c;
    String s;

    public static void main(String[] args) {
        Four object = new Four();

        object.i= 4;
        object.c = 40;
        object.s = "{1, 0}";

        System.out.println("i = "+object.i);
        System.out.println("c = "+object.c);
        System.out.println("S = "+object.s);
    }
}
