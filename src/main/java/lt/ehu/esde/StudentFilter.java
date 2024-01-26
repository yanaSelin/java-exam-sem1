package lt.ehu.esde;

import java.util.function.Predicate;

public class StudentFilter {
    public static Predicate<Student> byMinYearOfBirth(int minYearOfBirth) {
        return (student) -> student.getYearOfBirth() > minYearOfBirth;
    }
}
