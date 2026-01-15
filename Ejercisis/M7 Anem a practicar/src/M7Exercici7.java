/*
Fer un programa on l’usuari/ària introdueix per pantalla un caràcter i un número.
 El programa imprimeix per pantalla un quadrat amb la mida i el caràcter introduïts
 per l’usuari/ària.
 */
import java.util.Scanner;

public class M7Exercici7 {
    public static void main(String[] args) {
        Scanner matriu = new Scanner(System.in);

        System.out.print("Introdueix un caràcter: ");
        char caracter = matriu.next().charAt(0); //charAT exigueix una posicio aixi que posem 0 que seria la primera posicio del caracter

        System.out.print("Introdueix la mida del quadrat: ");
        int mida = matriu.nextInt();

        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }
}
