/* Has de modificar el programa de les beques (M4 Exercici 3)
Ara el programa ha de poder donar 5 beques.
El programa anirà demanant les dades dels/les alumnes fins que es
donin aquestes 5 beques. Un cop el programa hagi assignat les 5 beques
s’ha de mostrar per pantalla els noms dels/les 5 alumnes que tenen beca.
*/

import java.util.ArrayList;
import java.util.Scanner;

class M5Exercisi5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> alumnesBeca = new ArrayList<>();
        int bequesAssignades = 0;
        int totalBeques = 5;


        while (bequesAssignades < totalBeques) {

            System.out.println("Introdueix el nom de l'alumne/a:");
            String nom = entrada.nextLine();

            System.out.println("Introdueix el cognom de l'alumne/a:");
            String cognom = entrada.nextLine();

            System.out.println("Introdueix l'edat:");
            int edat = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Tens un títol universitari? (s/n):");
            String titol = entrada.nextLine();

            System.out.println("Estàs a l’atur? (s/n):");
            String atur = entrada.nextLine();

            boolean majorITitol = (edat >= 18 && titol.equals("s"));
            boolean estaAtur = atur.equals("s");

            if (majorITitol || estaAtur) {
                System.out.println("Felicitats! Tens la beca.");
                alumnesBeca.add(nom + " " + cognom);
                bequesAssignades++;
                System.out.println("Becas assignades fins ara: " + bequesAssignades + "/" + totalBeques);
            } else {
                System.out.println("Ho sentim, no tens la beca.");
            }

        }

        System.out.println("Alumnes amb beca:");
        for (int i = 0; i < alumnesBeca.size(); i++) {
            System.out.println((i + 1) + ". " + alumnesBeca.get(i));
        }
    }
}
