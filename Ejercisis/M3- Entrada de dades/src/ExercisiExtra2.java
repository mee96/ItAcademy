/* Escriu un programa Java que sol·liciti per pantalla un nombre enter,
i si és menor que 10, ho assigni a una variable de tipus int, anomenada varInt.
Si no ho és, llavors li assignarà a la variable varInt el número 1.
(Utilitza per a això l'operador condicional ? :)
Després, imprimeix la taula de multiplicar d'aquesta variable. */

import java.util.Scanner;

public class ExercisiExtra2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introdueix un nombre enter: ");
        int num = scanner.nextInt();

        // condicional ternari, con react basicament, si es menor que 10 num = 1
        int varInt = (num < 10) ? num : 1;


        System.out.println("La taula de multiplicar de: " + varInt);

        // Imprimir la taula de multiplicar que va desde 1 a 10 ++ sumant un valor hasta 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(varInt + " x " + i + " = " + (varInt * i));
        }
    }
}
