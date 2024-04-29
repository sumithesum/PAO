package lab8.Task1.smartercalculator;

import lab8.Task1.smartercalculator.calculatorResult.AbstractCalculationResult;
import lab8.Task1.smartercalculator.calculatorResult.CalculationResult;
import lab8.Task1.smartercalculator.calculatorResult.PrintingCalculationResult;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        args = new String[]{
                "1", "+", "2",
                "2", "*", "5",
                "1", "+", "5.0",
                "1.0", "-", "2",
                "10.0", "/", "1",
        };

        runSmarterCalculator(args);
    }

    private static void runSmarterCalculator(String[] args) {
        SmarterCalculator
                .calculate(args)
                .stream()
                .map(PrintingCalculationResult::new)
                .forEach(PrintingCalculationResult::computeResult);
    }
}
