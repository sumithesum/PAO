package lab7.task1;

import java.io.*;

public class Metoda2 {
    public static  void main(String[] args) throws IOException {
        String filePath = "src/lab7/task1/in";
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] data = new byte[fis.available()];
            fis.read(data);
            String str = new String(data);

            String[] lines = str.split("\n");


            if (lines.length > 1) {
                System.out.println(lines[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
