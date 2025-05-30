package com.omarf;
import java.time.LocalDate;

public class Autoveicoli extends Veicolo{
    private int numeroPorte;
    private String alimentazione;
    private LocalDate dataUltimaRevisione;
    // Costruttore della classe Autoveicoli
    public Autoveicoli(String t, String m, String mo, int a, int nP, String ali, LocalDate dUt) {
        super(t, m, mo, a);
        numeroPorte = nP;
        alimentazione = ali;
        dataUltimaRevisione = dUt;
    }
    // Setter e getter
    public void setNumeroPorte(int nP) {
        if (nP >= 2)
            numeroPorte = nP;
        else
            System.out.println("Numero di porte non valido");
    }
    public void setAlimentazione(String ali) {
        if (ali != null && ali.length() > 0)
            alimentazione = ali;
        else
            System.out.println("Alimentazione non valida");
    }
    public void setDataUltimaRevisione(LocalDate dUt) {
        if (dUt != null && dUt.isAfter(LocalDate.now()))
            dataUltimaRevisione = dUt;
        else
            System.out.println("Data ultima revisione non valida");
    }
    public int getNumeroPorte() {
        return numeroPorte;
    }
    public String getAlimentazione() {
        return alimentazione;
    }
    public LocalDate getDataUltimaRevisione() {
        return dataUltimaRevisione;
    }
    public boolean necessitaRevisione() {
        // Calcola la data limite: oggi meno 2 anni
        LocalDate dataLimite = LocalDate.now().minusYears(2);
        return dataUltimaRevisione.isBefore(dataLimite);
    }
    @Override
    public String toString() {
        return "Autoveicoli[" +
                super.toString() +
                "numeroPorte=" + numeroPorte +
                ", alimentazione='" + alimentazione + '\'' +
                ", dataUltimaRevisione=" + dataUltimaRevisione +
                "]";
    }

}
