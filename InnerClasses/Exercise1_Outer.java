package InnerClasses;

public class Exercise1_Outer {
    class Inner{
        void f(){ System.out.println("yeeee");}
    }

    Inner inner(){ return new Inner();}

    public static void main(String[] args) {
        new Exercise1_Outer().inner().f();
        Exercise1_Outer manolo = new Exercise1_Outer();
        manolo.inner().f();
    }
}
