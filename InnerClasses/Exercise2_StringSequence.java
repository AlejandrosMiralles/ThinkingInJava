package InnerClasses;

public class Exercise2_StringSequence {
    private Object[] items;
    private int itemsAlreadyIncluded = 0;
    Exercise2_StringSequence(int lenght){ items = new Object[lenght];}

    void addItem(Object item){
        if (!(itemsAlreadyIncluded> items.length)){ items[itemsAlreadyIncluded++] = item;}
    }

    private class StringClass{
        String identity;

        StringClass(String identity){ this.identity = identity;}

        @Override
        public String toString() {
            return identity;
        }
    }

    StringClass stringClass(String identity){ return new StringClass(identity);}

    public static void main(String[] args) {
        Exercise2_StringSequence almacen = new Exercise2_StringSequence(3);

        almacen.addItem(almacen.stringClass("Pepe"));
        almacen.addItem(almacen.stringClass("Juan"));
        almacen.addItem(almacen.stringClass("Don Juan"));
    
        for (Object item : almacen.items) {
            System.out.println(((Exercise2_StringSequence.StringClass)item).toString());
        }
    }
}
