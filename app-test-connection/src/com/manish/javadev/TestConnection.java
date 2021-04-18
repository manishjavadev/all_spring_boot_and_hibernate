package com.manish.javadev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnection {
	public static void main(String[] args) throws InterruptedException {
		String username = "root";
		String password = "manish";
		String url = "jdbc:mysql://localhost:3306/hibernatedb";
		

		Connection connection = null;
		try {

			Properties properties = new Properties();

			connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection.isClosed());
			System.out.println(connection.isValid(300));
			connection.close();
			System.out.println(connection.isValid(300));
			if (connection == null || !connection.isValid(300)) {
				System.out.println("connection == null || !connection.isValid(300) !connection.isValid(300)");
				connection = DriverManager.getConnection(url, username, password);
				System.out.println("System.out.println(connection.isClosed()); 29 "+connection.isClosed());
			}
			System.out.println(connection.isClosed());
			System.out.println(connection.isValid(300));
			System.out.println("Done");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
