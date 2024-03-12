package lab2.task7;

public class CalculatorRequest {
    private Object Leftopperand,rightOpperand;
    private String operation;
     public String getRequestType(){
         if (this.Leftopperand instanceof Boolean && this.rightOpperand instanceof Boolean) {
             return "Boolean";
         } else if (this.Leftopperand instanceof Integer && this.rightOpperand instanceof Integer) {
             return "Integer";
         } else if (this.Leftopperand instanceof Double && this.rightOpperand instanceof Double) {
             return "Double";
         } else
                return "Nu exista tipul de date al operanzilor!";
     }
    public CalculatorRequest(Object leftOperand, Object rightOperand, Object operation){
        this.Leftopperand = leftOperand;
        this.rightOpperand = rightOperand;
        this.operation = operation.toString();
    }
    @Override
    public String toString(){
         return  this.getLeftopperand() + " " + this.getOperation() + " " + this.getRightOpperand();
    }
    public Object getLeftopperand() {
        return Leftopperand;
    }

    public void setLeftopperand(Object leftopperand) {
        Leftopperand = leftopperand;
    }

    public Object getRightOpperand() {
        return rightOpperand;
    }

    public void setRightOpperand(Object rightOpperand) {
        this.rightOpperand = rightOpperand;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
