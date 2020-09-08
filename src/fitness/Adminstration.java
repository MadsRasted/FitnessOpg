package fitness;

public class Adminstration extends Employee{

    //Attributes
    int hours = 37;
    int salary = 33000;
    int vacation = 5;

    //Constructor
    public Adminstration() {
    }

    public Adminstration(String name, int cpr, int hours, int salary, int vacation){
        super(name, cpr, hours, salary, vacation);
    }

    //Methods
    public Employee createAdmin(String name, int cpr){
        Employee admin = new Adminstration(name, cpr, hours, salary, vacation);
        return admin;
    }
}
