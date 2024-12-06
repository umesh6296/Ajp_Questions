package Day5Questions;

// Custom Exception: CountryNotValidException
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

// Custom Exception: EmployeeNameInvalidException
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

// Custom Exception: TaxNotEligibleException
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

// TaxCalculator Class
class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        // Validate country
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }

        // Validate employee name
        if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }

        // Tax calculation logic
        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
}

// Main Class: CalculatorSimulator
public class TaxCalculatorMain {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        // Test Cases
        testCase(calculator, "Ron", false, 34000);  // Test Case 1
        testCase(calculator, "Tim", true, 1000);   // Test Case 2
        testCase(calculator, "Jack", true, 55000); // Test Case 3
        testCase(calculator, "", true, 30000);     // Test Case 4
    }

    private static void testCase(TaxCalculator calculator, String empName, boolean isIndian, double empSal) {
        try {
            double tax = calculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + tax);
        } catch (CountryNotValidException e) {
            System.err.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.err.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.err.println("Not eligible for Tax calculation: " + e.getMessage());
        }
    }
}
