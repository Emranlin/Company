import java.time.LocalDate;

public class Instructor extends Person{
    public double salary;

    public Instructor(Long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    @Override
    public double period(Group group) {
       LocalDate localDate = LocalDate.now();
       LocalDate result = group.getDateOfFinish().minusYears(group.getDateOfStart().getYear()).
               minusMonths(group.getDateOfStart().getMonthValue()).minusDays(group.getDateOfStart().getDayOfMonth());
        return result.getMonthValue()*salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                '}';
    }
}
