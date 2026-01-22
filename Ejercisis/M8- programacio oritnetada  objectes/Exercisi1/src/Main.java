/*
Al main del projecte crea ordinadors de les 2 maneres possibles
i comprova que els mètodes creats funcionen correctament
 */

public class Main {
    public static void main(String[] args) {

        Ordinador pc1 = new Ordinador("MSI", "Prestige");
        Ordinador pc2 = new Ordinador("Alienware", "Aurora", "Intel i9", 16, 1000);

        pc1.setProcessador("i7");
        pc1.setRam(8);
        pc1.setDiscDur(256);

        System.out.println("Marca del pc2: " + pc2.getMarca());
        System.out.println(pc1.executarPrograma("IntelliJ Idea"));
        //System.out.println(pc2.executarPrograma("Vscode"));

        System.out.println("Descripcions:");
        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
    }
}