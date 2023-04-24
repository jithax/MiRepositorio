package training.lab2.ficheros;
import java.io.*;

public class ManejoDeArchivos {

    public static void main(String[] args) {
        
        // Nombre del directorio y del archivo a crear o manipular
        String directorio = "C:\\toolbox\\directorio_ejemplo";
        String archivo = "C:\\toolbox\\archivo_ejemplo.txt";
        
        // Crear un objeto File para el directorio
        File directorioFile = new File(directorio);
        
        // Si el directorio no existe, crearlo
        if (!directorioFile.exists()) {
            boolean creado = directorioFile.mkdir();
            if (creado) {
                System.out.println("Se ha creado el directorio " + directorio);
            } else {
                System.out.println("No se ha podido crear el directorio " + directorio);
            }
        }
        
        // Crear un objeto File para el archivo dentro del directorio
        File archivoFile = new File(archivo);
        
        // Si el archivo no existe, crearlo y escribir en él
        if (!archivoFile.exists()) {
            try {
                boolean creado = archivoFile.createNewFile();
                if (creado) {
                    System.out.println("Se ha creado el archivo " + archivo);
                    FileWriter escritor = new FileWriter(archivoFile);
                    escritor.write("Este es un ejemplo de texto que se escribirá en el archivo.");
                    escritor.close();
                } else {
                    System.out.println("No se ha podido crear el archivo " + archivo);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Si el archivo ya existe, mostrar su contenido
            System.out.println("El archivo " + archivo + " ya existe. Su contenido es el siguiente:");
            try {
                FileReader lector = new FileReader(archivoFile);
                BufferedReader buffer = new BufferedReader(lector);
                String linea;
                while ((linea = buffer.readLine()) != null) {
                    System.out.println(linea);
                }
                buffer.close();
                lector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // Renombrar el archivo
        String nuevoNombre = "C:\\toolbox\\archivo_ejemplo_renombrado.txt";
        File nuevoArchivoFile = new File(nuevoNombre);
        boolean renombrado = archivoFile.renameTo(nuevoArchivoFile);
        if (renombrado) {
            System.out.println("El archivo " + archivo + " ha sido renombrado a " + nuevoNombre + ".");
        } else {
            System.out.println("No se ha podido renombrar el archivo " + archivo + ".");
        }
    }
}
