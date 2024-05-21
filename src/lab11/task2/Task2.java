package lab11.task2;

import lab11.task1.SquareThread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class Task2 {

    private static List<Integer> generateNumbers(int count) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int[] sizes = {10, 1000, 10000, 10000000};
        BufferedWriter writer = new BufferedWriter(new FileWriter("timing_results.txt", true));

        for (int size : sizes) {
            List<Integer> numbers = generateNumbers(size);

            // Sequential
            long startTime = System.nanoTime();
            for (int number : numbers) {
                int square = number * number;
            }
            long endTime = System.nanoTime();
            writer.write(String.format("Sequential, Size %d: %d ns%n", size, endTime - startTime));


            startTime = System.nanoTime();
            int numThreads = Runtime.getRuntime().availableProcessors();
            int chunkSize = numbers.size() / numThreads;
            List<Thread> threads = new ArrayList<>();
            for (int i = 0; i < numThreads; i++) {
                int start = i * chunkSize;
                int end = (i + 1) * chunkSize;
                if (i == numThreads - 1) {
                    end = numbers.size();
                }
                List<Integer> sublist = numbers.subList(start, end);
                Thread thread = new SquareThread(sublist);
                threads.add(thread);
                thread.start();
            }
            for (Thread thread : threads) {
                thread.join();
            }
            endTime = System.nanoTime();
            writer.write(String.format("Thread, Size %d: %d ns%n", size, endTime - startTime));

            // ParallelStream
            startTime = System.nanoTime();
            IntStream.range(0, 10000).parallel().forEach(i -> System.out.println(i + "^2=" + (i * i)));
            endTime = System.nanoTime();
            writer.write(String.format("ParallelStream, Size %d: %d ns%n", size, endTime - startTime));

            // CompletableFuture
            startTime = System.nanoTime();

            for (int i = 0; i < 10000; i++) {
                final int aux = i;
                CompletableFuture
                        .supplyAsync(() -> aux+"^2=" + (aux * aux))
                        .thenAccept(System.out::println);
            }
            endTime = System.nanoTime();
            writer.write(String.format("CompletableFuture, Size %d: %d ns%n", size, endTime - startTime));
        }


        writer.close();
    }
}
