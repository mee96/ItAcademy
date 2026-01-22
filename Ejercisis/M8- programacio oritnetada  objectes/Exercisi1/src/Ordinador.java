/*
Crea un nou projecte Java amb una classe anomenada "Ordinador",
 a més a més de la classe que conté el main.

Aquesta classe tindrà com a atributs la marca, el model, el processador,
la quantitat de memòria RAM i la capacitat del disc dur.

L'aplicació ha de poder generar ordinadors de diferents maneres:

Només a partir de la marca i el model.

Indicant tots els atributs.

La classe Ordinador ha de disposar dels següents mètodes:

Mètodes que permetin consultar cadascun dels atributs.
Mètodes que permetin modificar el processador, la quantitat de memòria ram i la capacitat del disc dur.
Un mètode que rebrà un string per paràmetre i retornarà un string que digui:
 "En aquests moments s'està executant: 'X'" (X és el paràmetre rebut pel mètode
 i que normalment serà el nom d'un programa) Exemple: "En aquests moments s'està executant: Eclipse"
Un mètode que retornarà una descripció completa de l'ordinador (toString()).
Al main del projecte crea ordinadors de les 2 maneres possibles i comprova que
els mètodes creats funcionen correctament.
 */

public class Ordinador {
    // Atributs
    private String marca;
    private String model;
    private String processador;
    private int ram;
    private int discDur;


    //només amb marca i model
    public Ordinador(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    //amb tots els atributs
    public Ordinador(String marca, String model, String processador, int ram, int discDur) {
        this.marca = marca;
        this.model = model;
        this.processador = processador;
        this.ram = ram;
        this.discDur = discDur;
    }

    // metode consulta
    public String getMarca() { return marca; }
    public String getModel() { return model; }
    public String getProcessador() { return processador; }
    public int getRam() { return ram; }
    public int getDiscDur() { return discDur; }

    // metode modificar
    public void setProcessador(String processador) { this.processador = processador; }
    public void setRam(int ram) { this.ram = ram; }
    public void setDiscDur(int discDur) { this.discDur = discDur; }

    // metode que torna els strings
    public String executarPrograma(String nomPrograma) {
        return "En aquests moments s'està executant: '" + nomPrograma + "'";
    }

    // metode descripcio completa
    public String toString() {
        return "Ordinador: " + marca + " " + model +
                " | Processador: " + processador +
                " | RAM: " + ram + "GB" +
                " | Disc: " + discDur + "GB";
    }
}