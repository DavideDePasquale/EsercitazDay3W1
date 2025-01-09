package com.epicode.be.PrimoEsDay3.ultimoes;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int giacenza;

    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int giacenza){
            this.codiceArticolo = codiceArticolo;
            this.descrizioneArticolo = descrizioneArticolo;
            this.prezzo = prezzo;
            this.giacenza = giacenza;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public int getGiacenza(){
        return this.giacenza;
    }
}
