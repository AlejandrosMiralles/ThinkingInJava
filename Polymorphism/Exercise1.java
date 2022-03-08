package Polymorphism;

public class Exercise1 {
    static void rides(Cycle bike){
        System.out.println("grrrrrrrrrr");
    }
    public static void main(String[] args) {
        rides(new Unicycle());
        rides(new Bicycle());
        rides(new Tricycle());
    }
}

class Cycle{}
class Unicycle extends Cycle{}
class Bicycle extends Cycle{}
class Tricycle extends Cycle{}