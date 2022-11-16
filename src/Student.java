import java.time.LocalDate;
import java.time.Month;

public class Student extends Person{
   public double contract;

   public Student(Long id, String fullName, int age, char gender, double contract) {
      super(id, fullName, age, gender);
      this.contract = contract;
   }

   @Override
   public double period(Group group) {
      LocalDate localDate = LocalDate.now();
      LocalDate result = group.getDateOfFinish().minusYears(group.getDateOfStart().getYear()).
              minusMonths(group.getDateOfStart().getMonthValue()).minusDays(group.getDateOfStart().getDayOfMonth());
      return result.getMonthValue()*contract;
      }

   public double getContract() {
      return contract;
   }

   public void setContract(double contract) {
      this.contract = contract;
   }

   @Override
   public String toString() {
      return "Student{" +
              "contract=" + contract +
              '}';
   }
}
