/*Fer un programa que demani a l’usuari/ària
quin dia i quin mes va néixer, amb aquesta informació
el programa mostra per pantalla, de quin signe del zodíac és.

Àries-Aries (21.03 — 19.04)
Taure-Tauro (20.04 — 20.05)
Bessons-Géminis (21.05 — 20.06)
Cranc-Cáncer (21.06 — 22.07)
Lleó-Leo (23.07 — 22.08)
Verge-Virgo (23.08 — 22.09)
Balança-Libra (23.09 — 22.10)
Escorpí-Escorpión (23.10 — 21.11)
Sagitari-Sagitario (22.11 — 21.12)
Capricorn-Capricornio (22.12 — 19.01)
Aquari-Acuario (20.01 — 18.02)
Peixos-Piscis (19.02 — 20.03)

 */

import java.util.Scanner;

class M4Exercisi6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix el dia que vas néixer:");
        int dia = scanner.nextInt();

        System.out.println("Introdueix el mes que vas néixer (1-12):");
        int mes = scanner.nextInt();

        String signe = "";

        switch (mes) {
            case 1: // Gener
                if (dia <= 19) signe = "Capricorn";
                else signe = "Aquari";
                break;

            case 2: // Febrer
                if (dia <= 18) signe = "Aquari";
                else signe = "Peixos";
                break;

            case 3: // Març
                if (dia <= 20) signe = "Peixos";
                else signe = "Àries";
                break;

            case 4: // Abril
                if (dia <= 19) signe = "Àries";
                else signe = "Taure";
                break;

            case 5: // Maig
                if (dia <= 20) signe = "Taure";
                else signe = "Bessons";
                break;

            case 6: // Juny
                if (dia <= 20) signe = "Bessons";
                else signe = "Cranc";
                break;

            case 7: // Juliol
                if (dia <= 22) signe = "Cranc";
                else signe = "Lleó";
                break;

            case 8: // Agost
                if (dia <= 22) signe = "Lleó";
                else signe = "Verge";
                break;

            case 9: // Setembre
                if (dia <= 22) signe = "Verge";
                else signe = "Balança";
                break;

            case 10: // Octubre
                if (dia <= 22) signe = "Balança";
                else signe = "Escorpí";
                break;

            case 11: // Novembre
                if (dia <= 21) signe = "Escorpí";
                else signe = "Sagitari";
                break;

            case 12: // Desembre
                if (dia <= 21) signe = "Sagitari";
                else signe = "Capricorn";
                break;

            default:
                System.out.println("Mes no vàlid");
                return;
        }

        System.out.println("El teu signe del zodíac és: " + signe);
    }
}
