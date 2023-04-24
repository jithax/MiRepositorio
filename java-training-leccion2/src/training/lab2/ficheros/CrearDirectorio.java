package training.lab2.ficheros;

import java.io.File;

public class CrearDirectorio {
    public static void main(String[] args) {
        String ruta = "C://toolbox";
        
        // Crear un objeto de la clase File con la ruta del directorio a crear
        File directorio = new File(ruta);
        
        // Verificar si el directorio existe antes de crearlo
        if (!directorio.exists()) {
            // Crear el directorio
            boolean resultado = directorio.mkdir();
            if (resultado) {
                System.out.println("El directorio fue creado exitosamente");
            } else {
                System.out.println("Error al crear el directorio");
            }
        } else {
            System.out.println("El directorio ya existe");
        }
    }
}
