package lab2.task7;

import lab1.task4.DummyCalculator;

import java.util.ArrayList;
import java.util.List;

public class SmarterCalculator {
    public static List<CalculatorResult> calculate(String[] args) {
        List<CalculatorResult> rezultate = new ArrayList<>();
        List<CalculatorRequest> cereri = InputConverter.mapRequests(args);

        for (CalculatorRequest cerere : cereri) {
            switch (cerere.getRequestType()) {
                case "Boolean":
                    rezultate.add(new BooleanCalculatorResult(cerere));
                    break;
                case "Integer":
                    rezultate.add(new IntegerCalculatorResult(cerere));
                    break;
                case "Double":
                    rezultate.add(new DoubleCalculatorResult(cerere));
                    break;
                default:
                    break;
            }
        }

        return rezultate;
    }
}
