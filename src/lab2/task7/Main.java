package lab2.task7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] input = {"1", "+", "2",
                "2", "*", "5",
                "1", "+", "5.0",
                "1.0", "-", "2",
                "10.0", "/", "1",
                "true", "&&", "false",};
        List<CalculatorResult> calculationResults = SmarterCalculator.calculate(input);

        for (CalculatorResult result : calculationResults) {
            CalculatorRequest request = result.getRequest();
            System.out.println("Operation " + request + " has result " + result.computeResult());
        }
    }
}
