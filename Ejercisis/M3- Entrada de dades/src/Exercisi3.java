/* El programa demana a l'usuari/ària que introdueixi
3 notes i el programa mostra la mitja de
 les 3 notes per pantalla.*/


import java.util.Scanner;

public class Exercisi3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demanar les 3 notes, sout per demanar scanner per recollir
        System.out.print("Introdueix la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introdueix la segona nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introdueix la tercera nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular la mitja, double perqe la divisio por tenir decimals
        double mitja = (nota1 + nota2 + nota3) / 3;

        // Mostrar el resultat en sout
        System.out.printf("La mitja de les tres notes és: %.2f", mitja);
    }
}

// hi hauria manera de arrodonir resultat per no tenir tants decimals?
//sí, en %.#decimals que vull
