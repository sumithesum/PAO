package lab6.task3;

public class Main {
    public static void main(String[] args) {

        Magazin magazin = new Magazin("Magazin universitate");

        ///Factory pattern
        Client client1 = new Client("Ion", 500.0, "Card");
        Client client2 = new Client("Maria", 700.0, "Cash");
        Client client3 = new Client("Ana", 1000.0, "Transfer");


        boolean tranzactie1 = magazin.tranzactie(200.0, client1);
        boolean tranzactie2 = magazin.tranzactie(800.0, client2);
        boolean tranzactie3 = magazin.tranzactie(300.0, client3);


        magazin.afisareTranzactie();


        System.out.println("Rezultatul tranzactiei 1: " + (tranzactie1 ? "Succes" : "Esuat"));
        System.out.println("Rezultatul tranzactiei 2: " + (tranzactie2 ? "Succes" : "Esuat"));
        System.out.println("Rezultatul tranzactiei 3: " + (tranzactie3 ? "Succes" : "Esuat"));
    }
}
