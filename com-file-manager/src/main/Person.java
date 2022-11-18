import java.util.Objects;

public class Person {
    private int number;
    private String fIO;

    public Person(String fIO) {
        this.fIO = fIO;
    }

    public Person(int number, String fIO) {
        this.fIO = fIO;
        this.number = number;
    }

    public String getfIO() {
        return fIO;
    }

    public void setfIO(String fIO) {
        this.fIO = fIO;
    }

    public int getSalary() {
        return number;
    }

    public void setSalary(int salary) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return number == person.number && Objects.equals(fIO, person.fIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, fIO);
    }

    @Override
    public String toString() {
        return number + " " + fIO;
    }
}
