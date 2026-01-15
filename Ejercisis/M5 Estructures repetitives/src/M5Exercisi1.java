/* El programa demana quantes paraules vol introduir
l'usuari/ària. Aquest, introdueix el número i llavors apareix el
següent missatge: "Introdueix la paraula".

Aquest missatge es mostra tantes vegades com número de
paraules ha dit l'usuari/ària que volia introduir.
Les paraules es guarden en un arrayList i un cop han sigut totes introduïdes,
es mostren per pantalla.
 */

import java.util.ArrayList;
import java.util.Scanner;

class M5Exercisi1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> paraules = new ArrayList<>();

        System.out.println("Quantes paraules vols introduir?");
        int numParaules = scanner.nextInt();
        scanner.nextLine(); // Consumir salt de línia

        for (int i = 0; i < numParaules; i++) {
            System.out.println("Introdueix la paraula:");
            String paraula = scanner.nextLine();
            paraules.add(paraula);
        }

        System.out.println("Les paraules introduïdes són:");
        for (int i = 0; i < paraules.size(); i++) {
            System.out.println(paraules.get(i));
        }
    }
}
