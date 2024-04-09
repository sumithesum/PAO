package lab6.task3;

public class Main {
    public static void main(String[] args) {

        Magazin magazin = new Magazin("Now Magazin");

        ///Builder pattern
        Client client1 = new Client.Builder()
                .setNume("Matei")
                .setSumaCont(1500.0)
                .setPayMethod("Card")
                .build();

        Client client2 = new Client.Builder()
                .setNume("Marcus")
                .setSumaCont(300.0)
                .setPayMethod("Cash")
                .build();

        Client client3 = new Client.Builder()
                .setNume("Costin")
                .setSumaCont(1000.0)
                .setPayMethod("Transfer")
                .build();


        boolean tranzactie1 = magazin.tranzactie(100.0, client1);
        boolean tranzactie2 = magazin.tranzactie(10000.0, client2);
        boolean tranzactie3 = magazin.tranzactie(300.0, client3);


        magazin.afisareTranzactie();

        System.out.println("1: " + (tranzactie1 ? "Succes" : "Esuat"));
        System.out.println("2: " + (tranzactie2 ? "Succes" : "Esuat"));
        System.out.println("3: " + (tranzactie3 ? "Succes" : "Esuat"));
    }
}
