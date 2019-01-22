package One;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class Calculator {

	private JFrame frame;
	private JTextField aT;
	private JTextField bT;
	private JTextField ANS;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
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
		
		JButton ADD = new JButton("ADD");
		ADD.setForeground(Color.PINK);
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				int b;
				int ans;
				try {
					a=Integer.parseInt(aT.getText());
					b=Integer.parseInt(bT.getText());
					ans = a+b;
					ANS.setText(Integer.toString(ans));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		ADD.setBounds(37, 155, 110, 23);
		frame.getContentPane().add(ADD);
		
		aT = new JTextField();
		aT.setBounds(36, 88, 86, 20);
		frame.getContentPane().add(aT);
		aT.setColumns(10);
		
		bT = new JTextField();
		bT.setBounds(163, 88, 86, 20);
		frame.getContentPane().add(bT);
		bT.setColumns(10);
		
		ANS = new JTextField();
		ANS.setText("Answer");
		ANS.setBounds(338, 156, 86, 20);
		frame.getContentPane().add(ANS);
		ANS.setColumns(10);
		
		JButton Minus = new JButton("Minus");
		Minus.setForeground(UIManager.getColor("Button.disabledForeground"));
		Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a;
				int b;
				int ans;
				try {
					a=Integer.parseInt(aT.getText());
					b=Integer.parseInt(bT.getText());
					ans = a-b;
					ANS.setText(Integer.toString(ans));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		Minus.setBounds(160, 155, 89, 23);
		frame.getContentPane().add(Minus);
		
		JLabel lblNewLabel = new JLabel("ANS =");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(259, 159, 69, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Welcome  To my simple Calculator");
		lblNewLabel_1.setBounds(51, 22, 333, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
