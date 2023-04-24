package training.lab2.ficheros;

import java.io.*;

//Clase para renombrar archivo
public class File4 {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:\\ficheros\\output.txt");
        File file2 = new File("C:\\ficheros\\out.txt");
        
        if (file2.exists())
       
        throw new java.io.IOException("Archivo Existe");
        
        boolean success = file1.renameTo(file2);
        
        if (success) {
            System.out.println("Archivo Renombrado con exito!");
        }else System.out.println("Archivo no renombrado");

	}

}

