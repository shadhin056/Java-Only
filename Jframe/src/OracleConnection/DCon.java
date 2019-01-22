package OracleConnection;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class DCon {
	Connection conn;
	static String user="lab";
	static String pass="cse301";
	
	
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
	
	public static Connection getConnection(){
		Connection conn=null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost",user, pass);	
			System.out.println("Database Connection Successful");
		} catch (SQLException e) {
			System.err.println("Database Connection Failed!");
			e.printStackTrace();
		}
		return conn;
	}
}
