package TypeInformation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.ArrayList;

/**
 * Intentar hacer un programa que, dada una clase dese la linea de comandos, sea capaz de imprimir todos 
 * los atributos(visibilidad,statica/final o no, tipo, nombre y valor(si tiene) ) y
 * métodos(visibilidad,statica/final o no, objeto a devolver, nombre, parametros y excepciones) que esta
 * clase y sus padres puedan tener. Además del nombre de su clase y el paquete, sus padres y las 
 * interfaces
 */
public class Ex20DiscoveringInfoAboutAClass {

    public static void imprimirAtributos(Class<?> claseAAnalizar){
        Field[] atributos = claseAAnalizar.getDeclaredFields();

        StringBuilder descripcionDelCampoAImprimir;
        for (Field field : atributos) {
            descripcionDelCampoAImprimir = new StringBuilder();
            
            int fieldModifier = field.getModifiers();

            //Visibility
            String visibility;
            if (Modifier.isPublic(fieldModifier)){
                visibility = "public ";
            }else if (Modifier.isProtected(fieldModifier)){
                visibility = "protected ";
            }else if (Modifier.isPrivate(fieldModifier)){
                visibility = "private ";
            }else{ //Si no es ninguna de las anteriores, la visibilidad será de paquetes
                visibility = "";
            }
            descripcionDelCampoAImprimir.append(visibility);

           //Static or instance field
            descripcionDelCampoAImprimir.append((Modifier.isStatic(fieldModifier))? "static " : "" );

            //Final
            descripcionDelCampoAImprimir.append((Modifier.isFinal(fieldModifier))? "final " : "" );

            //Tipo
            descripcionDelCampoAImprimir.append(field.getType().getSimpleName());
            descripcionDelCampoAImprimir.append(' ');
            
            //Nombre
            descripcionDelCampoAImprimir.append(field.getName() );
            
            //Valor por defecto del campo (si es estatico)
            try {
                Object valorEstatico;
                valorEstatico = field.get(null);
                descripcionDelCampoAImprimir.append(" = " + valorEstatico.getClass().getSimpleName());
            } catch (NullPointerException e) {
                //Nothing. It means that it's an instance field and it doesn't have any default value
            } catch (IllegalAccessException e){
                // En teoría nunca debería llegar aquí porque ya se ha accedido al campo
            }

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

            int methodModifier = method.getModifiers();

            //Visibilidad
            String access;
            if (Modifier.isPublic(methodModifier)){
                access = "public ";
            }else if (Modifier.isPrivate(methodModifier)){
                access = "private ";
            }else if (Modifier.isProtected(methodModifier)){
                access = "protected ";
            }else{ //La visibilidad solo puede ser de paquetes
                access = "";
            }
            descripcionDelMetodoAImprimir.append(access);

            //final o abstract
            if (Modifier.isFinal(methodModifier)){ descripcionDelMetodoAImprimir.append("final ");}
            else if (Modifier.isAbstract(methodModifier)){ descripcionDelMetodoAImprimir.append("abstract ");}

            //estatico o de instancia
            descripcionDelMetodoAImprimir.append((Modifier.isStatic(methodModifier))? "static " : "");

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

    private static void imprimirInformacionClase(Class<?> claseAAnalizar){
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
    
    public static void main(String[] args) {
        String nombreClaseAAnalizar = (args.length > 0)? args[0] : null;

        Class<?> claseAAnalizar;

        try {
            claseAAnalizar = Class.forName(nombreClaseAAnalizar);

            imprimirInformacionClase(claseAAnalizar);
        } catch (Exception e) {
            System.out.println(e + "\n\n\n");

            System.exit(-1);
        }
    }
}
