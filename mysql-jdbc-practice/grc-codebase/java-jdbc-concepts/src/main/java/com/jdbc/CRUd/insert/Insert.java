package com.jdbc.CRUd.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert{

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/Employee"; // Database url
	private static final String USER = "root"; // Database username
	private static final String PASSWORD = "ansh@12345"; // Database password

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

	// Method to insert student in database table
	public static void insertEmployee(String firstname, String Lastname, int employee_id, double employee_salary) {

		String sql = "INSERT INTO employee(firstname ,Lastname,employee_id,employee_salary)VALUES(?,?,?,?)";
		try {
			Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, firstname);
			statement.setString(2, Lastname);
			statement.setInt(3, employee_id);
			statement.setDouble(4, employee_salary);

			int rowsAffected = statement.executeUpdate();
			System.out.println(rowsAffected + " rows inserted succefully");

		} catch (SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// Main method
	public static void main(String[] args) {
		insertEmployee("Ansh","Gupta",2, 1222);
		insertEmployee("karan","nagesh",3, 122255);
		insertEmployee("Arif","iqubal",4, 122283248);
	}
}