/* Realitzar un joc per endevinar un nombre aleatori N, entre 1 i 500.
Si la distància entre el nombre a endevinar i el de l'usuari/ària és de 50 o més, el programa haurà de dir:
“Fred, fred: el teu número és més gran “ o “Fred, fred: el teu número és més petit “
Si la distància entre el nombre a endevinar i el de l'usuari/ària està entre 15 i 50, el programa haurà de dir:
“Tebi, Tebi: el teu número és més gran “ o “Tebi, Tebi: el teu número és més petit “
I si la distància entre el nombre a endevinar i el de l'usuari/ària és menor a 15, el programa haurà de dir:
“Calent, calent: el teu número és més gran “ o “Calent, calent: el teu número és més petit “
El procés acaba quan l'usuari/ària encerta.
 */

import java.util.Scanner;

class M5ExercisiExtra1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        int numeroAleatori = (int) Math.ceil(Math.random() * 500);

        int numeroUsuari = 0;

        System.out.println("Endevina el número entre 1 i 500!");

        while (numeroUsuari != numeroAleatori) {
            System.out.println("Introdueix un número:");
            numeroUsuari = entrada.nextInt();

            int distancia = Math.abs(numeroAleatori - numeroUsuari);

            if (numeroUsuari < numeroAleatori) {
                if (distancia >= 50) {
                    System.out.println("Fred, fred: el teu número és més petit");
                } else if (distancia >= 15) {
                    System.out.println("Tebi, Tebi: el teu número és més petit");
                } else {
                    System.out.println("Calent, calent: el teu número és més petit");
                }
            } else if (numeroUsuari > numeroAleatori) {

                if (distancia >= 50) {
                    System.out.println("Fred, fred: el teu número és més gran");
                } else if (distancia >= 15) {
                    System.out.println("Tebi, Tebi: el teu número és més gran");
                } else {
                    System.out.println("Calent, calent: el teu número és més gran");
                }
            }
        }
        System.out.println("Enhorabona! Has encertat el número: " + numeroAleatori);
    }
}
