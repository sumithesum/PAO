package lab7.task1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Metoda1 {
    public static void main(String[] args) throws Exception {
        String filePath = "src/lab7/task1/in";
        try (Scanner scanner = new Scanner(new FileInputStream(filePath))) {


            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }


            if (scanner.hasNextLine()) {
                String secondLine = scanner.nextLine();
                System.out.println(secondLine);
            }
        }
    }
}