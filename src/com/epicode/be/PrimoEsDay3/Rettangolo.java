package com.epicode.be.PrimoEsDay3;

public class Rettangolo {
    protected int altezza;
    protected int larghezza;
    int perimetro = (altezza + larghezza)*2;
    int area = altezza * larghezza;

public Rettangolo(int altezza,int larghezza){
    this.altezza = altezza;
    this.larghezza = larghezza;

}
public int perimetroRett (){
    return (altezza + larghezza)*2;
}
public int areaRett(){
    return altezza * larghezza;
}
    public void stampaRettangolo(){
      int perimetroR = perimetroRett();
      int areaR = areaRett();
      areaRett();
        if(altezza == larghezza){
            System.out.println("Stai calcolando il perimetro di un quadrato che è di :" + perimetroR + " e la sua area è di : " + areaR);
        } else {
            System.out.println("Il perimetro del rettangolo è : " + perimetroR + " e la sua area è di : " + areaR);
        }

    }
    public void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
     int perimetroRett1 = r1.perimetroRett();
     int areaRett1 = r1.areaRett();


     int perimetroRett2 = r2.perimetroRett();
     int areaRett2 = r2.areaRett();


      int sommaAreaRett = areaRett1 + areaRett2;
      int sommaPerimetriRett = perimetroRett1 + perimetroRett2;
        System.out.println("La somma delle due aree è di : " + sommaAreaRett + " e la somma dei loro perimetri è di : " + sommaPerimetriRett);

    }
}
