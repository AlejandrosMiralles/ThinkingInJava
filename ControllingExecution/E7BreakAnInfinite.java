package ControllingExecution;

class E7BreakAnInfinite {
    public static void main(String[] args) {    
        for (int i = 1;; i++) { 
            if (i==2354){ 
                System.out.print("Con un return ");
                return;
            }
            if (i==3464363){
                System.out.print("Con un break ");
                break;
            }
        }
        System.out.println("salió del bucle infinito!!");
    }

}
