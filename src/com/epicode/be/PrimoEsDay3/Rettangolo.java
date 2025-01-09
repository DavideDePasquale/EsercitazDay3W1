package com.epicode.be.PrimoEsDay3;

public class Rettangolo {
    private double altezza;
    private double larghezza;

public Rettangolo(double altezza,double larghezza){
    this.altezza = altezza;
    this.larghezza = larghezza;

}
public double perimetroRett (){
    return (altezza + larghezza)*2;
}
public double areaRett(){
    return altezza * larghezza;
}
    public void stampaRettangolo(){
     if(altezza == larghezza){
            System.out.println("Stai calcolando il perimetro di un quadrato che è di :" + this.perimetroRett() + " e la sua area è di : " + this.areaRett());
        } else {
            System.out.println("Il perimetro del rettangolo è : " + this.perimetroRett() + " e la sua area è di : " + this.areaRett());
        }

    }
    public void stampaDueRettangoli(Rettangolo r){
     double perimetroRett1 = this.perimetroRett();
     double areaRett1 = this.areaRett();

     double perimetroRett2 = r.perimetroRett();
     double areaRett2 = r.areaRett();

      double sommaAreaRett = areaRett1 + areaRett2;
      double sommaPerimetriRett = perimetroRett1 + perimetroRett2;
        System.out.println("La somma delle due aree è di : " + sommaAreaRett + " e la somma dei loro perimetri è di : " + sommaPerimetriRett);
    }
}