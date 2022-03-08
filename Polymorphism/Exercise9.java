package Polymorphism;

public class Exercise9{
    public static void main(String[] args) {
        Rondent animal;

        animal = new Mouse();
        escuchar(animal);

        animal = new Hamster();
        escuchar(animal);

        animal = new Gerbil();
        escuchar(animal);
    }

    static void escuchar(Rondent animal){ 
        animal.moves();
        System.out.println("\t"+ animal.sonido());
    }
}

abstract class Rondent{
    abstract String sonido();
    void moves(){ System.out.println("Se mueve");}
}

class Mouse extends Rondent{
    String sonido(){ return "ñamiñami";}
}

class Hamster extends Rondent{
    String sonido(){ return "yumiyumi";}
}

class Gerbil extends Rondent{
    String sonido(){ return "yubiyubi";}
}