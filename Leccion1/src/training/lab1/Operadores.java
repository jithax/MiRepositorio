package training.lab1;

public class Operadores {

	public static void main(String[] args) {
		//El signo de igualdad se usa para asignar
		int x = 5;
		int y =10;
		
		x = y;
		
		System.out.println("Nueva asignacion a X " + x);
	
//operadores básicos
	// Suma o Adicion
	x = x + 2;
	System.out.println("Sumando un valor a la X " + x);
//
	x += 2;
	System.out.println("Sumando un valor a la X otro operador " + x);
//
	x++;
	System.out.println("Incrementando en 1 el valor de X otro operador " + x);
//
	++x;
	System.out.println("Incrementando en 1 el valor de X otra forma " + x);
//
//	// Resta
	x = x - 2;
	System.out.println("Restando un valor a la X " + x);
	x -= 2;
	System.out.println("Restando un valor a la X otro operador " + x);
//
//	// Multiplicacion
	x = x * 2;
	System.out.println("Multiplicando por 2 el valor de X " + x);
//
//	// Division
	x = x / 3;
	System.out.println("Dividiendo entre 3 el valor de X " + x);
//
//	// Otros operadores - Condicionales
//	// equal (==)
//
	int userAge = 34;
	int userAge1 = 34;
//
	if (userAge == userAge1) {
	  System.out.println("Las edades son iguales");
	}
//
//	// Not equal (!=)
	int userAge2 = 24;
	int userAge3 = 37;
//
	if (userAge2 != userAge3) {
		System.out.println("Las edades son diferentes");
	}
//
//	// El AND operator (&&)
//
	if (userAge2 > 0 && userAge3 > 0) {
		System.out.println("Las edades son mayores que cero");
	}
//
//	// El OR operator (||)
	if (userAge2 < 30 || userAge3 > 100) {
		System.out.println("Se cumple solo una condicion de las edades");
		
	}
}

}

