/* Fer un programa que li demani dos números sencers a l’usuari/ària. Al final, el programa imprimeix per pantalla el següent missatge:

El resultat de la suma és: “valor”

El resultat de la resta és: “valor”

El resultat de la multiplicació és: “valor”


El resultat de la divisió és: “valor”. */


import java.util.Scanner;

public class Exercisi2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demano los numeros sancers- faig la pregunta en sout reculleixo info en scanner
        System.out.print("Introdueix el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introdueix el segon número: ");
        int num2 = scanner.nextInt();

        //Faig les operacions
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacio = num1 * num2;
        double divisio = (double) num1 / num2;

        // Sortida de resultats
        System.out.println("El resultat de la suma és: " + suma);
        System.out.println("El resultat de la resta és: " + resta);
        System.out.println("El resultat de la multiplicació és: " + multiplicacio);
        System.out.println("El resultat de la divisió és: " + divisio);
    }
}
