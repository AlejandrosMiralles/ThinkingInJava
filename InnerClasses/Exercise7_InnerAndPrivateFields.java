package InnerClasses;

interface InnerClass{}

public class Exercise7_InnerAndPrivateFields {
    private int oh = 0;
    private void toPrint(){ System.out.println(oh);}

    private InnerClass innerclass(){
        return new InnerClass(){
            {
                oh++;
                toPrint();
            }
        };
    }

    private static void testing() {
        Exercise7_InnerAndPrivateFields tester = new Exercise7_InnerAndPrivateFields();
        tester.innerclass();
    }

    public static void main(String[] args) {
        testing();
    }
    
}
