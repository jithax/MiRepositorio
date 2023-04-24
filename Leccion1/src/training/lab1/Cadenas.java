package training.lab1;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myName = "Hello World" + "Mi nombre es Borja";
		
		System.out.println(myName);
		
		/*METODOS DE STRING*/
		
		//LONGITUD  DE UNA CADENA DE CARACTERES
		
		System.out.println("HELLO WORLD".length());
		
		//CONVERTIR A MINUSCULA
		
		System.out.println("HELLO WORLD".toLowerCase());
		
		//CONVERTIR A MAYUSCULA
		
		System.out.println("HELLO WORLD".toUpperCase());
		
		//Extraer una parte de la cadena a partir de una posicion determinada
				String firstSubstring = "Hello World".substring(6);
				System.out.println(firstSubstring);
//				
//				//Extraer una parte de la cadena a partir de una posicion determinada 
				String message = "Hello World";
				String secondSubstring = message.substring(1, 8);
				System.out.println(secondSubstring);
//				
//				//Seleccionando un caracter especifico indicando su posicion
				char myChar = "Hello World".charAt(4);
				System.out.println(myChar);
//				
//				//Escape Sequences
				System.out.println("Escape Sequences  --- " + "Hello\nWorld");
//				
//				//Validando si una cadena es igual a otra. El metodo equals devuelve true o false
//				
				boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
				boolean equalsOrNot2 = "This is Jamie".equals("Hello World");
//				
				System.out.println(equalsOrNot);
				System.out.println(equalsOrNot2);
//				
//				//Separando cadenas
				String names = "Peter, John, Andy, David";
//				//El array es asignado a la variable splitNames.
				String[] splitNames = names.split(", ");
//				
				System.out.println(splitNames[0]);
				System.out.println(splitNames[2]);
				

	}

}
