package lab8.Task1.smartercalculator.calculatorResult;

import lab8.Task1.smartercalculator.CalculationRequest;

public class PrintingCalculationResult implements CalculationResult {

    private final CalculationResult calculationResult;

    public PrintingCalculationResult(CalculationResult calculationResult) {
        this.calculationResult = calculationResult;
    }

    @Override
    public Object computeResult() {
        Object result = calculationResult.computeResult();
        CalculationRequest request = calculationResult.getRequest();
        System.out.println("Operation " + request + " has result " + result);
        return result;
    }

    @Override
    public CalculationRequest getRequest() {
        return calculationResult.getRequest();
    }
}
