import java.time.LocalDate;
import java.time.Period;

/* TODO */
class Person {
    Position position;
    private final String name;
    private final LocalDate birthDate;

    Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    int getAge() {
        Period period = Period.between(birthDate, LocalDate.now());
        return period.getYears();
    }

    Position getPosition() {
        return position;
    }

    void setPosition(String title, double salary) {
        Person.Position position1 = this.new Position(title, salary);
        this.position = position1;
    }

    @Override
    public String toString() {
        return name + ", " + getAge() + ", " + this.position;
    }

    private class Position {
        protected String name;
        protected double salary;

        Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + ":" + salary;
        }
    }
}