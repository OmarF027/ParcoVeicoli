package com.omarf;
import java.time.LocalDate;

public class Veicolo{
    public String targa;
    public String marca;
    public String modello;
    public int annoImmatricolazione;

    public Veicolo( String t, String m, String mo, int a) {
        targa = t;
        marca = m;
        modello = mo;
        annoImmatricolazione = a;
    }
    //setter e getter
    public void setTarga(String t) {
        if (t != null && t.length() > 0)
            targa = t;
        else
            System.out.println("Targa non valida");
    }
    public void setMarca(String m) {
        if (m != null && m.length() > 0)
            marca = m;
        else
            System.out.println("Marca non valida");
    }
    public void setModello(String mo) {
        if (mo != null && mo.length() > 0)
            modello = mo;
        else
            System.out.println("Modello non valido");
    }
    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        if (annoImmatricolazione > 1900){
            this.annoImmatricolazione = annoImmatricolazione;
        } else {
            System.out.println("Anno di immatricolazione non valido");
        }
    }
    public String getTarga() {
        return targa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }
    
    public int calcolaEta() {
        int annoCorrente = LocalDate.now().getYear();
        return annoCorrente - annoImmatricolazione;
    }
    @Override
    public String toString() {
        return "Veicolo[" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", annoImmatricolazione=" + annoImmatricolazione +
                "]";
    }

}