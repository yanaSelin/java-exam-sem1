package lt.ehu.esde;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Group {
    private final List<Student> students;

    public Group(List<String> studentData) {
        this.students = new ArrayList<>();
        for (String student : studentData) {
            this.addStudent(new Student(student));
        }
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getByFilter(Predicate<Student> filter) {
        return this.students.stream().filter(filter).toList();
    }
}
