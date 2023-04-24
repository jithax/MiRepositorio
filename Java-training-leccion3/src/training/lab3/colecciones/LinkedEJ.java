package training.lab3.colecciones;

import java.util.LinkedList;

public class LinkedEJ {

public static void main(String[] args) {
		
		LinkedList<Estudiante> estudiantes = new LinkedList<Estudiante>();
		
		estudiantes.add(new Estudiante("Ana", 20));
		estudiantes.add(new Estudiante("Juan", 21));
		estudiantes.add(new Estudiante("María", 19));
		estudiantes.add(new Estudiante("Pedro", 22));
		
		//imprimir los objetos estudiantes
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre() + " tiene " + estudiante.getEdad() + " años");
		}

}
}
