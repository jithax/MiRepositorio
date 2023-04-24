package training.lab2.herencia;

//Clase Hijo
public class Empleado extends Persona {
	
	private int numEmpleado;
	private int numContrato;
	
	
	//Constructor clase empleados
	public Empleado(int numEmpleado,int numContrato) {
		super();// llama al construtor de la clase padre en este caso(Persona), ademas de sus propios atributos abajo
		this.numEmpleado = numEmpleado;
		this.numContrato = numContrato;
		
	}
	
	// Método propio
	
	public String getDatosEmpleado() {
		return "El número de empleado es: " + numEmpleado + " Y el número de contrato es: " + numContrato;
	}
	

}
