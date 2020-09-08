package fitness;

public class Instructor extends Employee {

    //Attributes
    private int vacation = 0;
    int salary = 199;

    //Constructors
    public Instructor(){
    }

    public Instructor(String name, int cpr, int hours, int salary, int vacation){
        super(name, cpr, hours, salary, vacation);
    }

    //Method
    public Employee createInstructor(String name, int cpr, int hours){
        int insSalary = (salary * hours);
        Employee instruct = new Instructor(name, cpr, hours, insSalary, vacation);
        return instruct;
    }



}
