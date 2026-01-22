public class Main {

    public static void main(String[] args) {

        // Ordinador creat només amb marca i model
        Ordinador ordinador1 = new Ordinador("Dell", "Inspiron");

        // Ordinador creat amb tots els atributs
        Ordinador ordinador2 = new Ordinador(
                "Apple",
                "MacBook Pro",
                "M2",
                16,
                512
        );

        // Modifiquem atributs de l'ordinador1
        ordinador1.setProcessador("Intel i5");
        ordinador1.setMemoriaRAM(8);
        ordinador1.setDiscDur(256);

        // Comprovem getters
        System.out.println("Marca ordinador1: " + ordinador1.getMarca());
        System.out.println("Model ordinador1: " + ordinador1.getModel());
        System.out.println("RAM ordinador1: " + ordinador1.getMemoriaRAM() + " GB");

        // Comprovem mètode d'execució
        System.out.println(ordinador1.executarPrograma("Eclipse"));
        System.out.println(ordinador2.executarPrograma("IntelliJ IDEA"));

        // Mostrem la descripció completa
        System.out.println(ordinador1.toString());
        System.out.println(ordinador2.toString());
    }
}
