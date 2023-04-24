package training.lab3.colecciones;
import java.util.ArrayList;

/*Uso de ArrayList

Crear un nuevo ArrayList llamado nombres, añade varios elementos al 
ArrayList utilizando el método add(), imprimir los elementos*/


public class ArrayListEj {
    public static void main(String[] args) {
        
        // Crear un nuevo ArrayList
        ArrayList<String> nombres = new ArrayList<>();
        
        //ArrayList<Integer> userAgeList = new ArrayList<>();
        
        // Añadir elementos al ArrayList
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luisa");
        
        // Imprimir todos los elementos del ArrayList
        System.out.println("Los nombres en el ArrayList son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        // Obtener el tamaño del ArrayList
        int tamaño = nombres.size();
        System.out.println("El tamaño del ArrayList es: " + tamaño);
        
        // Obtener el elemento en una posición específica del ArrayList
        String tercerNombre = nombres.get(2);
        System.out.println("El tercer nombre en el ArrayList es: " + tercerNombre);
        
        // Eliminar un elemento del ArrayList
        nombres.remove(1);
        System.out.println("Después de eliminar el segundo nombre, los nombres en el ArrayList son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}





