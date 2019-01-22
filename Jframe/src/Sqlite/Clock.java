package Sqlite;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Clock extends JFrame {

	private JPanel contentPane;
	private JLabel lblClock ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clock frame = new Clock();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void clockwork()
	{	
		Thread clock =new Thread()
		{
				public void run() 
				{
					try {
						while(true)
						{
						Calendar cal=new GregorianCalendar();
						int day=cal.get(Calendar.DAY_OF_MONTH);
						int month=cal.get(Calendar.MONTH);
						int year=cal.get(Calendar.YEAR);
						
						int min=cal.get(Calendar.MINUTE);
						int sec=cal.get(Calendar.SECOND);
						int hour=cal.get(Calendar.HOUR);
						lblClock.setText("Time  "+hour+":"+min+":"+sec+"   "+day+"/"+month+"/"+year);
					
						sleep(1000);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
		};
		clock.start();
		}
	public Clock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    lblClock = new JLabel("Clock");
		lblClock.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblClock.setBackground(Color.PINK);
		lblClock.setBounds(20, 76, 258, 113);
		contentPane.add(lblClock);
		clockwork();
	}
}
