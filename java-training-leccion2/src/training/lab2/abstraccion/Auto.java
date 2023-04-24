package training.lab2.abstraccion;
//Clase Padre
//Definicion Clase abstracta, solo se pueden definir en clase Padre
public abstract class Auto implements IAutos {
	
	protected String marca, modelo, precio;
	
	public Auto(String marca, String modelo, String precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	//Metodo que puede ser heredado
	public void imprimirDatos() {
		System.out.println("La Marca es: "+marca);
		System.out.println("El Modelo es: "+modelo);
		System.out.println("El precio es: "+precio);
	}

	//Definicion metodo abstracto
	public abstract void imprimirInformacion(); //Este metodo no tiene cuerpo, lo que quiere decir que puede 
												//Implementarse en la clase hijo

}
