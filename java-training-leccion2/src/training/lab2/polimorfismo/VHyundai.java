package training.lab2.polimorfismo;

public class VHyundai extends Vehiculo {
	
	private int carga;

	public VHyundai(String matricula, String marca, String tipo, int carga) {
		super(matricula, marca, tipo);
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo+"\nCarga: "+carga;	
	}

	
	

}

