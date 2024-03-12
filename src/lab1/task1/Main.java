package lab1.task1;

import lab1.task2.Course;
import lab1.task2.Student;
import lab1.task2.StudentAlocator;
import lab1.task4.DummyCalculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/*
        Student[] students = StudentAlocator.createStudents(100);
        System.out.println(Arrays.toString(students));


        Course math = new Course("Algebra",5,students);
        System.out.println(math);
        System.out.println(math.chooseStudentRandomly());
        Student[] trecuti = math.showAllPassingStudents();
        System.out.println(Arrays.toString(trecuti));
        System.out.println(math.isStudentPassing(10));
        System.out.println(math.isStudentPassing(math.chooseStudentRandomly()));
  */
        new DummyCalculator().calculate(args);
        }
    }
