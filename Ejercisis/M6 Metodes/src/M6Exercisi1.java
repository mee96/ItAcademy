/*
Modificar la calculadora arcaica (M4 Exercici 5).
El programa demana a l’usuari/ària que introdueixi dos números i
l’operació que desitja realitzar.
Cada operació (suma, resta, multiplicació, divisió i mòdul)
estarà programada en un mètode diferent.
 */

import java.util.Scanner;

class M6Exercisi1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introdueix el primer número:");
        double num1 = entrada.nextDouble();

        System.out.println("Introdueix el segon número:");
        double num2 = entrada.nextDouble();

        entrada.nextLine();

        System.out.println("Introdueix l’operador (+, -, *, /, %):");
        String operador = entrada.nextLine();

        double resultat;

        switch (operador) {
            case "+":
                resultat = suma(num1, num2);
                System.out.println("Resultat: " + resultat);
                break;

            case "-":
                resultat = resta(num1, num2);
                System.out.println("Resultat: " + resultat);
                break;

            case "*":
                resultat = multiplicacio(num1, num2);
                System.out.println("Resultat: " + resultat);
                break;

            case "/":
                resultat = divisio(num1, num2);
                if (!Double.isNaN(resultat)) {
                    System.out.println("Resultat: " + resultat);
                }
                break;

            case "%":
                resultat = modul(num1, num2);
                System.out.println("Resultat: " + resultat);
                break;

            default:
                System.out.println("Operador no vàlid!");
        }
    }

    public static double suma(double a, double b) {
        return a + b;
    }
    public static double resta(double a, double b) {
        return a - b;
    }
    public static double multiplicacio(double a, double b) {
        return a * b;
    }
    public static double divisio(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no es pot dividir per zero!");
            return Double.NaN;
        }
        return a / b;
    }
    public static double modul(double a, double b) {
        return a % b;
    }
}
