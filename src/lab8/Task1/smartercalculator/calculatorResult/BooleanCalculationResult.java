package lab8.Task1.smartercalculator.calculatorResult;

import lab8.Task1.smartercalculator.CalculationRequest;

public class BooleanCalculationResult extends AbstractCalculationResult {
    public BooleanCalculationResult(CalculationRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() {
        CalculationRequest request = getRequest();
        Boolean leftOperand = (Boolean) request.getLeftOperand();
        Boolean rightOperand = (Boolean) request.getRightOperand();

        return switch (request.getOperation()) {
            case "&&" -> leftOperand && rightOperand;
            case "||" -> leftOperand || rightOperand;
            default -> throw new IllegalArgumentException();
        };
    }
}
