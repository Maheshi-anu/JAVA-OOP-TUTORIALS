package Q2;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Name : " + employee.getName());
        System.out.println("Salary : " + employee.getSalary());

        Employee employee1 = new Employee("Anuradha",34567);
        System.out.println("Name : " + employee1.getName());
        System.out.println("Salary : " + employee1.getSalary());

    }
}
