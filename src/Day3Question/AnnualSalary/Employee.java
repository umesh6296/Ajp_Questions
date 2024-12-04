package Day3Question.AnnualSalary;

public class Employee extends User{
    double salary;

    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}
