package com.jdbc.CRUd.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Employee";
    private static final String USER = "root";
    private static final String PASSWORD = "ansh@12345";

    // Method to establish connection
    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Class not found");
        }

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    // Method to get all employee details
    public static void getAllEmployee() {
        String sql = "SELECT * FROM employee";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Employee_Id\tFirstName\tLastName\tSalary");
            System.out.println("------------------------------------------------");

            while (rs.next()) {
                int employee_id = rs.getInt("employee_id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("Lastname");
                double employee_salary = rs.getDouble("employee_salary");

                System.out.printf("%d\t\t%s\t\t%s\t\t%.2f\n",
                        employee_id, firstname, lastname, employee_salary);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Select employee by ID
    public static void getEmployeeById(int employee_id) {
        String sql = "SELECT * FROM employee WHERE employee_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, employee_id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("Employee Found:");
                System.out.println("Employee_Id: " + rs.getInt("employee_id"));
                System.out.println("FirstName: " + rs.getString("firstname"));
                System.out.println("LastName: " + rs.getString("Lastname"));
                System.out.println("Employee_Salary: " + rs.getDouble("employee_salary"));
            } else {
                System.out.println("Employee not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        getAllEmployee();
        System.out.println();
        getEmployeeById(1);
    }
}