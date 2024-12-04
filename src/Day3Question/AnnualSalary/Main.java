package Day3Question.AnnualSalary;

public class Main {
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
