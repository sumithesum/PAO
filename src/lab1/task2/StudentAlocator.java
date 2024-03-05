package lab1.task2;

public class StudentAlocator {
    public static Student[] createStudents(int nr) {
        String nume = "Nume ";
        Student[] students = new Student[nr];
        for (int i = 0; i < nr; i++) {
            students[i] = new Student();
            if (i < 10)
                students[i].SetGrade(i);
            else
                students[i].SetGrade(10);
            students[i].SetName(nume + i);
        }
        return students;
    }
}
