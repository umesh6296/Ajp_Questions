package Day3Question.AnnualSalary;

class Employee extends User{
    double salary;

    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}
class User {
    int id;
    String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "John Doe", 5000.0);

        // Calculate and display the annual salary
        double annualSalary = emp.calculateAnnualSalary();
        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.id);
        System.out.println("Name: " + emp.name);
        System.out.println("Monthly Salary: " + emp.salary);
        System.out.println("Annual Salary: " + annualSalary);
    }
}
