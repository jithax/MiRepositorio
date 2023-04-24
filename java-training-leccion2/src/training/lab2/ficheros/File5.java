package training.lab2.ficheros;

import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 

//Clase para Leer Archivo
public class File5 {

    //Creamos un metodo para mostrar el contenido y le pasamos como parametro la ruta de muestro archivo 
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException { 
	    //Se lanzan las excepciones FileNotFoundException y IOException en caso de que no se encuentre el archivo o haya un error en la lectura. 
    	String cadena; 
        FileReader f = new FileReader(archivo); // la instancia permite leer el archivo, dada la ruta
        
        BufferedReader b = new BufferedReader(f); //la instancia lee el texto de una entrada de caracteres
        
        while((cadena = b.readLine())!=null) { 
        	System.out.println(cadena); 
        } 
        b.close(); 
	} 
    
    public static void main(String[] args) throws IOException {
    	muestraContenido("C:\\ficheros\\out.txt"); 
    }
}
