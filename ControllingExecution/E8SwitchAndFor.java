package ControllingExecution;

/**
 * E8Switch&For
 */
class E8SwitchAndFor {
    public static void main(String[] args) {
        for ( int i = 0; i < "Hello Wolrd".length(); i++) {
            switch (i){
                case 1: System.out.print("Hello"); break;
                case 2: System.out.print(' '); break;
                case 3: System.out.print("World"); break;
                case 4: System.out.println("!"); break;
                default: 
            }
        }
    }
}