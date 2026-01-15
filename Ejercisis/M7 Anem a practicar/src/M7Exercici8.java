/*
Crea un programa on l’usuari/ària introdueixi una temperatura
 en°C i es mostri per pantalla la conversió en ºFahrenheit
 */
import java.util.Scanner;

public class M7Exercici8 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        System.out.print("Introdueix la temperatura en ºC: ");
        double celsius = temp.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " ºC equival a " + fahrenheit + " ºF");
    }
}
