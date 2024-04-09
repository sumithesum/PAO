package lab6.task3;

public class PayCash  extends Tranzactie{

    public PayCash(Double pret, Client client) {
        super(pret, client);
    }

    @Override
    public String toString() {
        return "Task3.PayCash{" +
                "sumaTransferata=" + sumaTransferata +
                ", data='" + data + '\'' +
                ", client=" + client +
                ", trimis=" + trimis +
                '}';
    }
}
