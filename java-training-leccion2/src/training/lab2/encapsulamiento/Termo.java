package training.lab2.encapsulamiento;

public class Termo {

	public static void main(String[] args) {
		Termometro termo = new Termometro();
		termo.setCelsius(92.0); 
		// Establecemos o modificamos el valor de celsius ya que se le pasa como parametro en el metodo set

		double far = termo.getFahrenheit(); //Este valor no puede ser modificado sino en la propia clase que lo define
		double cel = termo.getCelsius();
		double kel = termo.getKelvin(); //Este valor no puede ser modificado sino en la propia clase que lo define

		System.out.print("Fahrenheight: " + far);
		System.out.print("\nCelsius: " + cel);
		System.out.print("\nKelvin: " + kel);

	}

}
