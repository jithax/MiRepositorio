package training.lab2.abstraccion;

public class PAutos {
    //Clase de prueba
	public static void main(String[] args) {
		//Declaramos un objeto de las clase Toyota, Kia y utilizamos sus métodos (Heredados y Abstracto)
		Toyota t = new Toyota("Toyota Supra", "MK4", "130.000 €", "280 Km/h");
		t.imprimirDatos();
		t.imprimirInformacion();
		t.imprimirNpuertas();
		
		Kia k = new Kia("Kia Picanto", "1.2 DPI GT LINE", "17.610 €", "gris");
		k.imprimirDatos();
		k.imprimirInformacion();
		k.imprimirNpuertas();

	}

}
