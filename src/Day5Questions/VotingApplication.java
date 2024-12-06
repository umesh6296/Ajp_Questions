package Day5Questions;

import java.util.Scanner;

// Custom exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input: User's age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check age and throw exception if less than 18
            if (age < 18) {
                throw new InvalidAgeException("You are not eligible to vote. Age must be 18 or above.");
            }

            // Message for eligible voters
            System.out.println("You are eligible to vote! Please proceed.");

        } catch (InvalidAgeException e) {
            // Handle custom exception
            System.err.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Voting application terminated.");
        }
    }
}

