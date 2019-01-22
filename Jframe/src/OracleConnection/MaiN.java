package OracleConnection;

import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Sqlite.ConnecTion;

public class MaiN {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaiN window = new MaiN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn =null;
	/**
	 * Create the application.
	 */
	/**
	 * Create the application.
	 */
	public MaiN() {
		
		conn=DCon.getConnection();
		if (conn != null) {
			JOptionPane.showMessageDialog(null, "Welcome to Software Database");
		} else {
			JOptionPane.showMessageDialog(null, "Database Connection Failed!");
			return;
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
