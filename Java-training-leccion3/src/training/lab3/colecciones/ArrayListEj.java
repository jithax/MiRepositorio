package training.lab3.colecciones;
import java.util.ArrayList;

/*Uso de ArrayList

Crear un nuevo ArrayList llamado nombres, a�ade varios elementos al 
ArrayList utilizando el m�todo add(), imprimir los elementos*/


public class ArrayListEj {
    public static void main(String[] args) {
        
        // Crear un nuevo ArrayList
        ArrayList<String> nombres = new ArrayList<>();
        
        //ArrayList<Integer> userAgeList = new ArrayList<>();
        
        // A�adir elementos al ArrayList
        nombres.add("Juan");
        nombres.add("Mar�a");
        nombres.add("Pedro");
        nombres.add("Luisa");
        
        // Imprimir todos los elementos del ArrayList
        System.out.println("Los nombres en el ArrayList son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        // Obtener el tama�o del ArrayList
        int tama�o = nombres.size();
        System.out.println("El tama�o del ArrayList es: " + tama�o);
        
        // Obtener el elemento en una posici�n espec�fica del ArrayList
        String tercerNombre = nombres.get(2);
        System.out.println("El tercer nombre en el ArrayList es: " + tercerNombre);
        
        // Eliminar un elemento del ArrayList
        nombres.remove(1);
        System.out.println("Despu�s de eliminar el segundo nombre, los nombres en el ArrayList son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}





