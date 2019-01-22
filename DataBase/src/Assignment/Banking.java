package Assignment;
import java.sql.*;
import java.util.Vector;

import javax.swing.*;

import java.awt.*;

public class Banking {

	public static void main(String[] args) {

		Connection connection;
		String query="";
		JOptionPane.showMessageDialog(null, "Welcome to Banking Database");
		DriverRegistration();
		connection = CreateConnection();
		if (connection != null) {
			JOptionPane.showMessageDialog(null, "Database Connection Successful");
		} else {
			JOptionPane.showMessageDialog(null, "Database Connection Failed!");
			return;
		}
		while(true){
			int choice = MainMenu();
			if(choice == 6){
				try {
					connection.close();
					JOptionPane.showMessageDialog(null, "Database Connection Closed. Good Bye!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			else{
				switch(choice){
				case 0: // showing all records
					Integer choice1 = SecondMenu();
					if(choice1 == 6){
						break;
					}
					else{
						if(choice1==0)
							query = "select * from branch";
						else if(choice1==1)
							query = "select * from account";
						else if (choice1==2)
							query = "select * from loan";
						else if (choice1==3)
							query = "select * from customer";
						else if(choice1==4)
							query = "select * from depositor";
						else
							query = "select * from borrower";
						ExecuteSQL(connection, query, choice1); // function executing the query					
					}
					break;
				case 1: // inserting records
					choice1 = SecondMenu();
					if(choice1 == 6){
						break;
					}
					else{
						query = InsertMenu(choice1);
						ExecuteUpdateSQL(connection, query, choice1); // function executing the insert,delete,update query
					}
					break;
				case 2: // updating records
					choice1 = SecondMenu();
					if(choice1 == 6){
						break;
					}
					else{
						query = UpdateMenu(choice1);
						ExecuteUpdateSQL(connection, query, choice1);
					}
					break;
				case 3: // Deleting Records
					choice1 = SecondMenu();
					if(choice1 == 6){
						break;
					}
					else{
						query = DeleteMenu(choice1);
						ExecuteUpdateSQL(connection, query, choice1);
					}
					break;
				case 4: // Searching Records
					choice1 = SecondMenu();
					if(choice1 == 6){
						break;
					}
					else{
						query = SearchMenu(choice1);
						ExecuteSQL(connection, query);
					}
					break;
				case 5: // Entering SQL
					query = QueryMenu();
					ExecuteSQL(connection, query);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Operation");
				}
			}
		}
	} // main ends
	
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
		JTextField user = new JTextField(10);
		JPasswordField password = new JPasswordField(10);
		Object [] message = { "User Name: " , user, "\n", "Password:", password};
		int result = JOptionPane.showConfirmDialog(null, message, "Enter User name and Password",JOptionPane.OK_CANCEL_OPTION);
		if(result==JOptionPane.OK_OPTION){
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", user.getText(), password.getText());
			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static int MainMenu(){ // function creating main dialog
		JComboBox<String> cmb = new JComboBox<String>();
		cmb.addItem("Show Records");
		cmb.addItem("Insert Records");
		cmb.addItem("Update Records");
		cmb.addItem("Delete Records");
		cmb.addItem("Search Records");
		cmb.addItem("Enter SQL");
		cmb.addItem("Exit");
			
		int choice = 0;
		Object [] message = { "Enter your choice",cmb};
		int result = JOptionPane.showConfirmDialog(null, message, "Enter your choice",JOptionPane.OK_CANCEL_OPTION);
		if(result==JOptionPane.OK_OPTION){
			choice = cmb.getSelectedIndex();
		}
		else{
			JOptionPane.showMessageDialog(null, "Select an option");
			MainMenu();
		}
		return choice;
	}
	
	public static Integer SecondMenu(){ //function displaying table names
		JComboBox<String> cmb = new JComboBox<String>();
		cmb.addItem("Branch");
		cmb.addItem("Account");
		cmb.addItem("Loan");
		cmb.addItem("Customer");
		cmb.addItem("Depositor");
		cmb.addItem("Borrower");
		cmb.addItem("Go to Previous Menu");
			
		int choice = 0;
		Object [] message = { "Enter your choice",cmb};
		int result = JOptionPane.showConfirmDialog(null, message, "Enter your choice ",JOptionPane.OK_CANCEL_OPTION);
		if(result==JOptionPane.OK_OPTION){
			choice = cmb.getSelectedIndex();
		}
		else{
			choice=6;
		}
		return choice;
	}
	
	public static String InsertMenu(Integer i){ //function displaying insert dialogs
		String s = "";
		if(i==0){ // for branch
			JTextField bn = new JTextField(20);
			JTextField bc = new JTextField(20);
			JTextField a = new JTextField(20);
			Object [] message = {"Branch Name",bn,"Branch City",bc,"Assets",a};
			int result = JOptionPane.showConfirmDialog(null, message,"Insert Record into Branch",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				s = "insert into branch values ('" + bn.getText() + "','" + bc.getText() + "'," + a.getText() + ")";
				System.out.println(s);
			}
		}
		else if(i==1){ // for account
			JTextField an = new JTextField(20);
			JTextField bn = new JTextField(20);
			JTextField bal = new JTextField(20);
			Object [] message = {"Account Number",an,"Branch Name",bn,"Balance",bal};
			int result = JOptionPane.showConfirmDialog(null, message,"Insert Record into Account",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				s = "insert into account values ('" + an.getText() + "','" + bn.getText()+ "'," + bal.getText() + ")";
				System.out.println(s);
			}
		}
		// do the same thing for other tables as well
		else{
			
		}
		return s;
	}
	
	public static String UpdateMenu(Integer i){ //function displaying update dialog
		String s = "";
		if(i==0){ // for branch
			JComboBox<String> attr = new JComboBox<String>();
			attr.addItem("branch_name");
			attr.addItem("branch_city");
			attr.addItem("assets");
			JTextField value = new JTextField(20);
			JTextField condition = new JTextField(20);
			Object [] message = {"Attribute",attr,"New Value (use ' ' for string)",value,"Where (write complete expression)",condition};
			int result = JOptionPane.showConfirmDialog(null, message,"Update Branch",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				if(condition.getText()!=null && condition.getText().length()>0){
					s = "update branch set " + attr.getSelectedItem().toString() + " = " + value.getText() + " where " + condition.getText();
					System.out.println(s);
				}
				else{
					s = "update branch set " + attr.getSelectedItem().toString() + " = " + value;
					System.out.println(s);
				}
			}
		}
		else if(i==1){ // function account
			JComboBox<String> attr = new JComboBox<String>();
			attr.addItem("account_number");
			attr.addItem("branch_name");
			attr.addItem("balance");
			JTextField value = new JTextField(20);
			JTextField condition = new JTextField(20);
			Object [] message = {"Attribute",attr,"New Value (use ' ' for string)",value,"Where (write complete expression)",condition};
			int result = JOptionPane.showConfirmDialog(null, message,"Update Branch",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				if(condition.getText()!=null && condition.getText().length()>0){
					s = "update account set " + attr.getSelectedItem().toString() + " = " + value.getText() + " where " + condition.getText();
					System.out.println(s);
				}
				else{
					s = "update account set " + attr.getSelectedItem().toString() + " = " + value;
					System.out.println(s);
				}
			}
		}
		// do the same thing for other tables as well
		else{
			
		}
		return s;
	}
	
	public static String DeleteMenu(Integer i){ // function displaying delete dialog
		String s = "";
		if(i==0){ // for branch
			JTextField condition = new JTextField(20);	
			Object [] message = {"Where (write complete expression)",condition};
			int result = JOptionPane.showConfirmDialog(null, message,"Delete from branch",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				if(condition.getText()!=null && condition.getText().length()>0){
					s = "delete from branch where " + condition.getText();
					System.out.println(s);
				}
				else{
					s = "delete from branch";
					System.out.println(s);
				}
			}
		}
		else if(i==1){ // for account
			JTextField condition = new JTextField(20);	
			Object [] message = {"Where (write complete expression)",condition};
			int result = JOptionPane.showConfirmDialog(null, message,"Delete from account",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				if(condition.getText()!=null && condition.getText().length()>0){
					s = "delete from account where " + condition.getText();
					System.out.println(s);
				}
				else{
					s = "delete from account";
					System.out.println(s);
				}
			}
		}
		// do the same thing for other tables as well
		else{
			
		}
		return s;
	}
	
	public static String SearchMenu(Integer i){ // function displaying search dialog
		String s="";
		if(i==0){ // for branch
			JTextField condition = new JTextField(20);
			Object [] message = {"Where (write complete expression)",condition};
			int result = JOptionPane.showConfirmDialog(null, message,"Search into Branch",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				if(condition.getText()!=null && condition.getText().length()>0){
					s = "select * from branch where " + condition.getText();
					System.out.println(s);
				}
			}
		}
		else if(i==1){ // for account
			JTextField condition = new JTextField(20);
			Object [] message = {"Where (write complete expression)",condition};
			int result = JOptionPane.showConfirmDialog(null, message,"Search into Account",JOptionPane.OK_CANCEL_OPTION);
			if(result == JOptionPane.OK_OPTION){
				if(condition.getText()!=null && condition.getText().length()>0){
					s = "select * from account where " + condition.getText();
					System.out.println(s);
				}
			}
		}
		// do the same thing for other tables as well
		else{
			
		}
		return s;
	}
	
	public static String QueryMenu(){ // function displaying SQL dialog
		String s = "";
		JPanel panel = new JPanel();
		JTextArea query = new JTextArea("<<Enter your query here>>",10,20);
		query.setPreferredSize(new Dimension(100, 100));
		query.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(query, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		panel.setLayout(new BorderLayout());
		panel.add( scrollPane, BorderLayout.CENTER );
		
		Object [] message = {"Query",panel};
		
		int result = JOptionPane.showConfirmDialog(null, message,"Query Input",JOptionPane.OK_CANCEL_OPTION);
		if(result == JOptionPane.OK_OPTION){
			s = query.getText();
		}
		return s;
	}
	
	public static void ExecuteSQL(Connection conn, String s, Integer ch1){ // executing query for show records option
		// data structure required for JTable
		Vector<String> cnames = new Vector<String>();
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		
		try {
			Statement stmt = conn.createStatement() ;
			ResultSet rs = stmt.executeQuery(s);
			ResultSetMetaData rsmd = rs.getMetaData();
			Integer columnsNumber = rsmd.getColumnCount();
			for(int i=1; i<=columnsNumber; i++){
				cnames.addElement(rsmd.getColumnName(i));
			}
			while(rs.next()){
				Vector<String> row = new Vector<String>();
				for(int i=1; i<=columnsNumber; i++){
					row.addElement(rs.getString(i));
				}
				data.addElement(row);
			}
			DisplayTable(data,cnames,ch1); // function displaying result in a table format
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(s.isEmpty())
				JOptionPane.showMessageDialog(null, "Empty Values");
			else
				JOptionPane.showMessageDialog(null, "Error in SQL");
			e.printStackTrace();
		}
	}
	
	public static void ExecuteSQL(Connection conn, String s){ // executing query for other options
		Vector<String> cnames = new Vector<String>();
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		try {
			Statement stmt = conn.createStatement() ;
			ResultSet rs = stmt.executeQuery(s);
			ResultSetMetaData rsmd = rs.getMetaData();
			Integer columnsNumber = rsmd.getColumnCount();
			for(int i=1; i<=columnsNumber; i++){
				cnames.addElement(rsmd.getColumnName(i));
			}
			while(rs.next()){
				Vector<String> row = new Vector<String>();
				for(int i=1; i<=columnsNumber; i++){
					row.addElement(rs.getString(i));
				}
				data.addElement(row);
			}
			DisplayTable(data,cnames,6); // function displaying result in a table format
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(s.isEmpty())
				JOptionPane.showMessageDialog(null, "Empty Values");
			else
				JOptionPane.showMessageDialog(null, "Error in SQL");			
			e.printStackTrace();
		}
	}
	
	public static void ExecuteUpdateSQL(Connection conn, String s, Integer ch1){
		try {
			conn.setAutoCommit(true); // changes shall be committed, not lost
			Statement stmt = conn.createStatement() ;
			stmt.executeUpdate(s);
			JOptionPane.showMessageDialog(null, "Table suceesfully modified.");
			if(ch1==0)
				ExecuteSQL(conn,"select * from branch",ch1);
			else if(ch1==1)
				ExecuteSQL(conn,"select * from account",ch1);
			// do the same for other values
			else{
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(s.isEmpty())
				JOptionPane.showMessageDialog(null, "Empty Values");
			else
				JOptionPane.showMessageDialog(null, "Error in SQL");
			e.printStackTrace();
		}
	}
	
	public static void DisplayTable (Vector data, Vector cnames, Integer i){
		String caption = "";
		JPanel panel = new JPanel();
		JTable table = new JTable(data, cnames);
		JScrollPane scrollPane = new JScrollPane(table);
		
		panel.setLayout( new BorderLayout());
		panel.setSize(400, 300);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		Object [] message = {panel};
		
		if(i==0)
			caption="Branch Information";
		else if(i==1)
			caption="Account Information";
		else if(i==2)
			caption="Loan Information";
		else if(i==3)
			caption="Customer Information";
		else if(i==4)
			caption="Depositor Information";
		else if(i==5)
			caption="Borrower Information";
		else
			caption="Result Table";
		
		JOptionPane.showMessageDialog(null, message, caption, JOptionPane.INFORMATION_MESSAGE);
	}
}