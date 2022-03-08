package Polymorphism;

public class Exercise17 {
    static void rides(Cycle17 bike){
        System.out.println("grrrrrrrrrr");
    }
    public static void main(String[] args) {
        Unicycle17 mono = new Unicycle17();
        Bicycle17 bi = new Bicycle17();
        Tricycle17 tri = new Tricycle17();

        Cycle17[] yaEsta = {mono, bi, tri};

        for (Cycle17 x : yaEsta) {
            ((Unicycle17)x).balance();
        }

    }
}

class Cycle17{}
class Unicycle17 extends Cycle17{
    void balance(){ System.out.println("bip");}
}
class Bicycle17 extends Cycle17{
    void balance(){ System.out.println("bop");}
}
class Tricycle17 extends Cycle17{}