package school.management.system;


//This class is responsible for keeping track of teacher's name, id and salary.
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;



    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    //return the id of the teacher.
    public int getId(){
        return id;
    }

    //return the name of the teacher.
    public String getName(){
        return this.name;
    }

    //return salary of the teacher.
    public int getSalary(){
        return salary;
    }

    //set the salary.
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * adds to the salary.
     * removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: "+name+"."
                +" Total salary earned so far $"
                +salaryEarned;
    }
}
