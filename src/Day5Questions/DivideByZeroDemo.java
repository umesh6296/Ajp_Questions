package Day5Questions;

import java.util.Scanner;

public class DivideByZeroDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input: Numerator and Denominator
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Division operation
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle Divide by Zero
            System.err.println("Exception caught: Division by zero is not allowed.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

