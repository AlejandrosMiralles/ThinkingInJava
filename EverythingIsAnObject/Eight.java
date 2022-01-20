package EverythingIsAnObject;

public class Eight {
    static int trueStatic= 0;
    int falseStatic = 0;

    public static void main(String[] args) {
        Eight object;
        int times = 10;

        for (int i = 0; i < times+1; i++) {
            object = new Eight();

            System.out.println("Suma número "+i+":");
          //  System.out.println("\tValor del estático: "+object.trueStatic);
            System.out.println("\tValor sel NO estático: "+object.falseStatic);
            System.out.println("___________________________________\n");

        //    ++object.trueStatic;
            ++object.falseStatic;
        }
    }
}
