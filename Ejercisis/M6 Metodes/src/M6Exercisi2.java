/*
Aquest programa calcula l'edat mitjana d'un número de persones.
Aquest número s'haurà de preguntar a l'usuari/ària.
S'ha de crear una funció que s'encarregui de demanar les edats a l'usuari/ària
i de calcular l'edat mitjana.

La funció rebrà per paràmetre el núm. de persones a qui ha de demanar l'edat.
L'edat de les persones només serà vàlida si està compresa entre 0 i 120 anys.
La mitjana de les edats introduïdes s'ha de retornar per la funció (return).
 */


import java.util.Scanner;

class M6Exercisi2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introdueix el número de persones:");
        int numPersones = entrada.nextInt();

        double mitjana = calcularEdatMitjana(numPersones);

        System.out.println("L'edat mitjana és: " + mitjana);
    }

    public static double calcularEdatMitjana(int numPersones) {

        Scanner entrada = new Scanner(System.in);
        int sumaEdats = 0;
        int edat;
        int personesValides = 0;

        for (int i = 1; i <= numPersones; i++) {
            do {
                System.out.println("Introdueix l'edat de la persona " + i + ":");
                edat = entrada.nextInt();

                if (edat < 0 || edat > 120) {
                    System.out.println("Edat no vàlida. Ha d'estar entre 0 i 120.");
                }
            } while (edat < 0 || edat > 120);

            sumaEdats += edat;
            personesValides++;
        }
        return (double) sumaEdats / personesValides;
    }
}
/*
-mentre i (persones) sigue mes petit que el numdepersones que hem dit, anem guardan
la edat y sumantla en sumaedats, al final es edividira de personesvaldies y tindrem la mitja
 */