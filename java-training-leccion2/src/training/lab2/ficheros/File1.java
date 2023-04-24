package training.lab2.ficheros;
import java.io.*;


//Clase para crear archivo y directorio
public class File1 {
	
	public static void main(String[] args) throws IOException {
		
		File ruta = new File("c:/ficheros"); //Se establece la ruta del directorio donde se colocara el archivo generado
		File f = new File(ruta, "datos.txt"); //Se establece el nombre del archivo
		
		System.out.println(f.getAbsolutePath()); // Imprime por consola la ruta absoluta ubicación del archivo
		System.out.println(f.getParent()); // Devuelve un String conteniendo el archivo en el directorio padre. Devuelve null si no tiene directorio padre.
		
		System.out.println(ruta.getAbsolutePath()); // Imprime por consola la ruta absoluta ubicación del directorio
		System.out.println(ruta.getParent()); //Devuelve un String conteniendo el directorio padre del File. Devuelve null si no tiene directorio padre.
		
		if (!f.exists()) {  //se comprueba si el fichero existe o no
			
			System.out.println("Fichero " + f.getName() + " no existe"); //Si no existe se imprime el siguiente mensaje
			
			if (!ruta.exists()) {  //se comprueba si la ruta existe o no
				
				System.out.println("El directorio " + ruta.getName() + " no existe");
				
				if (ruta.mkdir()) { //se crea la ruta. Si se ha creado correctamente
					
					System.out.println("Directorio creado");
					
					if (f.createNewFile()) {  //se crea el fichero. Si se ha creado correctamente
						System.out.println("Fichero " + f.getName() + " creado");
					} else {
						System.out.println("No se ha podido crear  " + f.getName());
					}
					
				} else {
					System.out.println("No se ha podido crear  " + ruta.getName());
				}
				
			} else {  //si la ruta existe creamos el fichero
				if (f.createNewFile()) {
					System.out.println("Fichero " + f.getName() + " creado");
				} else {
					System.out.println("No se ha podido crear " + f.getName());
				}
			}
		} else { //el fichero existe. Mostramos el tamaño
			System.out.println("Fichero " + f.getName() + " existe");
			
			System.out.println("Tama�oo " + f.length() + " bytes");
			
		}
	}



}

