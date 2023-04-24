package training.lab1;
import java.util.Arrays;

public class ListasArreglos {

	public static void main(String[] args) {
		
		//Métodos de Arrays
		int[] arr1 = {0,2,4,6,8,10};
		int[] arr2 = {0,2,4,6,8,10};
		int[] arr3 = {10,8,6,4,2,0};
		
		//Método equals
		boolean result1 = Arrays.equals(arr1, arr2);
		boolean result2 = Arrays.equals(arr1, arr3);
		
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		
		
//		//copyOfRange() Metodo que permite copiar un Array a otro
//		
//		//Array Origen o Fuente
		int [] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};
//		
//		//Array Destino
		int[] dest = Arrays.copyOfRange(source, 3, 7);
		
				
		System.out.println("Destino " + dest[0]);
		System.out.println("Destino " + dest[1]);		
		System.out.println("Destino " + dest[2]);
		System.out.println("Destino " + dest[3]);
//		
//		//Método toString()
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(numbers));
//		
//		//Método sort() Ordenar un Array
		int [] numbers2 = {12, 1, 5, -2, 16, 14};
		Arrays.sort(numbers2);
		System.out.println("Resultado ordenado  " + numbers2[0]);
		System.out.println("Resultado ordenado  " + numbers2[5]);
//		
//		//Como obtener la longitud de un Array
		int [] userAge = {21, 22, 26, 32, 40};
		int longitud = userAge.length;
		System.out.println("Longitud del Array  " + longitud);
		
		
	}
	
	
	
	
	
}
