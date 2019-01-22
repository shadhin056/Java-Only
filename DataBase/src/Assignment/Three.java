package Assignment;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection;
		String query = "";

		printMessage("Welcome to Banking Database");

		DriverRegistration();

		connection = CreateConnection();

		if (connection != null) {
			printMessage("Connection Successfull");
		} else {
			printMessage("Connection not Successfull");
			return;
		}

		while (true) {
			query = QueryMenu();
			if (query.equals("END")) {

				try {
					connection.close();
					printMessage("Good Bye");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			ExecuteSQL(connection, query);
		}

	}

	private static void ExecuteSQL(Connection conn, String query) {
		// TODO Auto-generated method stub

		Vector<String> cnames = new Vector<String>();
		Vector<Vector<String>> data = new Vector<Vector<String>>();

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();

			int colNumber = rsmd.getColumnCount();

			for (int i = 1; i <= colNumber; i++) {

				cnames.addElement(rsmd.getColumnName(i));

			}

			while (rs.next()) {
				Vector<String> row = new Vector<String>();

				for (int i = 1; i <= colNumber; i++) {

					row.addElement(rs.getString(i));

				}

				data.addElement(row);
			}

			DisplayTable(data, cnames);

		} catch (SQLException e) {
			// TODO Auto-generated catch block

			if (query.isEmpty()) {
				printMessage("Empty Values");
			} else {
				printMessage("Error in sql");
			}
			e.printStackTrace();
		}

	}

	private static void DisplayTable(Vector data, Vector cnames) {
		// TODO Auto-generated method stub

		String caption = "Result Table";
		JPanel panel = new JPanel();

		JTable table = new JTable(data, cnames);

		JScrollPane scrollPane = new JScrollPane(table);
		panel.setLayout(new BorderLayout());
		panel.setSize(400, 300);

		panel.add(scrollPane, BorderLayout.CENTER);

		Object[] message = { panel };

		JOptionPane.showMessageDialog(null, message, caption,
				JOptionPane.INFORMATION_MESSAGE);

	}

	private static String QueryMenu() {
		// TODO Auto-generated method stub

		String s = "";
		JPanel panel = new JPanel();
		JTextArea query = new JTextArea("Enter Query", 10, 20);
		query.setPreferredSize(new Dimension(100, 100));
		query.setLineWrap(true);

		JScrollPane scrollPane = new JScrollPane(query,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		panel.setLayout(new BorderLayout());
		panel.add(scrollPane, BorderLayout.CENTER);
		Object[] message = { "Query", panel };

		int result = JOptionPane.showConfirmDialog(null, message,
				"Query input", JOptionPane.OK_CANCEL_OPTION);

		if (result == JOptionPane.OK_OPTION) {
			s = query.getText();
		}

		return s;
	}

	private static Connection CreateConnection() {
		// TODO Auto-generated method stub

		Connection conn = null;
		JTextField user = new JTextField(10);
		JPasswordField pass = new JPasswordField(10);

		Object[] message = { "User Name: ", user, "\n", "Password: ", pass };

		int result = JOptionPane.showConfirmDialog(null, message,
				"Enter User name and Password", JOptionPane.OK_CANCEL_OPTION);

		if (result == JOptionPane.OK_OPTION) {
			try {
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost", user.getText(),
						pass.getText());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Connection Failed! check console");
				e.printStackTrace();
			}
		}

		return conn;
	}

	private static void DriverRegistration() {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Jdbc driver not found");
			e.printStackTrace();
			return;
		}
		printMessage("Driver Regestered");
	}

	public static void printMessage(String s) {

		JOptionPane.showMessageDialog(null, s);
	}

}
