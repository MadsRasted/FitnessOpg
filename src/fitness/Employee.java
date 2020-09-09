package fitness;

public class Employee {

    //Attributes
    private String name;
    private int cpr;
    private int hours;
    private int salary;
    private int vacation;

    //Constructors
    public Employee(){
    }

    public Employee(String name, int cpr, int hours, int salary, int vacation) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
        this.salary = salary;
        this.vacation = vacation;
    }

    //Methods
    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s%-10s", name, cpr, hours, salary, vacation);
    }

    public Employee printEmployee(Employee employee){
        return employee; }
}
