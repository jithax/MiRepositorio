package training.lab3.colecciones;
import java.util.HashMap;

public class Laboratorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> mapa = new HashMap<>();
		
		mapa.put("uno", 1);
		mapa.put("dos", 2);
		mapa.put("tres", 3);
		
		int valor = mapa.get("tres");
		System.out.println("El valor de tres es " + valor);
		
		//Iterar
		for (String clave : mapa.keySet()) {
			int ValorActual = mapa.get(clave);
			System.out.println(clave +" : " + ValorActual);
			
		}
		
		//si existe
		if (mapa.containsKey("cinco")) {
		System.out.println("El mapa contiene la clave 'cinco'");

	} else { System.out.println("El mapa no contiene la clave 'cinco'");
	}
		 // Eliminar un par clave-valor del mapa
        mapa.remove("tres");
        
        // Obtener la cantidad de pares clave-valor en el mapa
        int cantidadPares = mapa.size();
        System.out.println("La cantidad de pares clave-valor en el mapa es: " + cantidadPares);
    }
}



	
