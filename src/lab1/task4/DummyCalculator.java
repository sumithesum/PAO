package lab1.task4;

import java.util.Objects;

public class DummyCalculator {
    public void calculate(String[] args) {
        if (args.length != 3)
            System.out.printf("Nu is numarul corect de parametri");
        try {

            int v1 = Integer.parseInt(args[0]);
            int v2 = Integer.parseInt(args[2]);
            System.out.printf(Integer.toString(op(v1, v2, args[1])));

        } catch (NumberFormatException e) {
            try {
                double v1 = Double.parseDouble(args[0]);
                double v2 = Double.parseDouble(args[2]);
                System.out.printf(Double.toString(op(v1, v2, args[1])));

            } catch (NumberFormatException e2) {
                boolean v1 = Boolean.parseBoolean(args[0]);
                boolean v2 = Boolean.parseBoolean(args[2]);
                System.out.printf(Boolean.toString(op(v1, v2, args[1])));
            }
        }

    }

    private int op(int v1, int v2, String operant) {
        if (Objects.equals(operant, "+"))
            return v1 + v2;
        else if (Objects.equals(operant, "-"))
            return v1 - v2;
        else if (Objects.equals(operant, "/"))
            return v1 / v2;
        else if (Objects.equals(operant, "*"))
            return v1 * v2;
        else
            return v1 % v2;

    }

    private double op(double v1, double v2, String operant) {
        if (Objects.equals(operant, "+"))
            return v1 + v2;
        else if (Objects.equals(operant, "-"))
            return v1 - v2;
        else if (Objects.equals(operant, "/"))
            return v1 / v2;
        else if (Objects.equals(operant, "*"))
            return v1 * v2;
        else
            return v1 % v2;

    }

    private boolean op(boolean v1, boolean v2, String operant) {
        if (Objects.equals(operant, "&&"))
            return v1 && v2;
        return v1 | v2;
    }
}
