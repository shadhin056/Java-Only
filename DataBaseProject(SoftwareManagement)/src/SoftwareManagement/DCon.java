package SoftwareManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class DCon {
	Connection conn;
	String user="system";
	String pass="12345";
	
	
	public DCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle JDBC Driver Registered!");
		} catch (ClassNotFoundException e) {
			System.err.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
	}
	
	public Connection getConnection(){
		Connection conn=null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost",
					user, pass);	
			System.out.println("Database Connection Successful");
		} catch (SQLException e) {
			System.err.println("Database Connection Failed!");
			e.printStackTrace();
		}
		return conn;
	}
}
