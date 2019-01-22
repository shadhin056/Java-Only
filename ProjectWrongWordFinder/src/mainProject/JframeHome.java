package mainProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Label;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;

public class JframeHome {
	private String lString = " ";
	public JFrame frame;
	JTextArea ans;
	private JTextField textField;
	String gettextfield = " ";
	Main obj = new Main();
	/**
	 * Launch the application.
	 */
	public void mainJframe() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeHome window = new JframeHome();
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
	public JframeHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 721, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWelcome = new JLabel("Name:Moniruzzaman Khondaker");
		lblWelcome.setBounds(451, 11, 244, 20);
		frame.getContentPane().add(lblWelcome);

		JLabel lblTypeAnyEnglish = new JLabel("Type any English Word :");
		lblTypeAnyEnglish.setBounds(10, 48, 151, 14);
		frame.getContentPane().add(lblTypeAnyEnglish);

		textField = new JTextField();
		textField.setBounds(10, 72, 685, 83);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Button in action
				getallrecord();
				if (textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Write something ");
					textField.requestFocus();
				}

			}
		});

		btnEnter.setBounds(10, 166, 89, 23);
		frame.getContentPane().add(btnEnter);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(606, 394, 89, 23);
		frame.getContentPane().add(btnExit);

		Label label = new Label("ID : 2012-2-60-056");
		label.setBounds(451, 37, 116, 22);
		frame.getContentPane().add(label);

		ans = new JTextArea();
		// ans.setText("kk");
		ans.setBounds(10, 225, 685, 78);
		frame.getContentPane().add(ans);
		//JFrame frame = new JFrame ("Test");
		//JTextArea textArea = new JTextArea ("Test");

		/*JScrollPane scroll = new JScrollPane (ans,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(scroll);
		frame.setVisible (true);*/
		
		
		
		JLabel lblWrongWords = new JLabel("Wrong Words :");
		lblWrongWords.setBounds(10, 200, 116, 14);
		frame.getContentPane().add(lblWrongWords);
		
		JLabel lblSec = new JLabel("Sec : 1");
		lblSec.setBounds(569, 42, 46, 14);
		frame.getContentPane().add(lblSec);
		
		JLabel lblSpellChecker = new JLabel("Artificial Intelligence : Spell Checker");
		lblSpellChecker.setBounds(117, 14, 297, 23);
		frame.getContentPane().add(lblSpellChecker);

	}

	public void getallrecord() {
		gettextfield = textField.getText();
		obj.checked(gettextfield);
		String string[]=new String[100];
		string = obj.checked(gettextfield);
		String asString = Arrays.toString(string);
		//System.out.println();
		ans.setText(asString);
	}
}
