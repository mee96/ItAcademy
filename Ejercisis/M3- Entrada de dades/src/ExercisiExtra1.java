/* Escriu un programa Java que llegeix un nombre enter per teclat i obté
 i mostra per pantalla el doble i el triple d'aquest número. */

import java.util.Scanner;

public class ExercisiExtra1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdueix un número enter: ");
        int numero = scanner.nextInt();


        int doble = numero * 2;
        int triple = numero * 3;


        System.out.println("El doble del número és: " + doble);
        System.out.println("El triple del número és: " + triple);
    }
}
