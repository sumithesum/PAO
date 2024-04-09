package lab6.task3;

public class PayTransfer extends Tranzactie{

    public PayTransfer(Double pret, Client client) {
        super(pret, client);
    }

    @Override
    public String toString() {
        return "Task3.PayTransfer{" +
                "sumaTransferata=" + sumaTransferata +
                ", data='" + data + '\'' +
                ", client=" + client +
                ", trimis=" + trimis +
                '}';
    }
}
