/*
Fes un programa que determini si un nombre és múltiple d’un altre.
Per fer-ho crea un mètode que ha de rebre els dos nombres com a paràmetres
i ha de retornar si el primer nombre introduït és múltiple del segon o no.
 */

import java.util.Scanner;

public class M7Exercici3 {

    public static boolean esMultiplo(int num1, int num2) {
        // Si el residu '%' de la divisió és 0, és múltiple
        return num1 % num2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer nombre: ");
        int nombre1 = sc.nextInt();

        System.out.print("Introdueix el segon nombre: ");
        int nombre2 = sc.nextInt();

        if (esMultiplo(nombre1, nombre2)) {
            System.out.println(nombre1 + " és múltiple de " + nombre2);
        } else {
            System.out.println(nombre1 + " no és múltiple de " + nombre2);
        }

    }
}
