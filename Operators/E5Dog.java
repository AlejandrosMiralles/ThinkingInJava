package Operators;

class E5Dog {
    String name;
    String says;

    E5Dog(String dogName, String dogSays){
        name = dogName;
        says = dogSays;
    }

    public static void main(String[] args) {
        E5Dog dog1 = new E5Dog("Spot", "Ruff");
        E5Dog dog2 = new E5Dog("Scruffy", "Wurf");

        System.out.printf("Dog1:\n\t\tName: %s\n\tSays: %s\n\nDog2:\n\t\tName: %s\n\tSays: %s", dog1.name, dog1.says,
                                dog2.name, dog2.says);

        E5Dog dogTest = dog1;

        System.out.println("\n\nDog1.equals(dogTest): "+dog1.equals(dogTest)+"\nDog1 == DogTest: "+(dog1==dogTest));
    }
}