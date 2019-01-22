import java.sql.*;
import java.util.Vector;

import javax.swing.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Banking {

	public static void main(String[] args) throws FileNotFoundException, DocumentException, SQLException {

		Connection connection = null;
		String query="";
		JOptionPane.showMessageDialog(null, "Welcome to Banking Database");
		DriverRegistration();
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "lab", "cse301");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (connection != null) {
			JOptionPane.showMessageDialog(null, "Database Connection Successful");
		} else {
			JOptionPane.showMessageDialog(null, "Database Connection Failed!");
			return;
		}
		String id = Login(connection);
		switch(id){
		case "A":
			admin(connection);
			break;
		case "O":
			operator(connection);
			break;
		default:
			//customerMenu(connection);
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // main ends
	/*
	private static void customerMenu(Connection connection) {
		// TODO Auto-generated method stub
		String query="";
		while(true){
			Integer choice = OperatorMainMenu();
			if(choice == 2){
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
				case 0: // Opening Account
					
					
				case 1: // inserting records
					
				default:
					JOptionPane.showMessageDialog(null, "Invalid Operation");
				}
			}
		}
	}
	*/
	private static int operatorMenu() {
		// TODO Auto-generated method stub
		JComboBox<String> cmb = new JComboBox<String>();
		cmb.addItem("Opening New Account");
		cmb.addItem("Opening New Loan");
		cmb.addItem("Checking Account Balance");
		cmb.addItem("Printing Account Statement");
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
	
	public static String Login(Connection conn){
		String id = "";
		JTextField user = new JTextField(10);
		JPasswordField password = new JPasswordField(10);
		Statement stmt = null;
		ResultSet rs = null;
		Object [] message = { "User Name: " , user, "\n", "Password:", password};
		int result = JOptionPane.showConfirmDialog(null, message, "Enter User name and Password",JOptionPane.OK_CANCEL_OPTION);
		if(result==JOptionPane.OK_OPTION){
			try {
				stmt = conn.createStatement();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				rs = stmt.executeQuery("SELECT * from banking_users");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//ResultSetMetaData rsmd = rs.getMetaData();
			//Integer columnsNumber = rsmd.getColumnCount();
			//for(int i=1; i<=columnsNumber; i++){
			//	cnames.addElement(rsmd.getColumnName(i));
			//}
			
			System.out.println("user: " + user.getText() + "Password: " + password.getText());
			try {
				while(rs.next()){
					System.out.println("user: " + rs.getString(1) + "Password: " + rs.getString(2));
					if(user.getText().equals(rs.getString(1)) && password.getText().equals(rs.getString(2))){
						if(rs.getString(3)=="C"){
							id = rs.getString(4);
						}
						else{
							id = rs.getString(3);
						}
						break;
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("id: " + id);
		return id;
	}
	
	public static Integer MainMenu(){ // function creating main dialog
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
	public static void operator(Connection connection) throws FileNotFoundException, DocumentException, SQLException{
		String query="";
		while(true){
			Integer choice = operatorMenu();
			if(choice == 4){
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
				case 0: // Opening new Account
					accountOpenMenu(connection);
					break;
				case 1: // Opening new Loan
					//loanOpenMenu();
					break;
				case 2: // Checking account balance
					//accountBalanceMenu(connection);
					break;
				case 3: // Deleting Records
					//printStatementMenu(connection);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid Operation");
				}
			}
		}
	}
	
	public static void executeInsert(Connection connection, String query) throws SQLException{
		Statement stmt = connection.createStatement() ;
		stmt.executeUpdate(query);
	}
	public static void accountOpenMenu(Connection connection) throws SQLException {
		// TODO Auto-generated method stub
		String s = "";
			JTextField account_number = new JTextField(20);
			JTextField name = new JTextField(20);
			JTextField street = new JTextField(20);
			JTextField city = new JTextField(20);
			JTextField balance = new JTextField(20);
			JComboBox<String> branch = new JComboBox<String>();
			JTextField username = new JTextField(10);
			JPasswordField password = new JPasswordField(10);
			Statement stmt = connection.createStatement() ;
			ResultSet rs = stmt.executeQuery("select branch_name from branch");
			while(rs.next()){
				branch.addItem(rs.getString(1));
			}
			Object [] message = {"Account Number",account_number,
					             "Customer Name",name,
					             "Customer Street",street,
					             "Customer City", city,
					             "Branch Name",branch,
					             "User Name",username,
					             "Password",password,
					             "Deposit",balance};
			int result = JOptionPane.showConfirmDialog(null, message,"Opening new account",JOptionPane.OK_CANCEL_OPTION);
			connection.setAutoCommit(false);
			if(result == JOptionPane.OK_OPTION){
				s = "insert into account values ('" + account_number.getText() + "','" + branch.getSelectedItem().toString() + "'," + balance.getText() + ")";
				System.out.println(s);
				executeInsert(connection,s);
				s = "insert into customer values ('" + name.getText() + "','" + street.getText() + "','" + city.getText() + "')";
				System.out.println(s);
				executeInsert(connection,s);
				s = "insert into banking_users values ('" + username.getText() + "','" + password.getText() + "','" + "C','" + account_number.getText() + "')";
				System.out.println(s);
				executeInsert(connection,s);
				s = "insert into depositor values ('" + name.getText() + "','"  + account_number.getText() + "')";
				System.out.println(s);
				executeInsert(connection,s);		
				connection.commit();
			}
			
		
	}
	public static void admin(Connection connection) throws FileNotFoundException, DocumentException{
		String query="";
		while(true){
			Integer choice = MainMenu();
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
	
	public static void ExecuteSQL(Connection conn, String s, Integer ch1) throws FileNotFoundException, DocumentException{ // executing query for show records option
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
			GenerateReport(conn,s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(s.isEmpty())
				JOptionPane.showMessageDialog(null, "Empty Values");
			else
				JOptionPane.showMessageDialog(null, "Error in SQL");
			e.printStackTrace();
		}
	}
	
	public static void ExecuteSQL(Connection conn, String s) throws FileNotFoundException, DocumentException{ // executing query for other options
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
			GenerateReport(conn,s);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(s.isEmpty())
				JOptionPane.showMessageDialog(null, "Empty Values");
			else
				JOptionPane.showMessageDialog(null, "Error in SQL");			
			e.printStackTrace();
		}
	}
	
	private static void GenerateReport(Connection conn, String s) throws FileNotFoundException, DocumentException, SQLException {
		// TODO Auto-generated method stub
		 String timeStamp = new Timestamp(System.currentTimeMillis()).toString();
         String ts= timeStamp;
         ts = ts.replace(':','_');
         ts = ts.replace('-','_');
         ts = ts.replace(' ','_');
         System.out.println(ts);
         String fileName = "Report_" + ts + ".pdf";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(s);
		Document my_pdf_report = new Document();
        PdfWriter.getInstance(my_pdf_report, new FileOutputStream(fileName));
        my_pdf_report.open(); 
        
        ResultSetMetaData rsmd = rs.getMetaData();
		Integer columnsNumber = rsmd.getColumnCount();
		
        //we have four columns in our table
        PdfPTable my_report_table = new PdfPTable(columnsNumber);
        //create a cell object
        PdfPCell table_cell;
       
        for(int i=1; i<=columnsNumber; i++){
    		String str = rsmd.getColumnName(i);
            table_cell=new PdfPCell(new Phrase(str));
            my_report_table.addCell(table_cell);
		}
        
        while (rs.next()) {              
        	for(int i=1; i<=columnsNumber; i++){
        		String str = rs.getString(i);
                table_cell=new PdfPCell(new Phrase(str));
                my_report_table.addCell(table_cell);
			}
        }
                        
        Paragraph paragraph = new Paragraph();
		paragraph.add("Report on " + s + "\n\n\n");
		paragraph.setAlignment(Element.ALIGN_CENTER);
		my_pdf_report.add(paragraph);
                 
        /* Attach report table to PDF */
        my_pdf_report.add(my_report_table);   
        my_pdf_report.addCreationDate();
        
        
        Paragraph paragraph1 = new Paragraph();
		paragraph1.add("\n\n\n Report generated on " + timeStamp);
		paragraph1.setAlignment(Element.ALIGN_RIGHT);
		my_pdf_report.add(paragraph1);
		
        my_pdf_report.close();
		
	}

	public static void ExecuteUpdateSQL(Connection conn, String s, Integer ch1) throws FileNotFoundException, DocumentException{
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

