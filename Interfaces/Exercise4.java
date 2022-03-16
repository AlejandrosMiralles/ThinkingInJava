package Interfaces;

public class Exercise4 extends AbstractE4 {
    void metodo(){ System.out.println("metodo hecho");}

    static void methodToPerform(){
        AbstractE4 objecto = new Exercise4();

         ((Exercise4) objecto).metodo();
    }

    public static void main(String[] args) {
        methodToPerform();
    }
}

abstract class AbstractE4{}
