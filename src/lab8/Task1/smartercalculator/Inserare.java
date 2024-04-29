package lab8.Task1.smartercalculator;

import lab8.Task1.smartercalculator.calculatorResult.CalculationResult;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserare {
    private static final String URL = "jdbc:mysql://localhost:3306/laborator";
    private static final String USER = "root";
    private static final String PASSWORD = "password";  // replace with your MySQL password

    public void storeResult(CalculationResult result) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO smarterCalculatorResults(operation_type, left_operand, right_operand, operation, result) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, result.getRequest().getOperationType());
            statement.setString(2, result.getRequest().getLeftOperand().toString());
            statement.setString(3, result.getRequest().getRightOperand().toString());
            statement.setString(4, result.getRequest().getOperation());
            statement.setString(5, result.computeResult().toString());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
