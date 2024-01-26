package lt.ehu.esde;

public class Student {
    private final String name;
    private final short yearOfBirth;

    private final static String FIELDS_SEPARATOR = ";";

    public Student(String input) {
        String[] parts = input.split(FIELDS_SEPARATOR, 2);
        this.name = parts[0];
        this.yearOfBirth = Short.parseShort(parts[1]);
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return this.name + FIELDS_SEPARATOR + this.getYearOfBirth();
    }
}
