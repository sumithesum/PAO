package lab1.task2;

public class Student {
    private String name;

    private double grade;

    void SetName(String name) {
        this.name = name;
    }

    void SetGrade(double grade) {
        this.grade = grade;
    }

    String GetName() {
        return this.name;
    }

    @Override
    public String toString() {
        return GetName() + " " + GetGrade();
    }

    double GetGrade() {
        return this.grade;
    }

}
