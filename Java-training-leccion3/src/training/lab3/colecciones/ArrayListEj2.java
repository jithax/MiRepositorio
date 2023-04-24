package training.lab3.colecciones;
import java.util.ArrayList;



/*Crear ArrayList para almacenar objetos de una clase llamada Persona.

La clase Persona que tiene dos atributos: nombre y edad. 
Crear una lista de personas utilizando la clase 
ArrayList y luego agregar algunas personas a esa lista.*/



public class ArrayListEj2 {

    public static void main(String[] args) {

        // Creamos una lista de personas
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        // Creamos algunas personas y las agregamos a la lista
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);
        Persona persona3 = new Persona("Pedro", 20);

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        // Imprimimos los datos de las personas en la lista
        for (Persona p : listaPersonas) {
            System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad());
        }
    }
}

class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}