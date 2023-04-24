package training.lab2.objeto;

//Declaración de una Clase
//Nombre de clase
public class Coche {
	
	String color;
	String velocidadMaxima;
	String fabricante;      //Atributos o propiedades
	String modelo;
	String precio;
	String carburante;
	//Declaración de Constructores
	// Constructor sin parametros
	
	public Coche() {
		super();
	}


	// Constructor con parametros
	public Coche(String color, String velocidadMaxima, String fabricante, String modelo, String precio,
			String carburante) {
		super();
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.precio = precio;
		this.carburante = carburante;
	}

	//Declaración de Métodos
	//Métodos
	static void parar() {
	    System.out.println("Los métodos estáticos se pueden llamar sin crear objetos.");
	}
	
	
	public void arrancar() {
	 System.out.println("Los métodos públicos deben llamarse mediante la creación de objetos.");
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the velocidadMaxima
	 */
	public String getVelocidadMaxima() {
		return velocidadMaxima;
	}


	/**
	 * @param velocidadMaxima the velocidadMaxima to set
	 */
	public void setVelocidadMaxima(String velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}


	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}


	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}


	/**
	 * @return the carburante
	 */
	public String getCarburante() {
		return carburante;
	}


	/**
	 * @param carburante the carburante to set
	 */
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	
}