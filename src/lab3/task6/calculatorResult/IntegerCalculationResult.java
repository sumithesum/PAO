package lab3.task6.calculatorResult;

import lab3.task6.CalculationRequest;

public final class IntegerCalculationResult extends CalculationResult {
    public IntegerCalculationResult(CalculationRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() {
        CalculationRequest request = getRequest();
        Integer leftOperand = (Integer) request.getLeftOperand();
        Integer rightOperand = (Integer) request.getRightOperand();

        return switch (request.getOperation()) {
            case "+" -> leftOperand + rightOperand;
            case "-" -> leftOperand - rightOperand;
            case "*" -> leftOperand * rightOperand;
            case "/" -> leftOperand / rightOperand;
            default -> throw new IllegalArgumentException();
        };
    }
}