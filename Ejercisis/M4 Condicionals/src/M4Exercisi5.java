/* Fer un programa que demani dos números i un operador(+,-,*,/).
Al final, el programa ha
d'imprimir per pantalla el resultat de fer l’operació que contingui
la variable operador.
 */

import java.util.Scanner;

class M4Exercisi5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Introdueix el segon número:");
        double num2 = scanner.nextDouble();

        scanner.nextLine(); // varies preguntes

        System.out.println("Introdueix l’operador (+, -, *, /):");
        String operador = scanner.nextLine();

        double resultat;

        switch (operador) {
            case "+":
                resultat = num1 + num2;
                System.out.println("Resultat: " + resultat);
                break;
            case "-":
                resultat = num1 - num2;
                System.out.println("Resultat: " + resultat);
                break;
            case "*":
                resultat = num1 * num2;
                System.out.println("Resultat: " + resultat);
                break;
            case "/":
                if (num2 != 0) {
                    resultat = num1 / num2;
                    System.out.println("Resultat: " + resultat);
                } else {
                    System.out.println("Error: no es pot dividir per zero!");
                }
                break;
            default:
                System.out.println("Operador no vàlid!");
        }
    }
}
