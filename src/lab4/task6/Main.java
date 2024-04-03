package lab4.task6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Student> studentsToWrite = new ArrayList<>();
        studentsToWrite.add(new Student("John Doe"));
        studentsToWrite.get(0).addCourseInformation("Math", 9.5);
        studentsToWrite.add(new Student("Jane Smith"));
        studentsToWrite.get(1).addCourseInformation("Physics", 8.0);
        studentsToWrite.get(1).addCourseInformation("Chemistry", 7.5);


        StudentSerializer serializer = new RawDataStudentSerializer();
        StudentDeserializer deserializer = new RawDataStudentDeserializer();


        StudentStorage storage = new StudentStorage(serializer, deserializer);


        try (OutputStream outputStream = new FileOutputStream("students.dat")) {
            storage.writeAllStudents(outputStream, studentsToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Student> studentsRead = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream("students.dat")) {
            studentsRead = storage.readAllStudents(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Students read from file:");
        for (Student student : studentsRead) {
            System.out.println("Student: " + student.getFullName());
            System.out.println("Courses and grades:");
            for (Map.Entry<String, Double> entry : student.getCourseInformation().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
        }
    }
}

