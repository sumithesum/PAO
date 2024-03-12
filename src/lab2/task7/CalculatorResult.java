package lab2.task7;

public abstract class CalculatorResult {
    protected CalculatorRequest calculatorRequest;
    public  CalculatorRequest getRequest(){
        return calculatorRequest;
    };

    public abstract Object computeResult();

    protected CalculatorResult(CalculatorRequest calculatorRequest){
        this.calculatorRequest = calculatorRequest;
    } ;
}