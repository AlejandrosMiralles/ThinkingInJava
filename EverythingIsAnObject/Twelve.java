//Ejercicio 12. Sobre javadoc. La respuesta es escribir "javadoc.exe"

package EverythingIsAnObject;
    //: object/HelloDate.java 
import java.util.*; 
/** The first Thinking in Java example program. 
 * Displays a string and today’s date. 
 * @author Bruce Eckel 
 * @author www.MindView.net 
 * @version 4.0 
*/ 
public class Twelve { 
 /** Entry point to class & application. 
 * @param args array of string arguments 
 * @throws exceptions No exceptions thrown 
 */ 
 public static void main(String[] args) { 
 System.out.print("Hello, it’s: "); 
 System.out.println(new Date()); 
 } 
} /* Output: (55% match) 
Hello, it’s: 
Wed Oct 05 14:39:36 MDT 2005 
*///:~ 