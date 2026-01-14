/* Fer un programa que li demani a l’usuari/ària: El nom, el cognom i l’edat.

Un cop l’usuari/ària hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla. */


import java.util.Scanner;

public class Exercisi1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdueix el teu nom: ");
        String nom = scanner.nextLine();

        System.out.print("Introdueix el teu cognom: ");
        String cognom = scanner.nextLine();

        System.out.print("Introdueix la teva edat: ");
        int edat = scanner.nextInt();


        System.out.println("--- DADES DE L'USUARI ---");
        System.out.println("Nom: " + nom);
        System.out.println("Cognom: " + cognom);
        System.out.println("Edat: " + edat);
    }
}