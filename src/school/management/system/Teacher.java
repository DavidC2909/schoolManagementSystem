package school.management.system;


//This class is responsible for keeping track of teacher's name, id and salary.
public class Teacher {
    private int id;
    private String name;
    private double salary;


    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
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
    public double getSalary(){
        return salary;
    }

    //set the salary.
    public void setSalary(double salary){
        this.salary=salary;
    }
}
