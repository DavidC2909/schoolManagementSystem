package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher john = new Teacher(3, "John", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(john);

        Student andrew = new Student(1, "Andrew", 4);
        Student tamara = new Student(2, "Tamara", 10);
        Student gerald = new Student(3, "Gerald", 7);

        List<Student> studentList = new ArrayList<>();
        studentList.add(andrew);
        studentList.add(tamara);
        studentList.add(gerald);

        //cngs stands for "COLEGIUL NATIONAL GHEORGHE SINCAI" as an example.
        School cngs = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan", 900);
        cngs.addTeacher(megan);

        tamara.payFees(5000);
        gerald.payFees(6000);
        System.out.println("CNGS has earned $"+cngs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY-------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println(lizzy.getName()+" has a salary of $"+lizzy.getSalary());
        System.out.println("CNGS has spent for salary to "+lizzy.getName()+" and now has $"+ cngs.getTotalMoneyEarned());

        john.receiveSalary(john.getSalary());
        System.out.println(john.getName()+" has a salary of $"+john.getSalary());
        System.out.println("CNGS has spent for salary to "+john.getName()+" and now has $"+ cngs.getTotalMoneyEarned());

        System.out.println(gerald);

        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);

    }
}
