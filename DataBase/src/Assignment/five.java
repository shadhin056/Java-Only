package Assignment;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.*;
import java.util.Vector;

import javax.swing.*;

public class five {

	public static void main

(String[] args) {

			Connection connection;
			String 

query="";
			

JOptionPane.showMessageDialog(null, 

"Welcome to Banking Database");
			

DriverRegistration();
			connection 

= CreateConnection();
			if 

(connection != null) {
				

JOptionPane.showMessageDialog(null, 

"Database Connection Successful");
			} 
			else {
				

JOptionPane.showMessageDialog(null, 

"Database Connection Failed!");
				

return;
			}
			while

(true){
				

query= QueryMenu();
				if

(query.equals("END")){
					

try {
					

	connection.close();
					

	

JOptionPane.showMessageDialog(null, 

"Good Bye!");
					

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
					

break;
				}
				

ExecuteSQL(connection,query);
			}
		} // main ends
		
		public static void 

DriverRegistration(){
			try {
				

Class.forName

("oracle.jdbc.driver.OracleDriver")

;
			} catch 

(ClassNotFoundException e) {
				

System.out.println("Where is your Oracle JDBC Driver?");
				

e.printStackTrace();
				

return;
			}
			

JOptionPane.showMessageDialog(null, 

"Oracle JDBC Driver Registered!");
		}
		
		public static 

Connection CreateConnection(){
			Connection 

conn = null;
			JTextField 

user = new JTextField(10);
			

JPasswordField password = new 

JPasswordField(10);
			Object [] 

message = { "User Name: " , user, 

"\n", "Password:", password};
			int result 

= JOptionPane.showConfirmDialog

(null, message, "Enter User name and Password",JOptionPane.OK_CANCEL_OPTION);
			if

(result==JOptionPane.OK_OPTION){
				try 

{
					

conn = DriverManager.getConnection

("jdbc:oracle:thin:@localhost", 

user.getText(), password.getText

());
				} 

catch (SQLException e) {
					

System.out.println("Connection Failed! Check output console");
					

e.printStackTrace();
				}
			}
			return 

conn;
		}
		
		public static 

String QueryMenu(){ // function displaying SQL dialog
			String s = "";
			JPanel 

panel = new JPanel();
			JTextArea 

query = new JTextArea("<<Enter your query here>>",10,20);
			

query.setPreferredSize(new 

Dimension(100, 100));
			

query.setLineWrap(true);
			JScrollPane 

scrollPane = new JScrollPane(query, 

JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			

panel.setLayout(new BorderLayout

());
			panel.add( 

scrollPane, BorderLayout.CENTER );
			
			Object [] 

message = {"Query",panel};
			
			int result 

= JOptionPane.showConfirmDialog

(null, message,"Query Input",JOptionPane.OK_CANCEL_OPTION

);
			if(result 

== JOptionPane.OK_OPTION){
				s = 

query.getText();
			}
			return s;
		}
		
		public static void 

ExecuteSQL(Connection conn, String 

s){ // executing query for other options
			

Vector<String> cnames = new Vector<String>();
			

Vector<Vector<String>> data = new Vector<Vector<String>>();
			try {
				

Statement stmt = 

conn.createStatement() ;
				

ResultSet rs = stmt.executeQuery

(s);
				

ResultSetMetaData rsmd = 

rs.getMetaData();
				

Integer columnsNumber = 

rsmd.getColumnCount();
				

for(int i=1; i<=columnsNumber; i++){
					

cnames.addElement

(rsmd.getColumnName(i));
				}
				

while(rs.next()){
					

Vector<String> row = new 

Vector<String>();
					

for(int i=1; i<=columnsNumber; i++){
					

	row.addElement

(rs.getString(i));
					

}
					

data.addElement(row);
				}
				

DisplayTable(data,cnames,6); // function displaying result in a table format
			} catch 

(SQLException e) {
				// TODO Auto generated catch block
				if

(s.isEmpty())
					

JOptionPane.showMessageDialog(null, 

"Empty Values");
				

else
					

JOptionPane.showMessageDialog(null, 

"Error in SQL");			
				

e.printStackTrace();
			}
		}
		
		public static void 

DisplayTable (Vector data, Vector cnames, Integer i){
			String caption = "";
			JPanel panel = new JPanel();
			JTable table = new JTable(data, cnames);
			JScrollPane scrollPane = new JScrollPane (table);
			
			

panel.setLayout( new BorderLayout

());
			

panel.setSize(400, 300);
			panel.add

(scrollPane, BorderLayout.CENTER);
			
			Object [] 

message = {panel};
			
			if(i==0)
				

caption="Branch Information";
			else if

(i==1)
				

caption="Account Information";
			else if

(i==2)
				

caption="Loan Information";
			else if

(i==3)
				

caption="Customer Information";
			else if

(i==4)
				

caption="Depositor Information";
			else if

(i==5)
				

caption="Borrower Information";
			else
				

caption="Result Table";
			
			

JOptionPane.showMessageDialog(null, 

message, caption, 

JOptionPane.INFORMATION_MESSAGE);
		}

	}