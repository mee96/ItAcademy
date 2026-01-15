/*
Crea un programa on l’usuari/ària introdueix tres notes i el programa calcula la mitja.

Si la mitja és inferior a 5 ha de mostrar el següent missatge per pantalla: “No has superat el curs. Has de recuperar”.

Si la mitja està entre 5 i 7 ha de mostrar: “Enhorabona! Has aprovat, però hauries de continuar practicant”.

Si la mitja és superior a 7 ha de mostrar: "Enhorabona! Has superat el curs! Passa ja al següent nivell!"

 */

import java.util.Scanner;

public class M7Exercisi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Introdueix la segona nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Introdueix la tercera nota: ");
        double nota3 = sc.nextDouble();

        double mitja = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La mitja és: %.2f%n", mitja);

        if (mitja < 5) {
            System.out.println("No has superat el curs. Has de recuperar.");
        } else if (mitja >= 5 && mitja <= 7) {
            System.out.println("Enhorabona! Has aprovat, però hauries de continuar practicant.");
        } else { // mitja > 7
            System.out.println("Enhorabona! Has superat el curs! Passa ja al següent nivell!");
        }

    }
}
