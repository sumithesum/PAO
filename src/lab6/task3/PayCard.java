package lab6.task3;

public class PayCard extends Tranzactie{
    public PayCard(Double pret, Client client) {
        super(pret, client);
    }

    @Override
    public String toString() {
        return "Task3.PayCard{" +
                "sumaTransferata=" + pret +
                ", data='" + data + '\'' +
                ", client=" + client +
                ", trimis=" + trimis +
                '}';
    }
}
