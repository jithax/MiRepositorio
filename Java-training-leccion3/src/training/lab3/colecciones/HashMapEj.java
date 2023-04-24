package training.lab3.colecciones;
import java.util.HashMap;


/*Ejemplo clase HashMap para almacenar objetos de una clase.

clase Producto que tiene dos atributos: nombre y precio.
Crear un mapa de productos utilizando la 
clase HashMap y luego agregar algunos productos a ese mapa.*/

public class HashMapEj {

    public static void main(String[] args) {

        // Creamos un mapa de productos
        HashMap<Integer, Producto> mapaProductos = new HashMap<Integer, Producto>();

        // Creamos algunos productos y los agregamos al mapa
        Producto producto1 = new Producto("Leche", 2.50);
        Producto producto2 = new Producto("Pan", 1.00);
        Producto producto3 = new Producto("Café", 3.50);

        mapaProductos.put(1, producto1);
        mapaProductos.put(2, producto2);
        mapaProductos.put(3, producto3);

        // Obtenemos y mostramos el producto con clave 2
        Producto productoObtenido = mapaProductos.get(2);
        System.out.println("Producto con clave 2: " + productoObtenido.getNombre() + " ($" + productoObtenido.getPrecio() + ")");
    }
}

class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}



