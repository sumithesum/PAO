package lab2.task7;

public class DoubleCalculatorResult extends CalculatorResult{
    protected DoubleCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }


    @Override
    public Object computeResult() {
        double l = (double) calculatorRequest.getLeftopperand();
        double r = (double) calculatorRequest.getRightOpperand();
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
