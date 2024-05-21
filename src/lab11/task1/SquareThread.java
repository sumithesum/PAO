package lab11.task1;

import java.util.List;

public class SquareThread extends Thread {
    private final List<Integer> numbers;

    public SquareThread(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (Integer number : numbers) {
            System.out.println(number + "^2=" + (number * number));
        }
    }
}
