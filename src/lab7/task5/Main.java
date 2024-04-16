package lab7.task5;

import java.util.*;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numere = new ArrayList<>();
        Random random = new Random();

        int N = scanner.nextInt();

        while (numere.size() < N) {
            if (scanner.hasNextInt()) {
                numere.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }

        List<Function<Integer, Double>> operatii = Arrays.asList(
                numar -> numar * 10.0,
                numar -> numar + 1.0,
                numar -> numar - 1.0,
                numar -> 1.0 / numar,
                numar -> Math.pow(numar, 2),
                numar -> Math.sin(numar)
        );

        List<Double> raspuns = numere.stream()
                .map(numar -> operatii.get(random.nextInt(operatii.size())).apply(numar))
                .toList();

        System.out.println();
        System.out.println();
        System.out.println();
        for (var x : raspuns) {
            System.out.println(x);
        }
    }
}