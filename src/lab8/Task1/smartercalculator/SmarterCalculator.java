package lab8.Task1.smartercalculator;

import lab8.Task1.smartercalculator.calculatorResult.BooleanCalculationResult;
import lab8.Task1.smartercalculator.calculatorResult.AbstractCalculationResult;
import lab8.Task1.smartercalculator.calculatorResult.CalculationResult;
import lab8.Task1.smartercalculator.calculatorResult.DoubleCalculationResult;
import lab8.Task1.smartercalculator.calculatorResult.IntegerCalculationResult;

import java.util.List;
import java.util.stream.Collectors;

public class SmarterCalculator {

    public static List<CalculationResult> calculate(String[] args) {
        return InputConverter.mapRequests(args)
                .stream()
                .map(SmarterCalculator::createCalculatorResponse)
                .collect(Collectors.toList());
    }

    private static CalculationResult createCalculatorResponse(CalculationRequest request) {
        return switch (request.getRequestType()) {
            case Boolean -> new BooleanCalculationResult(request);
            case Integer -> new IntegerCalculationResult(request);
            case Double -> new DoubleCalculationResult(request);
            default -> throw new IllegalArgumentException();
        };
    }
}
