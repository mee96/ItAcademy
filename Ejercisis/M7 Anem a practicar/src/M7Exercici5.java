/*
Crea una llista de tasques. Fes un menú que permeti a l’usuari/ària afegir,
mostrar i eliminar tasques, a més de sortir de l’aplicació.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class M7Exercici5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasques = new ArrayList<>();

        int opcio;

        do {
            // Menú de lo que volem elegir, el numero sera lo que marcara
            System.out.println("--- MENÚ DE TASQUES ---");
            System.out.println("1. Afegir tasca");
            System.out.println("2. Mostrar tasques");
            System.out.println("3. Eliminar tasca");
            System.out.println("4. Sortir");
            System.out.print("Escull una opció: ");

            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:
                    // Afegir tasca
                    System.out.print("Introdueix la nova tasca: ");
                    String tasca = sc.nextLine();
                    tasques.add(tasca);
                    System.out.println("Tasca afegida correctament.");
                    break;

                case 2:
                    // Mostrar tasques
                    if (tasques.isEmpty()) {
                        System.out.println("No hi ha tasques a mostrar.");
                    } else {
                        System.out.println("\nLlista de tasques:");
                        for (int i = 0; i < tasques.size(); i++) {
                            System.out.println((i + 1) + ". " + tasques.get(i));
                        }
                    }
                    break;

                case 3:
                    // Eliminar tasca
                    if (tasques.isEmpty()) {
                        System.out.println("No hi ha tasques per eliminar.");
                    } else {
                        System.out.println("\nQuina tasca vols eliminar?");
                        for (int i = 0; i < tasques.size(); i++) {
                            System.out.println((i + 1) + ". " + tasques.get(i));
                        }

                        System.out.print("Introdueix el número de la tasca: ");
                        int index = sc.nextInt();

                        if (index > 0 && index <= tasques.size()) {
                            tasques.remove(index - 1);
                            System.out.println("Tasca eliminada correctament.");
                        } else {
                            System.out.println("Número de tasca no vàlid.");
                        }
                    }
                    break;

                case 4:
                    // Sortir - realment nomes mostra un missatje - sortir ho marca surtir del bucle
                    System.out.println("Sortint de l'aplicació...");
                    break;

                default: //Ja que estem si posem un numero que no es que digue aixo
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
            }

        } while (opcio != 4); //repetix tot lo rato mentre sigue diferent a 4, si es 4, parara el bucle, per tant, la funcio

    }
}
