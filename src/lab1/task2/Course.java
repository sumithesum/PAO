package lab1.task2;

import java.util.Arrays;

public class Course {
    private String name;
    private double minimunGrade;
    private Student[] students;


    public Course (String name,double minimunGrade , Student[] students){
        SetName(name);
        SetMinimunGrade(minimunGrade);
        SetStudents(students);
    }
     Student[] GetStudents() {
        return students;
    }

    void SetStudents(Student[] s1) {
        this.students = s1;
    }


    void SetName(String name) {
        this.name = name;
    }

    void SetMinimunGrade(double grade) {
        this.minimunGrade = grade;
    }

    String GetName() {
        return this.name;
    }

    double GetMinimunGrade() {
        return this.minimunGrade;
    }

    public Student chooseStudentRandomly() {
        int randomIndex = (int) (Math.random() * students.length);
        return students[randomIndex];
    }

    public Student[] showAllPassingStudents() {
        Student passingStudents[] = new Student[students.length];
        int passingStudentsCount = 0;
        for (int i = 0; i < students.length; i++)
            if (students[i].GetGrade() >= minimunGrade) {
                passingStudents[passingStudentsCount] = students[i];
                passingStudentsCount++;
            }

        return passingStudents;
    }

    public boolean isStudentPassing(Student s) {
        return s.GetGrade() >= minimunGrade;
    }

    public boolean isStudentPassing(int poz) {
        return students[poz].GetGrade() >= minimunGrade;
    }
    @Override
    public String toString() {
        return "The course : " +  GetName() + "\n" + "Minimum Grade: " + GetMinimunGrade() + "\n" + "Students : " + Arrays.toString(GetStudents());
    }

}
