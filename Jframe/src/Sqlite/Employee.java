package Sqlite;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.security.interfaces.RSAKey;
import java.awt.event.ActionEvent;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
public class Employee extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JComboBox comboBoxName;
	private JComboBox SEARCHcombow;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	Connection conn=null;
	private JTextField EID;
	private JTextField ENAME;
	private JTextField EUSER;
	private JTextField EPASSS;
	private JTextField EAGE;
	private JTextField CLOCATION;
	private JTextField CID;
	private JTextField CNAME;
	private JTextField CFOUNDATION;
	private JTextField ESearch;
	private JTextField CSearch;

	/**
	 * Create the frame.
	 */
	public void fillcombox()
	{
		try {
			String query="select * from employee";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet re=pst.executeQuery();
			while(re.next())
			{
				comboBoxName.addItem(re.getString("name"));
	
			}
			
		} catch (Exception e) {
			
		}
	}
//	public void refreshcompany()
//	{
//		try {
//			String query="select * from company";
//			PreparedStatement pst=conn.prepareStatement(query);
//			ResultSet re=pst.executeQuery();
//			table.setModel(DbUtils.resultSetToTableModel(re));
//			pst.close();
//			re.close();
//		} 	
//			
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//	}
//	public void refreshforemployee()
//	{
//		try {
//			String query="select * from employee";
//			PreparedStatement pst=conn.prepareStatement(query);
//			ResultSet re=pst.executeQuery();
//			table.setModel(DbUtils.resultSetToTableModel(re));
//			pst.close();
//			re.close();
//		} 	
//			
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
	
	public Employee() {
		conn=ConnecTion.dbConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 484);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnNew.setIcon(new ImageIcon("C:\\Users\\SHADHIN\\Downloads\\Documents\\ok-2-icon.png"));
		mnFile.add(mnNew);
		
		JMenuItem mntmJava = new JMenuItem("Java");
		mnNew.add(mntmJava);
		
		JMenuItem mntmJavaFile = new JMenuItem("java file");
		mnNew.add(mntmJavaFile);
		
		JMenu mnClose = new JMenu("Close");
		mnFile.add(mnClose);
		
		JMenuItem mntmAll = new JMenuItem("All");
		mnClose.add(mntmAll);
		
		JMenuItem mntmSingle = new JMenuItem("single");
		mnClose.add(mntmSingle);
		
		JMenu mnEdit_1 = new JMenu("Edit");
		mnFile.add(mnEdit_1);
		
		JMenuItem mntmAll_1 = new JMenuItem("all");
		mnEdit_1.add(mntmAll_1);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		mnFile.add(mntmExit);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEmployeeInfo = new JButton("Employee Info");
		btnEmployeeInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select * from employee";
					PreparedStatement pst=conn.prepareStatement(query);
					ResultSet re=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
					pst.close();
					re.close();
				} 	
					
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		btnEmployeeInfo.setBounds(10, 42, 120, 23);
		contentPane.add(btnEmployeeInfo);
		
		JScrollPane TABLE = new JScrollPane();
		TABLE.setBounds(10, 110, 430, 308);
		contentPane.add(TABLE);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					int row=table.getSelectedRow();
					String EID_=(table.getModel().getValueAt(row, 0).toString());
					String query = "select * from employee where ID ='"+EID_+"'";
					PreparedStatement pst=conn.prepareStatement(query);
					ResultSet re =pst.executeQuery();
					while(re.next())
					{
						EID.setText(re.getString("id"));
						ENAME.setText(re.getString("name"));
						EUSER.setText(re.getString("user"));
						EPASSS.setText(re.getString("password"));
						EAGE.setText(re.getString("age"));
										}
				} catch (Exception e) {
					
				}
			}
		});
		TABLE.setViewportView(table);
		
		JButton btnCompanyInfo = new JButton("Company Info");
		btnCompanyInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select * from company";
					PreparedStatement pst=conn.prepareStatement(query);
					ResultSet re=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
					pst.close();
					re.close();
				} 	
					
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		
		btnCompanyInfo.setBounds(10, 76, 120, 23);
		contentPane.add(btnCompanyInfo);
		
		JButton ADDEMPLOYEE = new JButton("ADD");
		ADDEMPLOYEE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="insert into employee (ID,Name,user,password,age) values (?,?,?,?,?)";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, EID.getText());
					pst.setString(2, ENAME.getText());
					pst.setString(3, EUSER.getText());
					pst.setString(4, EPASSS.getText());
					pst.setString(5, EAGE.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data saved");
					pst.close();
					
				} catch (Exception e) {
					
				}//refreshforemployee();
			}
		});
		ADDEMPLOYEE.setBounds(564, 165, 59, 23);
		contentPane.add(ADDEMPLOYEE);
		
		EID = new JTextField();
		EID.setBounds(608, 30, 86, 20);
		contentPane.add(EID);
		EID.setColumns(10);
		
		ENAME = new JTextField();
		ENAME.setBounds(608, 59, 86, 20);
		contentPane.add(ENAME);
		ENAME.setColumns(10);
		
		EUSER = new JTextField();
		EUSER.setBounds(608, 83, 86, 20);
		contentPane.add(EUSER);
		EUSER.setColumns(10);
		
		EPASSS = new JTextField();
		EPASSS.setBounds(608, 108, 86, 20);
		contentPane.add(EPASSS);
		EPASSS.setColumns(10);
		
		EAGE = new JTextField();
		EAGE.setBounds(608, 134, 86, 20);
		contentPane.add(EAGE);
		EAGE.setColumns(10);
		
		CLOCATION = new JTextField();
		CLOCATION.setBounds(605, 321, 86, 20);
		contentPane.add(CLOCATION);
		CLOCATION.setColumns(10);
		
		CID = new JTextField();
		CID.setBounds(605, 258, 86, 20);
		contentPane.add(CID);
		CID.setColumns(10);
		
		CNAME = new JTextField();
		CNAME.setBounds(605, 290, 86, 20);
		contentPane.add(CNAME);
		CNAME.setColumns(10);
		
		JButton ADDCOMPANY = new JButton("ADD");
		ADDCOMPANY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="insert into company (ID,Name,location,foundation) values (?,?,?,?)";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, CID.getText());
					pst.setString(2, CNAME.getText());
					pst.setString(3, CLOCATION.getText());
					pst.setString(4, CFOUNDATION.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data saved");
					pst.close();
					
				} catch (Exception e) {
					
				}//refreshcompany();
			}
		});
		ADDCOMPANY.setBounds(564, 386, 59, 23);
		contentPane.add(ADDCOMPANY);
		
		JLabel lblUser = new JLabel("Insert Into Employeee");
		lblUser.setBounds(574, 11, 130, 14);
		contentPane.add(lblUser);
		
		JLabel lblInsertIntoCompany = new JLabel("Insert Into Company");
		lblInsertIntoCompany.setBounds(577, 235, 127, 14);
		contentPane.add(lblInsertIntoCompany);
		
		JLabel lblUserName = new JLabel("User name =");
		lblUserName.setBounds(518, 86, 80, 14);
		contentPane.add(lblUserName);
		
		JLabel lblNewLabel = new JLabel("Passsword =");
		lblNewLabel.setBounds(518, 111, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID =");
		lblId.setBounds(518, 36, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name =");
		lblName.setBounds(518, 62, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age =");
		lblAge.setBounds(518, 137, 46, 14);
		contentPane.add(lblAge);
		
		CFOUNDATION = new JTextField();
		CFOUNDATION.setBounds(605, 352, 86, 20);
		contentPane.add(CFOUNDATION);
		CFOUNDATION.setColumns(10);
		
		JLabel lblId_1 = new JLabel("ID =");
		lblId_1.setBounds(518, 258, 46, 14);
		contentPane.add(lblId_1);
		
		JLabel lblName_1 = new JLabel("Name =");
		lblName_1.setBounds(518, 293, 46, 14);
		contentPane.add(lblName_1);
		
		JLabel lblLocation = new JLabel("Location =");
		lblLocation.setBounds(518, 324, 77, 14);
		contentPane.add(lblLocation);
		
		JLabel lblFoundation = new JLabel("Foundation =");
		lblFoundation.setBounds(518, 355, 80, 14);
		contentPane.add(lblFoundation);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="Update employee set ID='"+EID.getText()+"',Name='"+ENAME.getText()+"',user='"+EUSER.getText()+"',password='"+EPASSS.getText()+"',age='"+EAGE.getText()+"'where ID ='"+EID.getText()+"'";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				} catch (Exception e) {
					
				}
				//refreshforemployee();
			}
		});
		btnUpdate.setBounds(475, 165, 79, 23);
		contentPane.add(btnUpdate);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="Update company set ID='"+CID.getText()+"',Name='"+CNAME.getText()+"',location='"+CLOCATION.getText()+"',foundation='"+CFOUNDATION.getText()+"'where ID ='"+CID.getText()+"'";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
				} catch (Exception e) {
				}//refreshcompany();
			}
		});
		btnUpdate_1.setBounds(475, 386, 79, 23);
		contentPane.add(btnUpdate_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int action=JOptionPane.showConfirmDialog(null,"Do you want to delete the data","Delete",JOptionPane.YES_NO_CANCEL_OPTION);
				if(action==0)
				{
				try {
					String query="delete from employee where ID ='"+EID.getText()+"'";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
				} catch (Exception e1) {
					
				}}//refreshforemployee();
			}
			
		});
		btnDelete.setBounds(634, 165, 70, 23);
		contentPane.add(btnDelete);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int action=JOptionPane.showConfirmDialog(null,"Do you want to delete the data","Delete",JOptionPane.YES_NO_CANCEL_OPTION);
				if(action==0)
					{try {
					String query="delete from Company where ID ='"+CID.getText()+"'";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
				} catch (Exception e2) {
					
				}}//refreshcompany();
			}
		});
		btnDelete_1.setBounds(633, 386, 71, 23);
		contentPane.add(btnDelete_1);
		
		comboBoxName = new JComboBox();
		comboBoxName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from employee where name =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, (String) comboBoxName.getSelectedItem());
					ResultSet re =pst.executeQuery();
					while(re.next())
					{
						EID.setText(re.getString("id"));
						ENAME.setText(re.getString("name"));
						EUSER.setText(re.getString("user"));
						EPASSS.setText(re.getString("password"));
						EAGE.setText(re.getString("age"));
										}
				} catch (Exception e) {
					
				}
			}
		});
		comboBoxName.setBounds(478, 8, 86, 20);
		contentPane.add(comboBoxName);
		
		JLabel lblEmployeeNameList = new JLabel("Update Employee , name List :");
		lblEmployeeNameList.setBounds(301, 11, 176, 14);
		contentPane.add(lblEmployeeNameList);
		
		ESearch = new JTextField();
		ESearch.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent arg0) {
				try {	
					String Selection =(String)SEARCHcombow.getSelectedItem();
					String query = "select * from employee where "+Selection+" =?";
					PreparedStatement pst=conn.prepareStatement(query);
					pst.setString(1, ESearch.getText());
					ResultSet re =pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(re));
				} catch (Exception e) {
					
				}
			}
			public void keyReleased1(KeyEvent e) {
			}
		});
		ESearch.setText("search");
		ESearch.setBounds(147, 43, 86, 20);
		contentPane.add(ESearch);
		ESearch.setColumns(10);
		
		CSearch = new JTextField();
		CSearch.setText("search");
		CSearch.setBounds(147, 79, 86, 20);
		contentPane.add(CSearch);
		CSearch.setColumns(10);
		
		SEARCHcombow = new JComboBox();
		SEARCHcombow.setModel(new DefaultComboBoxModel(new String[] {"Name", "ID", "age", "user"}));
		SEARCHcombow.setBounds(243, 43, 98, 20);
		contentPane.add(SEARCHcombow);
		
		
		
		
		
		
		
		
		
		
		
		
		 //refreshforemployee();
		 //refreshcompany();
		 fillcombox();
	}
}
