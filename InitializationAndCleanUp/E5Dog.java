package InitializationAndCleanUp;

public class E5Dog {
    private String name;
    public String getName(){ return name;}
    public void setName(String name){ this.name = name;}

    static void bark(E5Dog dog, String message){ System.out.println(dog.getName() + ": "+message+"!");}
    static void bark(String message, E5Dog dog){ System.out.println(message+" said "+dog.getName());}

    static void bark(int number){ 
        System.out.print(number + " dogs: ");
        for (int i = 0; i < number; i++) { System.out.print("Woof!     ");} 
        System.out.println();
    }

    static void bark(){ System.out.println("Woof!");}

    public static void main(String[] args) {
        E5Dog kiru = new E5Dog();
        kiru.setName("Kiru");

        //bark();

        bark(kiru, "woof");
        bark("sniff, sniff", kiru);

        //bark(10);
    }
}
