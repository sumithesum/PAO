package lab6.task3;

import java.util.ArrayList;

public class Magazin {
    private String nume;
    private ArrayList<Tranzactie> tranzictii;

    public Magazin(String nume) {
        this.nume = nume;
        this.tranzictii = new ArrayList<Tranzactie>();
    }
    public boolean tranzactie(Double pret, Client client){
        Tranzactie tr = null;
       ///strategy pattern
        if(client.getPayMethod()=="Card"){
            tr = new PayCard(pret,client);
        }else if(client.getPayMethod()=="Cash"){
            tr = new PayCash(pret,client);
        }else if(client.getPayMethod()=="Transfer"){
            tr = new PayTransfer(pret,client);
        }else {
            tr = new PayCard(pret,client);
        }
        tranzictii.add(tr);
        return tr.trimis;
    }
    public void afisareTranzactie(){
        System.out.println(nume);
        for(Tranzactie t: tranzictii){
            System.out.println(t);
        }
    }
}
