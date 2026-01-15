/*
Un/a professor/a vol calcular les mitges de les notes de tota la classe. Crea una aplicació on l'usuari/ària introduirà un número per pantalla (el número correspon al nombre de notes que vol introduir) i el programa li demanarà que introdueixi les notes de tots els/les alumnes.

Un cop les notes han sigut introduïdes, el programa retorna el següent:

Si la nota mitjana és menor que 5: "La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més".

Si la nota és inferior a 7: "La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal".

Per la resta de casos, el missatge ha de ser: "Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat".

 */

import java.util.Scanner;

public class M7Exercisi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nombre d'alumnes: ");
        int numAlumn = sc.nextInt();

        double sumaNotes = 0;

        for (int i = 1; i <= numAlumn; i++) {
            System.out.print("Introdueix la nota de l'alumne/a " + i + ": ");
            double nota = sc.nextDouble();
            sumaNotes += nota;
        }

        double mitjana = sumaNotes / numAlumn;

        System.out.printf("La nota mitjana de la classe és: %.2f%n", mitjana);

        if (mitjana < 5) {
            System.out.println("La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més.");
        } else if (mitjana < 7) {
            System.out.println("La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal.");
        } else {
            System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat.");
        }

    }
}
