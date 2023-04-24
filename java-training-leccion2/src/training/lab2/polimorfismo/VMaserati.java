package training.lab2.polimorfismo;

public class VMaserati extends Vehiculo {
	
	private int cilindrado;

	public VMaserati(String matricula, String marca, String tipo, int cilindrado) {
		super(matricula, marca, tipo);
		this.cilindrado = cilindrado;
	}

	/**
	 * @return the cilindrado
	 */
	public int getCilindrado() {
		return cilindrado;
	}

	/**
	 * @param cilindrado the cilindrado to set
	 */
	public void setCilindrado(int cilindrado) {
		this.cilindrado = cilindrado;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo+"\nCilindrado: "+cilindrado;	
	}

}
