import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Student student = new Student(1L,"Zhalilova Zhiidegul",29,'F',12000);
     Student student1 = new Student(2L,"Meerim Saskaraeva",39,'F',8000);
     Student student2 = new Student(3L,"Lira kaanatova",38,'F',12000);
     Student student3 = new Student(4L,"Aigerim Bektenova",17,'F',8000);
     Student student4 = new Student(5L,"Ilim Shabdanov",20,'M',12000);
     Student student5 = new Student(6L,"Eliza Ashirbaeva",18,'F',8000);

     Student[] students = {student,student1,student2,student3,student4,student5};
     System.out.println(Arrays.toString(students));

        Instructor instructor = new Instructor(23L,"Aijamal Asangazive",22,'F',50000);
        Instructor instructor1 = new Instructor(24L,"Azamat Orozbaev",25,'M',30000);
        Instructor instructor2 = new Instructor(25L,"Chyngyz Sharshekeev",27,'M',40000);

        Instructor[] instructors = {instructor,instructor1,instructor2};
        System.out.println(Arrays.toString(instructors));

        Mentor mentor = new Mentor(12L,"Rahim Kurbanov",20,'M',550000);
        Mentor mentor1 = new Mentor(13L,"Maksat Akylbek uulu",28,'M',350000);
        Mentor mentor2 = new Mentor(14L,"Muhammed Toichubai uul",22,'M',45000);

        Mentor[] mentors = {mentor,mentor1,mentor2};
        System.out.println(Arrays.toString(mentors));


        LocalDate date = LocalDate.of(2022, 10, 1);
        LocalDate dateOfFinish = LocalDate.of(2023,7,1);


        Group group = new Group("Java-8",students,date,dateOfFinish);
        Group group1 = new Group("Java Script-8",students,date,dateOfFinish);

        Group[] groups = {group,group1};
        System.out.println(Arrays.toString(groups));

        Course course = new Course("Peak soft",groups, instructor, mentors);
        Course course1 = new Course("Peak soft kids",groups, instructor, mentors);
        Person[]persons={student,student1,student2,student3,student4,student5,mentor,mentor1,mentor2,instructor,instructor1,instructor2};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose your selections:1.Salary of Instructor,2.Salary of Mentor,3.Contract of student,4.Sort age,5.Total amount");
        while (true){
            int sell= scanner.nextInt();
            switch (sell){
                case 1:System.out.println(instructor.period(group));
                break;
                case 2:System.out.println(mentor.period(group));
                break;
                case 3:System.out.println(student.period(group));
                break;
                case 4: Person.sortAge(persons);
                break;
                case 5: System.out.println(Company.income(students));
            }
        }







    }

}