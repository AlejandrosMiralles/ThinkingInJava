package InitializationAndCleanUp;

public class E20MainVararg {
    public static void main(String... args) {
        for (String string : args) {
            System.out.println(string);
        }
    }
}
