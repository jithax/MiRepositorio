package training.lab2.herencia;

public class Perro extends Animal {
	 private String raza;
	 private int numChip;

	public Perro(String raza, int numChip) {
		super();// llama al construtor de la clase padre en este caso(Animal), ademas de sus propios atributos abajo
		this.raza = raza;
		this.numChip = numChip;
		
	}

	public String getDatosPerro() {
		return "La raza del perro  es: " + raza + " Y el número del chip  es: " + numChip;

	}

}
