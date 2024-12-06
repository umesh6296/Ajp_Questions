package Day5Questions;

import java.util.Scanner;

// Student class to hold student details
class Student {
    private String name;
    private int age;

    // Constructor to initialize student details
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10]; // Array to hold 10 student objects

        try {
            // Input student details
            System.out.println("Enter details for 10 students:");
            for (int i = 0; i <= 10; i++) { // Intentionally going out of bounds
                System.out.print("Enter name for student " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter age for student " + (i + 1) + ": ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                students[i] = new Student(name, age);
            }

            // Display student details
            System.out.println("\nStored Student Records:");
            for (Student student : students) {
                if (student != null) {
                    student.display();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle exception when accessing beyond array size
            System.err.println("Exception caught: You tried to access an index outside the array bounds.");
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

