package training.lab2.abstraccion;


//Clase Hijo
public class Toyota extends Auto {
	
	private String velocidadMaxima; //Atributo propio
  //Constructor con parametros se llama al constructor de la clase Padre Auto mas su atributo propio
	public Toyota(String marca, String modelo, String precio, String velocidadMaxima) {
		super(marca, modelo, precio);
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//Se hereda de la clase Padre, alli no tiene cuerpo pero se implementa en la clase hijo
	//Metodo abstracto se sobre escribe
	
	@Override
	public void imprimirInformacion() {
		
		System.out.println("Auto Toyota y la velocidad maxima es : "+velocidadMaxima);
		
	}
	//Metodo implementado a traves de la interfaces "IAutos"
	@Override
	public void imprimirNpuertas() {
		
		System.out.println("Auto Toyota y el número de puertas es : "+nPuertas);
		
	}
}
	
