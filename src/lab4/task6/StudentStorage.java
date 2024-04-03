package lab4.task6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentStorage {
    private final StudentSerializer serializer;
    private final StudentDeserializer deserializer;

    public StudentStorage(StudentSerializer serializer, StudentDeserializer deserializer) {
        this.serializer = serializer;
        this.deserializer = deserializer;
    }

    public List<Student> readAllStudents(InputStream inputStream) throws IOException {
        List<Student> students = new ArrayList<>();
        try (DataInputStream dataInputStream = new DataInputStream(inputStream)) {
            while (dataInputStream.available() > 0) {
                Student student = deserializer.deserialize(dataInputStream);
                students.add(student);
            }
        }
        return students;
    }

    public void writeAllStudents(OutputStream outputStream, List<Student> students) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(outputStream)) {
            for (Student student : students) {
                serializer.serialize(dataOutputStream, student);
            }
        }
    }
}
