package lab11.task1;

import java.util.concurrent.CompletableFuture;

public class V3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            final int aux = i;
            CompletableFuture
                    .supplyAsync(() -> aux+"^2=" + (aux * aux))
                    .thenAccept(System.out::println);
        }
    }

}
