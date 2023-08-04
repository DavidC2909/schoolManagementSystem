package school.management.system;


// This class is responsible for keeping track of students (names, grades, fees).
public class Student {

    private int id;
    private String name;
    private double grade;
    private int feesPaid;
    private int feesTotal;

    //The role of the constructor is to create a new object(student) by initializing.

    /**
     *
     * Fees for every student is going to be $30,000.
     * Fees paid initially is $0.
     * @param id for the student: unique.
     * @param name
     * @param grade
     */
    public Student(int id, String name, double grade){
        feesPaid=0;
        feesTotal=30000;

        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter student's names, student's id.

    /**
     * Used to update the student's grade.
     * @param grade is the new grade of the student.
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void updateFeesPaid(int fees){
        feesPaid=feesPaid+fees;
    }


    //return id of the student.
    public int getId() {
        return id;
    }

    //return name of the student.
    public String getName() {
        return name;
    }

    //return grade of the student.
    public double getGrade() {
        return grade;
    }

    //return fees paid by the student.
    public int getFeesPaid() {
        return feesPaid;
    }

    //return total fees of the student.
    public int getFeesTotal() {
        return feesTotal;
    }


}
