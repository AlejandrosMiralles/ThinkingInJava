package Interfaces;

public class Exercise3 extends AbstractE3{
    @Override
    void print(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        new Exercise3().print();
    }
}

abstract class AbstractE3{
    void print(){};
}
