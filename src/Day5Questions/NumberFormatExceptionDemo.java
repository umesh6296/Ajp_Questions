package Day5Questions;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input: User enters a number as a string
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            // Attempt to convert the input to an integer
            int number = Integer.parseInt(input);

            // Display the converted number
            System.out.println("The entered number is: " + number);

        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.err.println("Exception caught: Invalid number format. Please enter a valid integer.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

