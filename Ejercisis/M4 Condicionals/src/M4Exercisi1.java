/* Modifica l’exercici 1 del mòdul 3. Un cop introduïdes les dades, el programa ha de mostrar el següent per pantalla:
- Si l’usuari/ària té 18 anys o més: “Nom Cognom, ets MAJOR d’edat”
- Si l’usuari/ària és menor de 18 anys: “Nom Cognom, ets MENOR d’edat”.
 */

import java.util.Scanner;

public class M4Exercisi1 {
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

        // Condicional per edat
        if (edat >= 18) {
            System.out.println(nom + " " + cognom + ", ets MAJOR d'edat");
        } else {
            System.out.println(nom + " " + cognom + ", ets MENOR d'edat");
        }
    }
}


//No es poden posar '.' al nom de4 la clase ni puc posarli Exercisi1 per que ja tinc aquest nom a la carpeta de M3