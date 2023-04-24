package training.lab2.ficheros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Clase para eliminar archivos
public class FIle3 {

	public static void main(String[] args) {
		
		        
        String file_name = "C:\\ficheros\\out.txt";
        
        Path path = Paths.get(file_name);
        
        try {
            boolean result = Files.deleteIfExists(path);
            
            if (result) {
                System.out.println("Archivo Eliminado!");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	
	}
}


