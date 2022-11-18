package Q2;

public class Employee {
    private String name;
    private double salary;

    public Employee(){
        name = "Maheshi";
        salary = 1000000;
    }
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}
