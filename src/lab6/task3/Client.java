package lab6.task3;

public class Client {
    private String nume;
    private Double sumaCont;
    private String payMethod;

    private Client(Builder builder) {
        this.nume = builder.nume;
        this.sumaCont = builder.sumaCont;
        this.payMethod = builder.payMethod;
    }

    public static class Builder {
        private String nume;
        private Double sumaCont;
        private String payMethod;

        public Builder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        public Builder setSumaCont(Double sumaCont) {
            this.sumaCont = sumaCont;
            return this;
        }

        public Builder setPayMethod(String payMethod) {
            this.payMethod = payMethod;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }

    public boolean getSumaCont(Double sumaTransferata)
    {
        if(this.sumaCont>sumaTransferata)
        {
            this.sumaCont = this.sumaCont - sumaTransferata;
            return true;
        }
        else return false;
    }

    public String getPayMethod() {
        return payMethod;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", sumaCont=" + sumaCont +
                ", payMethod='" + payMethod + '\'' +
                '}';
    }
}