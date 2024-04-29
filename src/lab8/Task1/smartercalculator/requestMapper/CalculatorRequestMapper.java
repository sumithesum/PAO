package lab8.Task1.smartercalculator.requestMapper;

import lab8.Task1.smartercalculator.CalculationRequest;

import java.util.Optional;

public interface CalculatorRequestMapper {
    Optional<CalculationRequest> tryMapRequest(
            String leftOperandString,
            String operatorString,
            String rightOperandString);
}
