package training.lab1;

public class Flujos {

	public static void main(String[] args) {
		
		// Looping Statements
		
		//Sentencia for
		System.out.println("Sentencia For");
		for (int i =0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("Sentencia For trabajando con un Array");
           int[] myNumbers = {10, 20, 30, 40, 50};
           
           for (int i = 0; i < myNumbers.length; i++ ) {
        	   System.out.println(myNumbers[i]);
           }
           
           //System.out.println("sentencia for trabajando con break
           
           for (int i= 0; i < 5; i ++) {
        	   System.out.println(" i = " + i);
        	   if (i == 2)
        		   break;
           }
           
           //Sentencia While
           int counter = 5;
           while (counter > 0) {
        	   counter = counter - 1;
           }
           
           //sentencia do while
           //se ejecuta al menos una vez
           int counter2 = 10;
           do {
        	   System.out.println("Counter2 = " + counter2);
        	   counter2 ++;
        	   
           } while (counter2 < 0);
           
           //Desafío 2 For + if - Búsqueda en el arreglo
           
         
	}

}
