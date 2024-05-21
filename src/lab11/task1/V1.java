package lab11.task1;
import java.util.ArrayList;
import java.util.List;

public class V1 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
        }

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
    }
}
