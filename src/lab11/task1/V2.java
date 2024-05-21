package lab11.task1;


import java.util.stream.IntStream;

public class V2 {
    public static void main(String[] args) {
        IntStream.range(0, 10000).parallel().forEach(i -> System.out.println(i + "^2=" + (i * i)));
    }
}
