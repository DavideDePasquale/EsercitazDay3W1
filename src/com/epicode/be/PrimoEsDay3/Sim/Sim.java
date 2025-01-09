package com.epicode.be.PrimoEsDay3.Sim;

public class Sim {
    protected String numeroCell;
    protected double credito;
    protected Chiamate[] ultime5chiamate;

    public Sim(String numeroCell) {
        this.numeroCell = numeroCell;
        this.credito = 0.0;
        this.ultime5chiamate = new Chiamate[5];
    }

    public void aggiungiChiamata(int i, String numeroChiamato, int durataChiamata) {
        ultime5chiamate[i] = new Chiamate(numeroChiamato, durataChiamata);
    }
    public void info() {
        System.out.println("Numero di cellulare : " + numeroCell);
        System.out.println(" Credito residuo : " + credito);
        System.out.println(" Ultime Chiamate :");
        for(int i = 0; i < 5; i++){
            if(ultime5chiamate[i] == null){
                System.out.println(ultime5chiamate[i].getNumeroChiamata() + " Minuti trascorsi di chiamata : " + ultime5chiamate[i].getDurataChiamata());
            } else {
                System.out.println(" Nessuna chiamata!");
            }
        }
    }
}
