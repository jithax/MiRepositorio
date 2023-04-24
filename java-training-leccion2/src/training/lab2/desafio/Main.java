package training.lab2.desafio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String WALLET_FILE_NAME = "wallet.txt";

    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        loadWallet(wallet);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear una nueva wallet.");
            System.out.println("2. Agregar una criptomoneda a la wallet.");
            System.out.println("3. Retirar una criptomoneda de la wallet.");
            System.out.println("4. Obtener el saldo actual de una criptomoneda.");
            System.out.println("5. Enviar una cantidad especificada de criptomoneda a una dirección específica.");
            System.out.println("6. Salir.");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    createWallet();
                    break;
                case 2:
                    addCurrency(wallet, scanner);
                    break;
                case 3:
                    removeCurrency(wallet, scanner);
                    break;
                case 4:
                    getBalance(wallet, scanner);
                    break;
                case 5:
                    sendCurrency(wallet, scanner);
                    break;
                case 6:
                    saveWallet(wallet);
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static void saveWallet(Wallet wallet) {
		// TODO Auto-generated method stub
		
	}

	private static void loadWallet(Wallet wallet) {
		// TODO Auto-generated method stub
		
	}

	private static void createWallet() {
        System.out.println("Ingrese el nombre de la criptomoneda:");
        String currency = scanner.nextLine();
        double amount = 0.0; // Nuevo usuario no tiene saldo inicial
        wallet.addCurrency(currency, amount);
    }

    private static void addCurrency(Wallet wallet, Scanner scanner) {
        System.out.println("Ingrese el nombre de la criptomoneda:");
        String currency = scanner.nextLine();
        System.out.println("Ingrese la cantidad a agregar:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline character
        wallet.addCurrency(currency, amount);
    }

    private static void removeCurrency(Wallet wallet, Scanner scanner) {
        System.out.println("Ingrese el nombre de la criptomoneda:");
        String currency = scanner.nextLine();
        System.out.println("Ingrese la cantidad a retirar:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline character
        wallet.removeCurrency(currency, amount);
    }

    private static void getBalance(Wallet wallet, Scanner scanner) {
        System.out.println("Ingrese el nombre de la criptomoneda:");
        String currency = scanner.nextLine();
        System.out.println("El saldo actual de " + currency + " es " + wallet.getBalance(currency));
    }

    private static void sendCurrency(Wallet wallet, Scanner scanner) {
        System.out.println("Ingrese el nombre de la criptomoneda:");
        String currency = scanner.nextLine();
        System.out.println("Ingrese la cantidad a enviar:");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline character
        System.out.println("Ingrese la dirección de destino:");
    }
}

