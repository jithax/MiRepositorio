package training.lab3.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        
        // Crear una lista de cadenas
        List<String> lista = new ArrayList<>();
        
        // Agregar elementos a la lista
        lista.add("Leccion 1 - Conceptos Generales");
        lista.add("Leccion 2 - Programacion Orientada a Objetos");
        lista.add("Leccion 3 - JEE");
        
        // Obtener el tamaño de la lista
        System.out.println("Tamaño de la lista: " + lista.size());
        
        // Acceder a elementos individuales de la lista
        System.out.println("Primer elemento de la lista: " + lista.get(0));
        System.out.println("Segundo elemento de la lista: " + lista.get(1));
        
        // Iterar sobre la lista y mostrar todos los elementos
        System.out.println("Elementos de la lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        
        // Eliminar un elemento de la lista
        lista.remove(2);
        
        // Iterar sobre la lista actualizada y mostrar todos los elementos
        System.out.println("Elementos de la lista después de eliminar el tercer elemento:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}