package com.epicode.be.PrimoEsDay3.Sim;

public class Chiamate {
    private String numeroChiamata;
    private double durataChiamata;

    public Chiamate(String numeroChiamata, double durataChiamata) {
        this.numeroChiamata = numeroChiamata;
        this.durataChiamata = durataChiamata;
       }
       public String getNumeroChiamata(){
        return numeroChiamata;
       }
       public double getDurataChiamata(){
        return durataChiamata;
       }

    }

