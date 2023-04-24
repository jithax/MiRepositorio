package training.lab2.herencia;

//Clase de Prueba
public class Empleados {

	public static void main(String[] args) {
		
		//Trabajando con atributos de la clase padre 
		Empleado empleado1 = new Empleado(1001,856784122);
		empleado1.setNombre("Juan");
		empleado1.setApellido("Arvelo");
		empleado1.setEmail("juan@gmail.com");
		empleado1.setEdad(21);
		empleado1.setTelefono("123-4567890");
		
		String name1 = empleado1.getNombre();
		String apellido1 = empleado1.getApellido();
		String email1 = empleado1.getEmail();
		int edad1 = empleado1.getEdad();
		String telefono1 = empleado1.getTelefono();
		
		
		System.out.println("Datos del Empleado 1: ");
		System.out.println("Nombre: " + name1);
		System.out.println("Apellido: " + apellido1);
		System.out.println("Email: " + email1);
		System.out.println("Edad: " + edad1);
		System.out.println("Telefono: " + telefono1);
		
		System.out.println(empleado1.getDatosEmpleado());
		
		Empleado empleado2 = new Empleado(1002,866794323);
		empleado2.setNombre("Mateo");
		empleado2.setApellido("Alegria");
		empleado2.setEmail("mateo@gmail.com");
		empleado2.setEdad(25);
		empleado2.setTelefono("122-4467890");
		
		String name2 = empleado2.getNombre();
		String apellido2 = empleado2.getApellido();
		String email2 = empleado2.getEmail();
		int edad2 = empleado2.getEdad();
		String telefono2 = empleado2.getTelefono();
		
		System.out.println("\nDatos del Empleado 2: ");
		System.out.println("Nombre: " + name2);
		System.out.println("Apellido: " + apellido2);
		System.out.println("Email: " + email2);
		System.out.println("Edad: " + edad2);
		System.out.println("Telefono: " + telefono2);
		System.out.println(empleado2.getDatosEmpleado());
		
	}

}
