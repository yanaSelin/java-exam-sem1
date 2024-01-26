package lt.ehu.esde;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static List<String> getStudentData() {
        Scanner reader = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        System.out.println("Please, enter list of students, separated by new line in following format: name;year of birth");
        System.out.println("To finish input enter empty line");

        while (reader.hasNextLine()) {
            String line = reader.nextLine().trim();
            if(line.isEmpty()){
                break;
            }

            lines.add(line);
        }

        return lines;
    }

    public static short getMinYear() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please, enter minimum year of birth for filtering.");

        while (!reader.hasNextShort()) {
            System.out.println("Please, enter valid year in numeric format");
        }

        return reader.nextShort();
    }

    public static void main(String[] args) {
        List<String> studentData = getStudentData();
        Group group = new Group(studentData);
        short minYear = getMinYear();
        List<Student> filteredStudents = group.getByFilter(StudentFilter.byMinYearOfBirth(minYear));

        System.out.println(filteredStudents);
    }
}
