package lab8.Task1.smartercalculator.calculatorResult;

import lab8.Task1.smartercalculator.CalculationRequest;

public interface CalculationResult {
    Object computeResult();
    CalculationRequest getRequest();
}
