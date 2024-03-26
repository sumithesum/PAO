package lab4.task2.calculatorResult;

import lab4.task2.CalculationRequest;
import lab4.task2.InvalidOperationException;

public class DoubleCalculationResult extends CalculationResult {
    public DoubleCalculationResult(CalculationRequest request) {
        super(request);
    }

    @Override
    public Object computeResult() throws InvalidOperationException {
        CalculationRequest request = getRequest();
        Double leftOperand = (Double) request.getLeftOperand();
        Double rightOperand = (Double) request.getRightOperand();

        switch (request.getOperation()) {
            case "+":
                return leftOperand + rightOperand;
            case "-":
                return leftOperand - rightOperand;
            case "*":
                return leftOperand * rightOperand;
            case "/":
                if (rightOperand == 0) {
                    throw new InvalidOperationException("Division by zero");
                }
                return leftOperand / rightOperand;
            default:
                throw new InvalidOperationException("Invalid operation for Double operands: " + request.getOperation());
        }
    }
}
