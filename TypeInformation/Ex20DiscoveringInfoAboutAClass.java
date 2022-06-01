package TypeInformation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.ArrayList;

/**
 * Intentar hacer un programa que, dada una clase dese la linea de comandos, sea capaz de imprimir todos 
 * los atributos(visibilidad,statica/final o no, tipo, nombre y valor(si tiene) ) y
 *               métodos(visibilidad,statica/final o no, objeto a devolver, nombre, parametros y excepciones) 
 * que esta clase y sus padres puedan tener. Además del nombre de su clase y el paquete, sus padres y las interfaces
 * 
 * TODO: depurar con clases con metodos y atributos privados(incluso si son de sus padres), +
 * clases que sean arrays, que tengan constructores y más cosas "extrañas". 
 * Mirar los métodos de la clase Class<T> para saber qué checkear
 */
public class Ex20DiscoveringInfoAboutAClass {

    public static void imprimirAtributos(Class<?> claseAAnalizar){
        Field[] atributos = claseAAnalizar.getFields();

        StringBuilder descripcionDelCampoAImprimir;
        for (Field field : atributos) {
            descripcionDelCampoAImprimir = new StringBuilder();

            //TODO: hacer algo para sacar su visibilidad, si es estatica o no y si es final o no

            //Tipo
            descripcionDelCampoAImprimir.append(field.getType().getSimpleName() + " ");
            
            //Nombre
            descripcionDelCampoAImprimir.append(field.getName() + " ");
            
            //Valor ??

            //Fin del atributo
            descripcionDelCampoAImprimir.append(";");

            System.out.println(descripcionDelCampoAImprimir);
        }
    }

    public static void imprimirMetodos(Class<?> claseAAnalizar){
        Method[] metodos = claseAAnalizar.getDeclaredMethods();

        StringBuilder descripcionDelMetodoAImprimir;
        for (Method method : metodos) {
            descripcionDelMetodoAImprimir = new StringBuilder();
            //TODO: falta checkear si el metodo es final/abstract o no y su visibilidad

            //El metodo es static o no
            //TODO: depurar esto. isDefault devuelve los metodos abstractos o estaticos
            if ( method.isDefault()){
                descripcionDelMetodoAImprimir.append("static ");
            }

            //Tipo a devolver
            descripcionDelMetodoAImprimir.append(method.getReturnType().getSimpleName());
            descripcionDelMetodoAImprimir.append(' ');

            //Nombre del metodo
            descripcionDelMetodoAImprimir.append(method.getName());

            //Parametros
            descripcionDelMetodoAImprimir.append('(');
            Class<?>[] parametros = method.getParameterTypes();
            for (int i = 0 ; i < parametros.length; i++) {
                descripcionDelMetodoAImprimir.append(parametros[i].getSimpleName() + " " + i);
                descripcionDelMetodoAImprimir.append( (i != parametros.length - 1) ? ", " : "" );
            }
            descripcionDelMetodoAImprimir.append(')');

            //Excepciones
            Class<?>[] excepciones = method.getExceptionTypes();
            if (excepciones.length > 0){
                descripcionDelMetodoAImprimir.append(" throws ");
            }
            for (int i = 0; i < excepciones.length; i++) {
                descripcionDelMetodoAImprimir.append(excepciones[i].getName());
                descripcionDelMetodoAImprimir.append( (i != excepciones.length - 1) ? ", " : "");
            }
        
            System.out.println(descripcionDelMetodoAImprimir);
        }
    }

    public static void imprimirDatosClase(Class<?> claseAAnalizar){
        //Nombre de la clase (incluye el paquete)
        System.out.print("Clase: " + claseAAnalizar.getName());
        
        //Clase padre
        if (claseAAnalizar.getSuperclass() != null){
            System.out.print(" extends " + claseAAnalizar.getSuperclass().getName());
        }

        //Interfaces que implementa
        Class<?>[] interfaces = claseAAnalizar.getInterfaces();
        if(interfaces != null && interfaces.length > 0){
            System.out.print(" implements " + interfaces[0].getName());
            for (int i = 1; i < interfaces.length; i++) {
                System.out.print(", " + interfaces[i].getName());
            }
        }

    }

    public static ArrayList<Class<?>> sacarPadres(Class<?> claseAAnalizar){
        ArrayList<Class<?>> clasesPadres = new ArrayList<>();

        for (Class<?> padre = claseAAnalizar.getSuperclass(); padre != null; padre = padre.getSuperclass()) {
            clasesPadres.add(padre);
        }

        return clasesPadres;
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

        ArrayList<Class<?>> padres = sacarPadres(claseAAnalizar);

        System.out.print("\n____________Clases____________" + "\n\t");
        imprimirDatosClase(claseAAnalizar);
        for (Class<?> padre : padres) {
            System.out.print("\n\t");
            imprimirDatosClase(padre);
        }

        System.out.println("\n\n__________Atributos____________");
        imprimirAtributos(claseAAnalizar);
        for (Class<?> clasePadre : padres) {
            imprimirAtributos(clasePadre);
        }

        System.out.println("\n\n____________Metodos___________");
        imprimirMetodos(claseAAnalizar);
        for (Class<?> clasePadre : padres) {
            imprimirMetodos(clasePadre);
        }

    }
}
