package training.lab1;

import java.util.Scanner;

public class Laboratorio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos:");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros:");
        double altura = sc.nextDouble();
        
        // Calcular IMC
        double imc = peso / (altura * altura);
        
        // Mostrar resultado
        System.out.println("Su índice de masa corporal es: " + imc);
        
        // Clasificar el resultado según los rangos estándar
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}