public class ORdinador {

    // Atributs
    private String marca;
    private String model;
    private String processador;
    private int memoriaRAM; // en GB
    private int discDur;    // en GB

    // Constructor només amb marca i model
    public Ordinador(String marca, String model) {
        this.marca = marca;
        this.model = model;
        this.processador = "No especificat";
        this.memoriaRAM = 0;
        this.discDur = 0;
    }

    // Constructor amb tots els atributs
    public Ordinador(String marca, String model, String processador, int memoriaRAM, int discDur) {
        this.marca = marca;
        this.model = model;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.discDur = discDur;
    }

    // Mètodes getters
    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getDiscDur() {
        return discDur;
    }

    // Mètodes setters (només els demanats)
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setDiscDur(int discDur) {
        this.discDur = discDur;
    }

    // Mètode que simula l'execució d'un programa
    public String executarPrograma(String programa) {
        return "En aquests moments s'està executant: " + programa;
    }

    // Descripció completa de l'ordinador
    @Override
    public String toString() {
        return "Ordinador {" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", processador='" + processador + '\'' +
                ", memòria RAM=" + memoriaRAM + " GB" +
                ", disc dur=" + discDur + " GB" +
                '}';
    }
}
