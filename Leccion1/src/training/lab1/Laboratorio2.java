package training.lab1;
import java.util.Arrays;

public class Laboratorio2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeroBuscado = 6;

        // Ordenar el arreglo
        Arrays.sort(arreglo);

        // Realizar búsqueda binaria
        int inicio = 0;
        int fin = arreglo.length - 1;
        int medio;
        while (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (arreglo[medio] == numeroBuscado) {
                System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + medio + " del arreglo.");
                break;
            } else if (arreglo[medio] < numeroBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        if (inicio > fin) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }
}
