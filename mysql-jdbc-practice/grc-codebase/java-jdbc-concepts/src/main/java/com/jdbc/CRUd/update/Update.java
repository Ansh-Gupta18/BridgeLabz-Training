package com.jdbc.CRUd.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Employee";
    private static final String USER = "root";
    private static final String PASSWORD = "ansh@12345";

    // Method to establish connection
    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Method to update employee id
    public static void updateEmployeeId(int employee_id, int newEmployee_id) {

        String sql = "UPDATE employee SET employee_id = ? WHERE employee_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, newEmployee_id);   // New ID
            pstmt.setInt(2, employee_id);      // Old ID

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee ID updated successfully!");
            } else {
                System.out.println("Employee not found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        updateEmployeeId(2, 6);
    }
}