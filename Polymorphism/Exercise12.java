package Polymorphism;

public class Exercise12 {
    public static void main(String[] args) {
        Rondent12 animal;


        System.out.println("\n________________________________MOUSE______________________________");
        animal = new Mouse12();
        escuchar(animal);

        System.out.println("\n\n______________________________Hamster_____________________________");
        animal = new Hamster12();
        escuchar(animal);

        System.out.println("\n\n_______________________________Gerbil_____________________________");
        animal = new Gerbil12();
        escuchar(animal);

        System.out.println("Gerbil = "+ Gerbil12.contador);
    }

    static void escuchar(Rondent12 animal){ 
        animal.moves();
        System.out.println("\t"+ animal.sonido());
    }
}

class Rondent12{
    static Mouse12 papa = new Mouse12();

    Rondent12(){ System.out.println("Rondent creado");}

    String sonido(){ return null;}
    void moves(){ System.out.println("Se mueve");}
}

class Mouse12 extends Rondent12{
    Hamster12 pepe = new Hamster12();

    Mouse12(){ System.out.println("Mouse creado");}

    String sonido(){ return "ñamiñami";}
}

class Hamster12 extends Rondent12{
    Gerbil12 pipi = new Gerbil12();

    Hamster12(){ System.out.println("Hamster creado");}

    String sonido(){ return "yumiyumi";}
}

class Gerbil12 extends Rondent12{
    Rondent12 popo = new Rondent12();
    static int contador = 0;

    Gerbil12(){ 
        System.out.println("Gerbil creado");
        contador++;
    }

    String sonido(){ return "yubiyubi";}
}