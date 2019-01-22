package Sqlite;
import java.sql.*;
import javax.swing.*;
public class ConnecTion {
		Connection conn=null;
	
	public static Connection dbConnection()
		{
			try {	
				Class.forName("org.sqlite.JDBC");
				Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\ONLINE\\Dropbox\\Database\\sqlite\\employee.sqlite");
				JOptionPane.showMessageDialog(null, "YOU GOT Connection");
				return conn;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,e);
				return null;
			}
		}
}
