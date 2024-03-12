package lab2.task7;

public class BooleanCalculatorResult extends CalculatorResult {
    public BooleanCalculatorResult(CalculatorRequest calculatorRequest) {
        super(calculatorRequest);
    }

    @Override
    public Object computeResult() {
        boolean l = (Boolean) calculatorRequest.getLeftopperand();
        boolean r = (Boolean) calculatorRequest.getRightOpperand();
        if (calculatorRequest.getOperation().equals("&&"))
            return l && r;
        else if (calculatorRequest.getOperation().equals("||"))
            return l || r;
        else
            return null;
    }
}
