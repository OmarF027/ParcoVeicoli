package com.omarf;

public class ParcoVeicoli {
    Veicolo[] veicoli;
    int capacitaMassima = 30;
    int numeroVeicoli;

    public ParcoVeicoli() {
        veicoli = new Veicolo[capacitaMassima];
        numeroVeicoli = 0;
    }

    public void aggiungiVeicolo(Veicolo v) {
        if (numeroVeicoli < capacitaMassima) {
            veicoli[numeroVeicoli] = v;
            numeroVeicoli++;
        } else {
            System.out.println("Parco veicoli pieno, impossibile aggiungere il veicolo.");
        }
    }
    public double calcolaEtaMedia(){
        if(numeroVeicoli == 0) {
            System.out.println("Nessun veicolo presente nel parco.");
            return 0.0;
        }
        double sommaEta = 0;
        for(int i = 0; i < numeroVeicoli; i++) {
            if (veicoli[i] != null) {
                int eta = veicoli[i].calcolaEta();
                sommaEta += eta;
            }
        }
        double media = sommaEta / numeroVeicoli;
        return media;
    }
    public void stampaVeicoli() {
        if (numeroVeicoli == 0) {
            System.out.println("Nessun veicolo presente nel parco.");
            return;
        }
        for (int i = 0; i < numeroVeicoli; i++) {
            System.out.print(veicoli[i].toString());
            if (veicoli[i] instanceof Autoveicoli) {
                Autoveicoli auto = (Autoveicoli) veicoli[i];
                System.out.print(" - Necessita revisione: " + (auto.necessitaRevisione() ? "Sì" : "No"));
            }
            System.out.println();
        }
    }

}
