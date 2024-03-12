package lab2.task7;

public class IntegerCalculatorResult extends CalculatorResult{
    public IntegerCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Integer computeResult() {
        int l = (int) calculatorRequest.getLeftopperand();
        int r = (int) calculatorRequest.getRightOpperand();
        if (calculatorRequest.getOperation().equals("+"))
            return l + r;
        else if (calculatorRequest.getOperation().equals("-"))
            return l - r;
        else if (calculatorRequest.getOperation().equals("*"))
            return l * r;
        else if (calculatorRequest.getOperation().equals("/"))
            return l / r;
        else
            return null;
    }
}
