package com.epicode.be.PrimoEsDay3.ultimoes;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {
     private String codiceCliente;
     private String nomeCognome;
     private String email;
     private LocalDate dataIscrizione;

     public Cliente(String codiceCliente, String nomeCognome, String email, LocalDate dataIscrizione){
         this.codiceCliente = codiceCliente;
         this.nomeCognome = nomeCognome;
         this.email = email;
         this.dataIscrizione = dataIscrizione;

     }
     public void info(){
         System.out.println("Codice cliente : " + codiceCliente + " " + nomeCognome);
         System.out.println("email :" + email);
         System.out.println("Data di iscrizione : " + dataIscrizione);

     }

}
