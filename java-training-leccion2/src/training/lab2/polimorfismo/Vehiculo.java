package training.lab2.polimorfismo;

public class Vehiculo {
	
	protected String matricula;
	protected String marca;
	protected String tipo;
	
	public Vehiculo(String matricula, String marca, String tipo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.tipo = tipo;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo;	
	}
	

}

