package TypeInformation;

//import java.lang.reflect.Field;
//import java.util.ArrayList;

public class Ex8And9DiscoveringHierarchyAtRT {
    /*
    private static class Ex8{
        static void printingTree(Object youngestCLass){
            if (youngestCLass == null) return;
            ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
            
            for (Class<?> actualClass = youngestCLass.getClass(); actualClass != null; 
                        actualClass = actualClass.getSuperclass()) {
                classes.add(actualClass);
            }

            for (Class<?> class1 : classes) {
                System.out.println(class1.getName() + "\n");
            }
            
        }
    }
    */
    /*
    private static class Ex9{
        static void printingTree(Object youngestCLass){
            if (youngestCLass == null) return;

            ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
            
            for (Class<?> actualClass = youngestCLass.getClass(); actualClass != null; 
                        actualClass = actualClass.getSuperclass()) {
                classes.add(actualClass);
            }

            for (Class<?> class1 : classes) {
                System.out.println(class1.getSimpleName() + ":\t");
                try {
                    for (Field field : class1.getDeclaredFields()) {
                        System.out.println(field.getType() + ":" + field.getName() + "\n");
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("\n");
            }
            
        }
    }
    */
    public static void main(String[] args) {
        //Ex8.printingTree(null);

        //Ex9.printingTree(null);
    }
}
