package training.lab2.encapsulamiento;

public class EjemploEncapsulamiento {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan P�rez", 1000);
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.depositar(500);
        System.out.println("Saldo despu�s del dep�sito: " + cuenta.getSaldo());
        cuenta.retirar(2000);
        System.out.println("Saldo despu�s del retiro: " + cuenta.getSaldo());
    }
}

/*En este ejemplo, la clase CuentaBancaria tiene dos variables privadas, titular y saldo, y cuatro m�todos p�blicos, getTitular(), setTitular(), getSaldo(), depositar() y retirar().
 * El constructor inicializa estas variables y los m�todos permiten acceder y modificar sus valores de manera controlada. El programa principal crea una instancia de la clase y muestra c�mo se pueden utilizar los m�todos para depositar y retirar dinero.
 */
