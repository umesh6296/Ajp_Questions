package AdvanceLevelQuestions;

import java.sql.*;

import java.util.Scanner;


public class CrudOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperationPerform obj = new OperationPerform();
        boolean flag = true;

        while (flag) {
            System.out.println("\n1. Add a Student");
            System.out.println("2. Update a Student");
            System.out.println("3. Delete a Student");
            System.out.println("4. Get All Students Detail");
            System.out.println("5. Get Student detail by roll number");
            System.out.println("6. Exit.");

            System.out.print("Enter your choice: ");
            int ch;
            try {
                ch = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (ch) {
                case 1:
                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Roll number: ");
                    int roll = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Class: ");
                    String stClass = sc.nextLine();
                    obj.insert(name, roll, stClass);
                    break;

                case 2:
                    System.out.println("Enter student roll number: ");
                    int rollup = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter Student Name: ");
                    String nameup = sc.nextLine();
                    System.out.println("Enter Class: ");
                    String stClassUp = sc.nextLine();
                    obj.update(nameup, rollup, stClassUp);
                    break;

                case 3:
                    System.out.println("Enter Student Roll number: ");
                    int rollDel = Integer.parseInt(sc.nextLine());
                    obj.delStudent(rollDel);
                    break;

                case 4:
                    obj.getData();
                    break;

                case 5:
                    System.out.println("Enter student roll number: ");
                    int rollId = Integer.parseInt(sc.nextLine());
                    obj.getDataById(rollId);
                    break;

                case 6:
                    System.out.println("Exiting.......");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}

class ConnectionDatabase{
    private static final String URL = "jdbc:mysql://localhost:3306/crudDB";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
        return con;
    }
}

class OperationPerform{
    public void insert(String name,int rollNo,String stClass){
        String sql = "INSERT INTO Student (name, rollNo,class) VALUES (?, ?,?)";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, rollNo);
            stmt.setString(3, stClass);
            stmt.executeUpdate();
            System.out.println("Data Inserted Successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(String name,int rollNo,String stClass){
        String sql = "update Student set name=?, class=? where rollNo=?";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, stClass);
            stmt.setInt(3, rollNo);
            stmt.executeUpdate();
            System.out.println("Data Updated Successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getData() {
        String sql = "SELECT * FROM Student";
        try (Connection conn = ConnectionDatabase.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            boolean found = false;
            System.out.println("Student Records:");
            while (rs.next()) {
                found = true;
                String name = rs.getString("name");
                int rollNo = rs.getInt("rollNo");
                String stClass = rs.getString("class");
                System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Class: " + stClass);
            }

            if (!found) {
                System.out.println("No student records found in the database.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void getDataById(int rollNo) {
        String sql = "SELECT * FROM Student WHERE rollNo = ?";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, rollNo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String name = rs.getString("name");
                String stClass = rs.getString("class");
                System.out.println("Student Found:");
                System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Class: " + stClass);
            } else {
                System.out.println("No student found with Roll No: " + rollNo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delStudent(int rollNo){
        String sql = "DELETE FROM Student WHERE rollNo = ?";
        try (Connection conn = ConnectionDatabase.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, rollNo);
            stmt.executeUpdate();
            System.out.println("Data Deleted Successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
