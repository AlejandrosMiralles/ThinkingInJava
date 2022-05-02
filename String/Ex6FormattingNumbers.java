package String;

import java.util.Formatter;

public class Ex6FormattingNumbers {
    private int integer = 34;
    private long longest = 343830598;
    private float floater = (float) 456.3465;
    private double doubled = 346664.43;

    @Override
    public String toString() {

        String result = "";
        result += String.format("%d \t", integer);
        result += String.format("%d \t", longest);
        result += String.format("%f \t", floater);
        result += String.format("%e \t", doubled);

        return result;
    }

    public void printIt(){
        
        Formatter makerUp = new Formatter(System.out);

        makerUp.format("%e", (double) longest);

        makerUp.close();
    }

    public static void main(String[] args) {
        new Ex6FormattingNumbers().printIt();
    }
}
