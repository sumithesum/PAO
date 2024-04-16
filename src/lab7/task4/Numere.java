package lab7.task4;

public class Numere {
        private final int nr;
        private final int sq;

        public Numere(int num) {
            this.nr = num;
            this.sq = num * num;
        }

        @Override
        public String toString() {
            return "Number: " + nr + ", Square: " + sq;
        }
}
