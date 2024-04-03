package lab4.task6;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class RawDataStudentDeserializer implements StudentDeserializer {

    @Override
    public Student deserialize(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String fullName = dataInputStream.readUTF();
        int courseInformationSize = dataInputStream.readInt();
        Map<String, Double> courseInformation = new HashMap<>();
        for (int i = 0; i < courseInformationSize; i++) {
            String courseName = dataInputStream.readUTF();
            double grade = dataInputStream.readDouble();
            courseInformation.put(courseName, grade);
        }
        return new Student(fullName);
    }
}

