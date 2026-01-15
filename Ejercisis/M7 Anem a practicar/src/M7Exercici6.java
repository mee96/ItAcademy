/*
Taula de multiplicar.
L’usuari/ària introduirà un número (de l'1 al 10) per pantalla,
i utilitzant un bucle, el programa li mostrarà la taula de multiplicar d’aquell número.
 */
import java.util.Scanner;

public class M7Exercici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un número de l'1 al 10: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Taula de multiplicar del " + numero + ":");
            //bucle que anira sumant 1 mentre no sigue 10 y anira multiplicant, a 10 para
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
