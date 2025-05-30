package com.omarf;

import java.time.LocalDate;

public class MainParcoVeicoli {
    public static void main(String[] args) {
		
		System.out.println("Benvenuto in parco CARrara!");
		ParcoVeicoli parco = new ParcoVeicoli();

		boolean input = true;

		while (input != false) {
			System.out.println("Scegli un'opzione:");
			System.out.println("1. Aggiungi veicolo");
			System.out.println("2. Stampa veicoli");
			System.out.println("3. Calcola età media");
			System.out.println("4. Esci");
			int scelta = Integer.parseInt(System.console().readLine());
			if (scelta < 1 || scelta > 4) {
				System.out.println("Opzione non valida, riprova.");
			} else {
			switch (scelta) {
				case 1:
					// Aggiungi veicolo
					System.out.println("Vuoi inserire un autoveicolo? (s/n)");
					String risposta = System.console().readLine();
					if (risposta.equals("s")) {
    System.out.println("Inserisci targa:");
    String targa = System.console().readLine();
    System.out.println("Inserisci marca:");
    String marca = System.console().readLine();
    System.out.println("Inserisci modello:");
    String modello = System.console().readLine();
    System.out.println("Inserisci anno di immatricolazione:");
    int annoImmatricolazione = Integer.parseInt(System.console().readLine());
    int annoCorrente = LocalDate.now().getYear();
    if (annoImmatricolazione > 1900 && annoImmatricolazione <= annoCorrente) {
        System.out.println("Inserisci numero di porte:");
        int numeroPorte = Integer.parseInt(System.console().readLine());
        System.out.println("Inserisci alimentazione:");
        String alimentazione = System.console().readLine();
        System.out.println("Inserisci L'anno dell' ultima revisione (YYYY):");
        int annoUltimaRevisione = Integer.parseInt(System.console().readLine());
        System.out.println("Inserisci il mese dell' ultima revisione (MM):");
        int meseUltimaRevisione = Integer.parseInt(System.console().readLine());
        System.out.println("Inserisci il giorno dell' ultima revisione (DD):");
        int giornoUltimaRevisione = Integer.parseInt(System.console().readLine());
        LocalDate dataUltimaRevisione = null;
        try {
            dataUltimaRevisione = LocalDate.of(annoUltimaRevisione, meseUltimaRevisione, giornoUltimaRevisione);
        } catch (java.time.DateTimeException e) {
            System.out.println("Data non valida, veicolo NON aggiunto.");
            break;
        }
        Autoveicoli autoveicolo = new Autoveicoli(targa, marca, modello, annoImmatricolazione, numeroPorte, alimentazione, dataUltimaRevisione);
        parco.aggiungiVeicolo(autoveicolo);
        System.out.println("Autoveicolo aggiunto con successo!");
    } else {
        System.out.println("Anno di immatricolazione non valido, veicolo NON aggiunto.");
    }
} else if (risposta.equals("n")) {
						System.out.println("Inserisci targa:");
						String targa = System.console().readLine();
						System.out.println("Inserisci marca:");
						String marca = System.console().readLine();
						System.out.println("Inserisci modello:");
						String modello = System.console().readLine();
						System.out.println("Inserisci anno di immatricolazione:");
						int annoImmatricolazione = Integer.parseInt(System.console().readLine());
						int annoCorrente = LocalDate.now().getYear();
						if (annoImmatricolazione > 1900 && annoImmatricolazione <= annoCorrente) {
						    Veicolo veicolo = new Veicolo(targa, marca, modello, annoImmatricolazione);
						    parco.aggiungiVeicolo(veicolo);
						    System.out.println("Veicolo aggiunto con successo!");
						} else {
						    System.out.println("Anno di immatricolazione non valido, veicolo NON aggiunto.");
						}
						} else {
						System.out.println("Risposta non valida, riprova.");
					}
					
					break;
				case 2:
					// Stampa veicoli
					parco.stampaVeicoli();
					break;
				case 3:
					// Calcola età media
					double media = parco.calcolaEtaMedia();
					System.out.println("Età media veicoli: " + media);
					break;
				case 4:
					input = false;
					break;
				default:
					System.out.println("Opzione non valida");
				}
			}
		}
	}
}
