package Two;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class ShowMEname {

	private JFrame frame;
	private JLabel lblClickMe;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowMEname window = new ShowMEname();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShowMEname() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.setForeground(UIManager.getColor("CheckBox.foreground"));
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hi i am in home");
				
			}
		});
		btnClickMe.setBounds(73, 139, 89, 23);
		frame.getContentPane().add(btnClickMe);
		
		JButton btnClickMe_1 = new JButton("Click Me 2");
		btnClickMe_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblClickMe.setText("Yes You got me");
			}
		});
		btnClickMe_1.setBounds(181, 139, 126, 23);
		frame.getContentPane().add(btnClickMe_1);
		
		lblClickMe = new JLabel("Click me 2");
		lblClickMe.setBounds(205, 71, 89, 14);
		frame.getContentPane().add(lblClickMe);
	}

}
