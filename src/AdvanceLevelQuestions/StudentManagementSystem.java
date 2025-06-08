package AdvanceLevelQuestions;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student Detail");
            System.out.println("2. Show All Student Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudentRecord();
                    break;
                case 2:
                    showDetails();
                    break;
                case 3:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void addStudentRecord() {
        sc.nextLine(); // Clear buffer
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Class: ");
        int stClass = sc.nextInt();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);

        Student student;
        if (gender == 'M') {
            student = new Boys(name, roll, stClass, gender);
        } else if (gender == 'F') {
            student = new Girls(name, roll, stClass, gender);
        } else {
            System.out.println("Invalid gender entered!");
            return;
        }

        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public static void showDetails() {
        if (studentList.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n--- All Student Details ---");
        for (Student s : studentList) {
            s.details();  // polymorphism
        }
    }
}



abstract class Student {
    private String studentName;
    private int rollNo;
    private int stClass;
    private char gender;

    public Student(String studentName, int rollNo, int stClass, char gender) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.stClass = stClass;
        this.gender = gender;
    }

    public abstract void details();

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStClass() {
        return stClass;
    }

    public void setStClass(int stClass) {
        this.stClass = stClass;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
class Boys extends Student {

    public Boys(String studentName, int rollNo, int stClass, char gender) {
        super(studentName, rollNo, stClass, gender);
    }

    @Override
    public void details() {
        System.out.println("👦 Boy - Name: " + getStudentName() +
                ", Class: " + getStClass() +
                ", Roll No: " + getRollNo());
    }
}
class Girls extends Student {

    public Girls(String studentName, int rollNo, int stClass, char gender) {
        super(studentName, rollNo, stClass, gender);
    }

    @Override
    public void details() {
        System.out.println("👧 Girl - Name: " + getStudentName() +
                ", Class: " + getStClass() +
                ", Roll No: " + getRollNo());
    }
}
