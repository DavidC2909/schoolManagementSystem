package school.management.system;

import java.util.List;

//the school can have many students, many teachers.
//implements teachers and students using  an ArrayList.
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;


    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    //return the list of teachers in the school.
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    //return the list of students in the school.
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds a student to the school.
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }


    //return the total money earned by the school.
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds the total money earned by the school.
     * @param moneyEarned money that is supposed to be added.
     */
    public void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned = totalMoneyEarned+moneyEarned;
    }

    // return the total money spent by the school.
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school - salary given by the school to the teachers.
     * @param moneySpent the money spent by the school.
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent= totalMoneySpent-moneySpent;
    }
}
