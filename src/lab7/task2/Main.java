package lab7.task2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String filePath = "src/lab7/task1/in";
        try (
                BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            reader.readLine();


            String secondLine = reader.readLine();
            System.out.println(secondLine);
        }
    }
}
