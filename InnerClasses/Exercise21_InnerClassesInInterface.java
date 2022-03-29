package InnerClasses;

interface Interhead {
    int diez = 10;
    int dos = 2;

    int suma();

    static class InnerClass{
        static int suma(){ return diez + dos;}

        public static void main(String[] args) {
            System.out.println(suma());
        }
    }
}

public class Exercise21_InnerClassesInInterface{
    public static void main(String[] args) {
        Interhead.InnerClass.main(null);
    }
}
