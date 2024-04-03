package lab5.task2;

import java.util.*;

public class MultiMapValue<K, V> {
    private Map<K, List<V>> map = new HashMap<K, List<V>>();
    public void add (K key, V value) {
        List<V> list = map.get(key);
        if (list == null) {
            list = new LinkedList<V>();
            map.put(key, list);
        }
        list.add(value);
    }
    void addAll(K key, List<V> values) {
        List<V> list = map.get(key);
        if (list == null) {
            list = new LinkedList<V>();
            map.put(key, list);
        }
        list.addAll(values);
    }
    void addAll(MultiMapValue<K, V> map) {
        for (K key : map.map.keySet()) {
            List<V> list = map.map.get(key);
            this.addAll(key, list);
        }
    }
    V getFirst(K key) {
        List<V> list = map.get(key);
        if (list == null) {
            return null;
        }
        return list.getFirst();
    }

    List<V> getValues(K key) {
        return map.get(key);
    }
    boolean containsKey(K key) {
        return map.containsKey(key);
    }
    boolean isEmpty() {
        return map.isEmpty();
    }
    List<V> remove(K key) {
        return map.remove(key);
    }
    int size() {
        return map.size();
    }

}

enum UniversityCode {
    POLITEHNICA_BUCHAREST
}

class Student {

    private final String fistName;
    private final String lastName;
    private final Integer age;
    private final Float grade;
    private final UUID teacherId;

    public Student(String fistName, String lastName, Integer age, Float grade, UUID teacherId) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fistName, student.fistName) && Objects.equals(lastName, student.lastName) && Objects.equals(age, student.age) && Objects.equals(grade, student.grade) && Objects.equals(teacherId, student.teacherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, age, grade, teacherId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

class Teacher {

    private static final UniversityCode UNIVERSITY_CODE = UniversityCode.POLITEHNICA_BUCHAREST;
    private final String fistName;
    private final String lastName;
    private final List<String> subjects;
    private final UUID teacherId;

    public Teacher(String fistName, String lastName, List<String> subjects, UUID teacherId) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.subjects = subjects;
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(fistName, teacher.fistName) && Objects.equals(lastName, teacher.lastName) && Objects.equals(subjects, teacher.subjects) && Objects.equals(teacherId, teacher.teacherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, subjects, teacherId);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
