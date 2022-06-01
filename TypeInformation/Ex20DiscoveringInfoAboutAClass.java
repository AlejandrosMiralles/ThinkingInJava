package TypeInformation;

import java.util.ArrayList;

/**
 * Intentar hacer un programa que, dada una clase dese la linea de comandos, sea capaz de imprimir todos 
 * los atributos(visibilidad,statica/final o no, tipo, nombre y valor(si tiene) ) y
 *               métodos(visibilidad,statica/final o no, objeto a devolver, nombre y parametros) 
 * que esta clase y sus padres puedan tener. Además del nombre de su clase y el paquete, sus padres y las interfaces
 * 
 * TODO: depurar con clases con metodos y atributos privados(incluso si son de sus padres), +
 * clases que sean arrays, que tengan constructores y más cosas "extrañas". 
 * Mirar los métodos de la clase Class<T> para saber qué checkear
 */
public class Ex20DiscoveringInfoAboutAClass {

    public static void imprimirAtributos(Class<?> claseAAnalizar){}

    public static void imprimirMetodos(Class<?> claseAAnalizar){}

    public static void imprimirDatosClase(Class<?> claseAAnalizar){
        //Nombre de la clase + paquete (si tiene)
        Package paqueteDeLaClase = claseAAnalizar.getPackage();
        if (paqueteDeLaClase != null){
            System.out.print("Clase: " + paqueteDeLaClase + "." + claseAAnalizar.getName());
        }else{
            System.out.println("Clase: " + claseAAnalizar.getName());
        }

        //Clase padre
        if (claseAAnalizar.getSuperclass() != null){
            System.out.println(" extends " + claseAAnalizar.getSuperclass());
        }

        //Interfaces que implementa
        Class<?>[] interfaces = claseAAnalizar.getInterfaces();
        if(interfaces != null && interfaces.length > 0){
            System.out.print("implements " + interfaces[0].getName());
            for (int i = 1; i < interfaces.length; i++) {
                System.out.println(", " + interfaces[1]);
            }
        }

    }

    public static Class<?>[] sacarPadres(Class<?> claseAAnalizar){
        ArrayList<Class<?>> clasesPadres = new ArrayList<>();

        for (Class<?> padre = claseAAnalizar.getSuperclass(); padre != null; padre = padre.getSuperclass()) {
            clasesPadres.add(padre);
        }

        return (Class<?>[])clasesPadres.toArray();
    }

    public static void main(String[] args) {
        String nombreClaseAAnalizar;

        if(args.length > 0){
            nombreClaseAAnalizar = args[0];
        }else{
            nombreClaseAAnalizar = "java.lang.String"; //Ejemplo
        }

        Class<?> claseAAnalizar;

        try {
            claseAAnalizar = Class.forName(nombreClaseAAnalizar);
        } catch (Exception e) {
            System.out.println(e + "\n\n\n");
            claseAAnalizar = nombreClaseAAnalizar.getClass();
        }

        Class<?>[] padres = sacarPadres(claseAAnalizar);

        System.out.println("____________Clases____________");
        imprimirDatosClase(claseAAnalizar);
        for (Class<?> padre : padres) {
            imprimirDatosClase(padre);
        }

        System.out.println("__________Atributos____________");
        imprimirAtributos(claseAAnalizar);
        for (Class<?> clasePadre : padres) {
            imprimirAtributos(clasePadre);
        }

        System.out.println("____________Metodos___________");
        imprimirMetodos(claseAAnalizar);
        for (Class<?> clasePadre : padres) {
            imprimirMetodos(clasePadre);
        }

    }
}
