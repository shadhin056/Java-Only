package Assignment;
import java.sql.*;
import javax.swing.JOptionPane;
public class TwO{

	public static void main(String[] args) {
		// Driver Registration
		String query="";
		DriverRegistration();
		//Creating a database connection
		Connection connection = CreateConnection();
		if (connection != null) {
			JOptionPane.showMessageDialog(null, "Database Connected");
		} else {
			JOptionPane.showMessageDialog(null, "Database Connection Failed!");
			return;
		}
		// Query Input Dialog
		while(true){
			query = InputDialog();
			
			String Result = "";
			if ((query != null) && (query.length() > 0)) {
				// Executing a SQL Statement 
				ExecuteStatement(connection, query);
			}
			else{
				 JOptionPane.showMessageDialog(null, "You entered nothing. Good Bye");
				// Closing Database Connection
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 return;
			}
		}
	}
	
	public static void DriverRegistration(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
		}
		JOptionPane.showMessageDialog(null, "Oracle JDBC Driver Registered!");
	}
	
	public static Connection CreateConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "lab", "cse301");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static String InputDialog(){
		
		String s = (String)JOptionPane.showInputDialog(
                null,
                "Enter a query: \n",
                "Query Input Dialog",
                JOptionPane.PLAIN_MESSAGE);
		return s;
	}
	
	public static void ExecuteStatement(Connection conn, String s){
		String Result="";
		try {
			Statement stmt = conn.createStatement() ;
			ResultSet rs = stmt.executeQuery(s);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			for(int i=1; i<=columnsNumber; i++){
				Result += rsmd.getColumnName(i) + " | ";
			}
			Result += "\n";
			while(rs.next()){
				for(int i=1; i<=columnsNumber; i++){
					//System.out.print(rs.getString(i) + " ");
					Result += rs.getString(i) + " | ";
				}
				Result += "\n";
			}
			JOptionPane.showMessageDialog(null, Result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Error in SQL");
			e.printStackTrace();
		}
	}
}
