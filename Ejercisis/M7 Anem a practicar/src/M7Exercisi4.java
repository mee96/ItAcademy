/*
L’usuari/ària ha d’introduir dos números,
 el programa retornarà “Un dels dos números és negatiu”,
 només si un dels dos números és negatiu.
 */
import java.util.Scanner;

public class M7Exercisi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introdueix el segon número: ");
        int num2 = sc.nextInt();

        if ((num1 < 0 && num2 >= 0) || (num1 >= 0 && num2 < 0)) {
            System.out.println("Un dels dos números és negatiu");
        }
    }
}
