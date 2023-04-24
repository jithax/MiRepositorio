package training.lab2.ficheros;
	import java.io.File;
	import java.io.IOException;

	public class CrearArchivo {
	    public static void main(String[] args) {
	        String ruta = "C://toolbox//miarchivo.txt";
	        
	        // Crear un objeto de la clase File con la ruta del archivo a crear
	        File archivo = new File(ruta);
	        
	        try {
	            // Crear el archivo si no existe
	            boolean resultado = archivo.createNewFile();
	            if (resultado) {
	                System.out.println("El archivo fue creado exitosamente");
	            } else {
	                System.out.println("El archivo ya existe");
	            }
	        } catch (IOException e) {
	            System.out.println("Error al crear el archivo");
	            e.printStackTrace();
	        }
	    }
	}


