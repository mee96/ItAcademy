/*Has de modificar el programa anterior per afegir una nova funcionalitat: establir un número màxim de 5 intents.

Si l’usuari/ària encerta el número escollit pel programa abans d'aquests 5 intents, el programa mostra el següent missatge per pantalla: “Enhorabona, el número és X i has necessitat Y intents per encertar-lo”.

Si no encerta el número abans de 5 intents, el programa mostra per pantalla: "Has utilitzat massa intents! El número és X ".

 */

import java.util.Scanner;

class M5Exercisi4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroAleatori = (int) Math.ceil(Math.random() * 10);

        int numeroUsuari = 0;
        int intents = 0;
        int maxIntents = 5;

        while (numeroUsuari != numeroAleatori && intents < maxIntents) {
            System.out.println("Introdueix un número entre 1 i 10:");
            numeroUsuari = input.nextInt();
            intents++;
        }

        if (numeroUsuari == numeroAleatori) {
            System.out.println("Enhorabona, el número és " + numeroAleatori +
                    " i has necessitat " + intents + " intents per encertar-lo.");
        } else {
            System.out.println("Has utilitzat massa intents! El número és " + numeroAleatori);
        }
    }
}
