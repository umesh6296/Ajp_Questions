package Day4Question;

// Abstract class Vaccine
abstract class Vaccine {
    int age;
    String nationality;

    // Constructor to initialize age and nationality
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equals("Indian") && age >= 18) {
            System.out.println("First dose is administered. You have to pay 250 Rs.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose() {
        if (age >= 18) {
            System.out.println("You are eligible for the second dose.");
        } else {
            System.out.println("You are not eligible for the second dose.");
        }
    }

    // Abstract method for booster dose
    abstract void boosterDose();
}

// Concrete subclass implementing the abstract method
class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("Booster dose is successfully administered.");
    }
}

// Main class for execution
public class Vaccination {
    public static void main(String[] args) {
        // Scenario 1: First Dose
        VaccinationSuccessful vaccine1 = new VaccinationSuccessful(25, "Indian");
        vaccine1.firstDose();

        // Scenario 2: Second Dose
        vaccine1.secondDose();

        // Scenario 3: Booster Dose
        vaccine1.boosterDose();
    }
}
