package training.lab2.objeto;

public class Modelo {

	public static void main(String[] args) {
		// Objeto "Rio" instancias de una clase en este caso la clase Coche
		// Un coche puede tener varios Modelos el fabricante en este caso es "Kia" y el modelo es "Rio"
		// Que representa el objeto.
		// De esta manera puedo crear distintos objetos
		
		// Objeto creado a partir del constructor sin parametros
			    Coche rio = new Coche();
			    rio.color = "rojo";
			    rio.velocidadMaxima = "280 Km/h";
			    rio.fabricante = "Kia";   // Al objeto "rio" se le estan asignando valores de acuerdo a los 
			    rio.modelo = "Rio";       // Atributos comunes definidos en la clase Coche.
			    rio.precio = "120.000 €";
			    rio.carburante = "gasolina";
			    rio.arrancar();
			    
			    System.out.println("El color del coche modelo rio es " + rio.color);
		
		// Objeto creado a partir del constructor con parametros	    
			    Coche supra = new Coche(null,null,null,null,null,null); 
			    
			    supra.color = "gris";
			    supra.velocidadMaxima = "280 Km/h";
			    supra.fabricante = "Toyota";   // Al objeto "supra" se le estan asignando valores de acuerdo a los 
			    supra.modelo = "Supra";       // Atributos comunes definidos en la clase Coche.
			    supra.precio = "120.000 €";
			    supra.carburante = "gasolina";
			    supra.arrancar();
			    
			    System.out.println("El color del coche modelo supra es " + supra.color);

	}

}