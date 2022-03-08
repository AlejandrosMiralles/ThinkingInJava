package Polymorphism;

/**
 * Parte de la gracia del ejercicio está en explicar el propio ejercicio
 * Primero se cargarían los métodos y atributos estáticos de las clases. Como no hay, no se hace;
 * Segundo se crea una variable declarada como "PadreDel10" al que se le pasa un objeto "10". Es decir, hay un "upcasting";
 * Tercero se realiza el primerMetodo de tester, que es heredado de su padre. A su vez, este llama al segundoMetodo, 
 *  el cual ha sobrescrito su hijo. Por lo que al copilar, se accede al método del hijo. Y pasa lo que pasa;
 */

public class Exercise10 extends PadreDel10{
    @Override
    String segundoMetodo(){ return "1000101010102021001010101";}

    public static void main(String[] args) {
        PadreDel10 tester = new Exercise10();
        tester.primerMetodo();
    }
}

class PadreDel10{
    void primerMetodo(){
        System.out.println("Yooooooo, soy el primer método bitcheeessss");
        System.out.println("\n"+segundoMetodo()+"; y somos los padres del 10");
    }

    String segundoMetodo(){ return "Buenas, yo soy el segundo método. Un placer conocerle.";}
}