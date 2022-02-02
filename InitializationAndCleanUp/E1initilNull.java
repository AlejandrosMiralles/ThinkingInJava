package InitializationAndCleanUp;

public class E1initilNull {
    String s;
    String s2 = "Segunda cadena";

    public E1initilNull(){
        s = "First chain";
    }

    public String toString(){
        return "First string = "+s+"\nSecond String = "+s2;
    }
    public static void main(String[] args) {
        System.out.println(new E1initilNull().toString());
    }
}
