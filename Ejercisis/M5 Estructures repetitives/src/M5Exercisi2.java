/*El programa demana dos números enters i llavors
calcula la suma dels valors compresos entre els dos números, inclosos.

Exemple: 4 i 10  --> resultat = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49

 */
import java.util.Scanner;

class M5Exercisi2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introdueix el segon número:");
        int num2 = scanner.nextInt();

        int suma = 0;

        for (int i = num1; i <= num2; i++) {
            suma += i;
        }

        System.out.println("El resultat de la suma és: " + suma);
    }
}
