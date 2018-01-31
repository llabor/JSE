/* Ejemplo Interfaz Collection (API Java) 
 * Las colecciones son una especie de arrays de tama�o din�mico. Para usarlas haremos uso del Java Collections Framework (JCF),
 * el cual contiene un conjunto de clases e interfaces del paquete java.util para gestionar colecciones de objetos.*/
import java.util.ArrayList;
import java.util.Collection;
 
public class Programa {
    public static void main(String arg[]) {
        Collection<String> listaMarcasCoches = new ArrayList<String>(); // El tipo de listaMarcasCoches es Collection
        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");
        System.out.println("N�mero elementos antes de eliminar: " + listaMarcasCoches.size() ) ;
        System.out.println (listaMarcasCoches.toString() ) ;
        listaMarcasCoches.remove ("Seat");
        listaMarcasCoches.remove ("Mercedes");
        System.out.println("N�mero elementos despu�s de eliminar Seat y Mercedes:" + listaMarcasCoches.size() ) ;
        System.out.println(listaMarcasCoches.toString () );
        }
}