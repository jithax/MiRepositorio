package training.lab2.polimorfismo;

public class VPeugeot extends Vehiculo {
	
	private int nPuertas;

	public VPeugeot(String matricula, String marca, String tipo, int nPuertas) {
		super(matricula, marca, tipo);
		this.nPuertas = nPuertas;
	}

	/**
	 * @return the nPuertas
	 */
	public int getnPuertas() {
		return nPuertas;
	}

	/**
	 * @param nPuertas the nPuertas to set
	 */
	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nTipo: "+tipo+"\nNúmero de Puertas: "+nPuertas;	
	} 
	

}
