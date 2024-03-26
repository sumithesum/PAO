package lab4;

import lab4.task1.JustMyFirstException;
import lab4.task3.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void bar() {
        try {
            throw new ClassCastException();
        } catch (RuntimeException e) {
            if (false)
                System.out.println("fail");
            else
                System.out.println("Success");
        }
    }

    public static void foo() {
        try {
            System.out.println("1");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("2");
        }

        System.out.println("3");
    }


    public static void main(String[] args) {

        bar();
        foo();
        try {
            throw new JustMyFirstException();
        } catch (JustMyFirstException e) {
            System.out.println("Caught JustMyFirstException: " + e.getMessage());
        }

        Map<String, Double> courseInfo = new HashMap<>();
        courseInfo.put("Mate", 8.5);
        courseInfo.put("Engleza", 9.0);

        Student student1 = new Student("Andrei Mocanu", courseInfo);
        System.out.println( student1);


        Student clonedStudent = student1.clone();
        System.out.println( clonedStudent);


        student1.getCourseInformation().put("Mate", 9.0);


        System.out.println( student1);
        System.out.println(clonedStudent);


    }
}