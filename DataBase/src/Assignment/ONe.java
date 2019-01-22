package Assignment;

import java.sql.*;
 
public class ONe {
 
	public static void main(String[] argv) {
		System.out.println("-------- Oracle JDBC Connection Testing ------");
		// JDBC Driver Registration
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		System.out.println("Oracle JDBC Driver Registered!");
		//Creating a database connection
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "lab", "cse301");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		// Executing a SQL Statement 
		try {
			Statement stmt = connection.createStatement() ;
			ResultSet rs = stmt.executeQuery("SELECT * from branch");
			while(rs.next()){
				System.out.print(rs.getString("account_number")+ "   "
						+ "");
				System.out.print(rs.getString("branch_name") + "   ");
				System.out.print(rs.getDouble("balance") );
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in SQL.");
			e.printStackTrace();
		}
		// Closing a connection
		try {
			System.out.println("Closing Database Connection.");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
}