package com.jdbc.CRUd.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Delete {

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/Employee"; // database url
	private static final String USER = "root"; // database username
	private static final String PASSWORD = "ansh@12345"; // database password

	// Method to establish connection
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");

		}

		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connection establish successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

	// Method to delete student by student id
	public static void deleteEmployee(int employee_id) {
		String sql = "DELETE FROM employee WHERE employee_id = ?";

		try (Connection conn = getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, employee_id);

			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Student deleted successfully!");
			} else {
				System.out.println("Student not found!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Delete with confirmation
	public static boolean deleteEmployeeSafe(int employee_id) {
		// First check if student exists
		String checkSql = "SELECT COUNT(*) FROM employee WHERE employee_id = ?";
		String deleteSql = "DELETE FROM employee WHERE employee_id = ?";

		try (Connection conn = getConnection()) {
			// Check existence
			try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
				checkStmt.setInt(1, employee_id);
				ResultSet rs = checkStmt.executeQuery();
				rs.next();
				if (rs.getInt(1) == 0) {
					System.out.println("Student not found!");
					return false;
				}
			}
			// Delete
			try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
				deleteStmt.setInt(1, employee_id);
				deleteStmt.executeUpdate();
				System.out.println("Student deleted successfully!");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
		deleteEmployeeSafe(1);
	}

}
