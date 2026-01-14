/* Una escola d’idiomes concedeix beques a futurs estudiants si compleixen una sèrie de requisits.

A l'alumne/a se li assigna una beca si és major d’edat i si té un títol universitari.
O també se li assigna una beca si l’alumne/a està a l’atur.
El programa demana les tres dades per pantalla i en finalitzar mostra si l’alumne/a té la beca o no.

 */

import java.util.Scanner;



class M4Exercisi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la teva edat:");
        int edat = scanner.nextInt();
        scanner.nextLine(); // si no poso aixo em surten les preguntes seguides y nomes responc la ultima

        System.out.println("Tens un títol universitari? (s/n):");
        String titol = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Estàs a l’atur? (s/n):");
        String atur = scanner.nextLine();

        boolean majorITitol = (edat >= 18 && titol.equals("s"));
        boolean estaAtur = atur.equals("s");

        if (majorITitol || estaAtur) {
            System.out.println("Felicitats! Tens la beca.");
        } else {
            System.out.println("Ho sentim, no tens la beca.");
        }
    }
}
// poso s o n perqe si o sí podien confondres i s'enten bastant b en s o n, crec