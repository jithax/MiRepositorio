package training.lab2.desafio;

import java.util.HashMap;

public class Wallet {
    private HashMap<String, Double> balances;

    public Wallet() {
        balances = new HashMap<>();
    }

    public void addCurrency(String currency, double amount) {
        if (balances.containsKey(currency)) {
            balances.put(currency, balances.get(currency) + amount);
        } else {
            balances.put(currency, amount);
        }
    }

    public void removeCurrency(String currency, double amount) {
        if (balances.containsKey(currency)) {
            double balance = balances.get(currency);
            if (balance >= amount) {
                balances.put(currency, balance - amount);
            } else {
                System.out.println("Insuficiente balance en " + currency + " wallet.");
            }
        } else {
            System.out.println(currency + " wallet no existe.");
        }
    }

    public double getBalance(String currency) {
        if (balances.containsKey(currency)) {
            return balances.get(currency);
        } else {
            System.out.println(currency + " no existe la wallet.");
            return 0;
        }
    }

    public void sendCurrency(String currency, double amount, String address) {
        if (balances.containsKey(currency)) {
            double balance = balances.get(currency);
            if (balance >= amount) {
                balances.put(currency, balance - amount);
                System.out.println(amount + " " + currency + " enviar a " + address + ".");
            } else {
                System.out.println(" balance insuficiente en  " + currency + " wallet.");
            }
        } else {
            System.out.println(currency + " wallet no  existe.");
        }
    }
}

