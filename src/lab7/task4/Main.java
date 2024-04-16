package lab7.task4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        IntStream.rangeClosed(0, N)
                .filter(n -> n % 2 == 0)
                .mapToObj(Numere::new)
                .forEach(System.out::println);

    }
}
