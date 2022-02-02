package InitializationAndCleanUp;

public class E3PrintOnAConstructor {
    E3PrintOnAConstructor(){
        System.out.println("Esto furula");
    }

    E3PrintOnAConstructor(String message){
        System.out.println("Esto furula. Look:");
        System.out.println(message);
    }

    public static void main(String[] args) {
        new E3PrintOnAConstructor();
        new E3PrintOnAConstructor("DuDuDuDuDuDuDuelo!!!");
    }
}
