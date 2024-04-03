package lab4.task6;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final String fullName;

    // Acest dicționar conține informații cu privire la notele
    // pe care un student le are la un curs. Intrările sunt de tip
    // numeCurs -> notăCurs
    private final Map<String, Double> courseInformation;

    public Student(String fullName) {
        this.fullName = fullName;
        this.courseInformation = new HashMap<>();
    }

    public void addCourseInformation(String courseName, double grade) {
        courseInformation.put(courseName, grade);
    }

    public String getFullName() {
        return fullName;
    }

    public Map<String, Double> getCourseInformation() {
        return new HashMap<>(courseInformation);
    }
}