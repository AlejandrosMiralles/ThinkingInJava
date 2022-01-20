package EverythingIsAnObject;

public class Seven {
    static char[] number = "Baka".toCharArray();
    static void incrementable(char[] c){ c[0]++  ;}

    static void printArray(char[] printeable){
        for (int i = 0; i < printeable.length; i++) {
            System.out.print(printeable[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("0 veces: "+ number.toString());

        System.out.println("1 vez: "+ number.toString());

        incrementable(number);
    
        System.out.print("2 veces: ");
        printArray(number);
    }
}
