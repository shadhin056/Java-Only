package Sqlite;

import java.awt.EventQueue;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection conn =null;
	private JTextField USER;
	private JPasswordField passwordField;
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		conn=ConnecTion.dbConnection();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Username = new JLabel("User Name");
		Username.setBounds(164, 153, 93, 20);
		frame.getContentPane().add(Username);
		
		JLabel Password = new JLabel("Password");
		Password.setBounds(164, 189, 93, 20);
		frame.getContentPane().add(Password);
		
		USER = new JTextField();
		USER.setBounds(267, 153, 136, 20);
		frame.getContentPane().add(USER);
		USER.setColumns(10);
//login here
		JButton Login = new JButton("Login");
//image
		Image img = new ImageIcon(this.getClass().getResource("/ok.png")).getImage();
		Login.setIcon(new ImageIcon(img));
		
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				{
					try {
						String query="select * from employee where user =? and password =? ";
						
						PreparedStatement pst =conn.prepareStatement(query);
						pst.setString(1, USER.getText());
						pst.setString(2, passwordField.getText());
					ResultSet rs=pst.executeQuery();
						int count =0;
					while(rs.next())
						{	
							count++;
						}
					if (count==1)
					{
	//Second Jframe is here 
						JOptionPane.showMessageDialog(null, "User and Pass is Correct ");
						frame.disable();
						Employee emp =new Employee();
						emp.setVisible(true);
					}
					else if(count >1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate User and Pass");
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "Pass Wrong");
					}
					rs .close();
					pst.close();
					
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
						
					}
					
				}
			}
		});
		Login.setBounds(267, 220, 136, 23);
		frame.getContentPane().add(Login);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(267, 189, 136, 20);
		frame.getContentPane().add(passwordField);
// add image here
		JLabel label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		label.setIcon(new ImageIcon(img1));
		
		label.setBounds(25, 38, 136, 205);
		frame.getContentPane().add(label);
		
		JLabel lblWelcomeToMy = new JLabel("WelCome to My Company Management ");
		lblWelcomeToMy.setForeground(Color.MAGENTA);
		lblWelcomeToMy.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWelcomeToMy.setBounds(25, 11, 378, 48);
		frame.getContentPane().add(lblWelcomeToMy);
	}
}
























