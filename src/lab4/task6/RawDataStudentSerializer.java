package lab4.task6;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class RawDataStudentSerializer implements StudentSerializer {

    @Override
    public void serialize(OutputStream outputStream, Student student) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(student.getFullName());
        dataOutputStream.writeInt(student.getCourseInformation().size());
        for (Map.Entry<String, Double> entry : student.getCourseInformation().entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            dataOutputStream.writeDouble(entry.getValue());
        }
        dataOutputStream.flush();
    }
}