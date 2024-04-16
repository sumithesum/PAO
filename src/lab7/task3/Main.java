package lab7.task3;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String fileName = "src/lab7/task3/fisier_" + i + ".txt";
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("Index: " + i + ", Time: " + LocalDateTime.now());
            } catch (IOException e) {
                System.out.println("Error to file: " + fileName);
            }
        }
    }
}