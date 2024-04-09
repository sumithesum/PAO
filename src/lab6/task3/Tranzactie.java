package lab6.task3;

import java.time.Instant;

public class Tranzactie {
    protected Double pret;
    protected String data;
    protected Client client;
    protected boolean trimis;

    public Tranzactie(Double sumaTransferata,Client client) {
        this.pret = sumaTransferata;
        this.data = String.valueOf(Instant.now());
        this.client=client;
        this.trimis=client.getSumaCont(sumaTransferata);
    }
}
