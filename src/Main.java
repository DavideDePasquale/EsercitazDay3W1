import com.epicode.be.PrimoEsDay3.Rettangolo;
import com.epicode.be.PrimoEsDay3.Sim.Sim;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      //ESERCIZIO 1
        Rettangolo es1 = new Rettangolo( 5, 6);
        es1.stampaRettangolo();
        Rettangolo es2 = new Rettangolo(3,3); //ha i lati uguali, quindi non è un rettangolo!
        es2.stampaRettangolo();
        Rettangolo es3 = new Rettangolo(6,8);
        es2.stampaDueRettangoli(es1,es3);



        // ESERCIZIO 2
        Sim schedaSim1 = new Sim("3409834560");
        schedaSim1.aggiungiChiamata(0, "340000000" , 5);
        schedaSim1.aggiungiChiamata(1, "349884521" , 1);
        schedaSim1.aggiungiChiamata(2, "333133133" , 1);
        schedaSim1.aggiungiChiamata(3, "345678901" , 1);
        schedaSim1.aggiungiChiamata(4, "350210034" , 2);
        schedaSim1.info();
        ;

    }
}