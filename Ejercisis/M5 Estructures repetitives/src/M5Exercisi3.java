/*Aquesta línia de codi:
Math.ceil((Math.random() * 10));
Retorna un número entre el 1 i el 10 de forma aleatòria.
L’exercici consisteix a què l’usuari/ària ha d'endevinar el número escollit aleatòriament
pel programa.
El programa, demana números a l’usuari/ària fins que aquest encerti el número
aleatori generat pel programa.
Un cop l’usuari/ària ha endevinat el número, es mostrarà per pantalla el següent missatge:
“Enhorabona, el número era X”
 */

import java.util.Scanner;

class M5Exercisi3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int numeroAleatori = (int) Math.ceil(Math.random() * 10);

        int numeroUsuari = 0;

        while (numeroUsuari != numeroAleatori) {
            System.out.println("Introdueix un número entre 1 i 10:");
            numeroUsuari = input.nextInt();
        }

        System.out.println("Enhorabona, el número era " + numeroAleatori);
    }
}
