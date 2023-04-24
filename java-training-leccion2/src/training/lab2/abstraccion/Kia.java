package training.lab2.abstraccion;

public class Kia extends Auto{
	
	private String color; //Atributo propio
    //Constructor con parametros se llama al constructor de la clase Padre Auto mas su atributo propio
	public Kia(String marca, String modelo, String precio, String color) {
		super(marca, modelo, precio);
		this.color = color;
	}
	
	//Se hereda de la clase Padre, alli no tiene cuerpo pero se implementa en la clase hijo
    //Metodo abstracto se sobre escribe
	
	@Override
	public void imprimirInformacion() {
		
		System.out.println("Auto KIA y el color  es : "+color);
		
	}
	//Metodo implementado a traves de la interfaces "IAutos"
	@Override
	public void imprimirNpuertas() {
		
		System.out.println("Auto KIA y el número de puertas es : "+nPuertas);
		
	}
	

}
