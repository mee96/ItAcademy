/* L’usuari/ària introdueix un mes per pantalla i mitjançant un switch amb els 12 mesos de l’any,
el programa calcula els dies del mes i mostra el següent:
Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla:
“El mes de gener té 31 dies”
 */

import java.util.Scanner;

class M4Exercisi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el número del mes (1-12):");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("El mes de gener té 31 dies");
                break;
            case 2:
                System.out.println("El mes de febrer té 28 o 29 dies");
                break;
            case 3:
                System.out.println("El mes de març té 31 dies");
                break;
            case 4:
                System.out.println("El mes d'abril té 30 dies");
                break;
            case 5:
                System.out.println("El mes de maig té 31 dies");
                break;
            case 6:
                System.out.println("El mes de juny té 30 dies");
                break;
            case 7:
                System.out.println("El mes de juliol té 31 dies");
                break;
            case 8:
                System.out.println("El mes d'agost té 31 dies");
                break;
            case 9:
                System.out.println("El mes de setembre té 30 dies");
                break;
            case 10:
                System.out.println("El mes d'octubre té 31 dies");
                break;
            case 11:
                System.out.println("El mes de novembre té 30 dies");
                break;
            case 12:
                System.out.println("El mes de desembre té 31 dies");
                break;
            default:
                System.out.println("Número de mes no vàlid");
        }
    }
}
