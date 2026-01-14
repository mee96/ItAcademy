/* Aquest programa li demana l’edat a l’usuari/ària, en funció d’aquesta,
mostrarem un dels següents missatges per pantalla:
Si té 5 anys o menys: preescolar.
Si té entre 6 i 11 anys: primària.
Si té entre 12 i 15: ESO.
Si té entre 16 i 17: Batxillerat.
Si és major d'edat: FP o Universitat.
 */

import java.util.Scanner;

public class M4Exercisi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix la teva edat: ");
        int edat = scanner.nextInt();

        if (edat <= 5) {
            System.out.println("Preescolar");
        } else if (edat >= 6 && edat <= 11) {
            System.out.println("Primària");
        } else if (edat >= 12 && edat <= 15) {
            System.out.println("ESO");
        } else if (edat >= 16 && edat <= 17) {
            System.out.println("Batxillerat");
        } else if (edat >= 18) {
            System.out.println("FP o Universitat");
        } else {
            System.out.println("Edat no vàlida");
        }
    }
}
