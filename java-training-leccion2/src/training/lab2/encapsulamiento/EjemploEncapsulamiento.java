package training.lab2.encapsulamiento;

public class EjemploEncapsulamiento {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.depositar(500);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());
        cuenta.retirar(2000);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
    }
}

/*En este ejemplo, la clase CuentaBancaria tiene dos variables privadas, titular y saldo, y cuatro métodos públicos, getTitular(), setTitular(), getSaldo(), depositar() y retirar().
 * El constructor inicializa estas variables y los métodos permiten acceder y modificar sus valores de manera controlada. El programa principal crea una instancia de la clase y muestra cómo se pueden utilizar los métodos para depositar y retirar dinero.
 */
