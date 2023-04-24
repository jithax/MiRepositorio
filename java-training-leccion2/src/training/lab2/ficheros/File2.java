package training.lab2.ficheros;
import java.io.*;
//Clase para Escribir en un archivo
public class File2 {
	 
	 
	 public static void main(String[] args) {  
	        try {  
	            Writer w = new FileWriter("C:\\ficheros\\output.txt");  
	            String content = "Like Java, Spring, Hibernate, Android, PHP etc.";  
	            w.write(content);  
	            w.close();  
	            System.out.println("Está¡ hecho!");  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }  
}


