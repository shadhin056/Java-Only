//Name: Moniruzzaman Khondaker
//ID:2012-2-60-056
//sec:1

package mainProject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import sqlite.SqliteHandler;

public class Main extends JFrame {

	private static String DB_NAME = "dict.db";
	private static String TABLE_NAME = "words";

	private static String sql;
	private static ResultSet rs;

	private static SqliteHandler mSqliteReader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mSqliteReader = new SqliteHandler();
		mSqliteReader.openDatabase(DB_NAME);
		JframeHome obj2 = new JframeHome();

		// sql = tfSql.getText().toString().replace(';', ' ').trim();
		sql = "select * from all_cric_teams";
		// rs = SqliteAdapter.getResultSet(sql, "cric.db");
		// try {
		// rs = mSqliteReader.runQuery(sql);
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// int totalItem = mSqliteReader.getTotalItem("words");
		//
		// System.out.println(totalItem);
		//JOptionPane.showMessageDialog(null, "WelCome To My Project");

		JTextField trans_id1 = new JTextField(20);
		obj2.mainJframe();

	}
	public String[] checked(String a) {
		
		String[] words = a.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		String stringcheck[]=new String[100];
		String stringWrong[]=new String[100];
		String stringright[]=new String[100];
		for(int i=0;i<stringWrong.length;i++)
		{
			stringWrong[i]=" ";
		}
		
		for(int i=0,j=0;i<words.length;i++)
		{
			boolean b = mSqliteReader.isWord(TABLE_NAME,words[i]);
			stringcheck[i]=Boolean.toString(b);
			
			if (stringcheck[i] == "false") {
				stringWrong[j]=words[i];
				j++;
			} else if(stringcheck[i] == "true"){
				
			}
		//System.out.println(b);
	}
		return stringWrong;
		
		}
	
}



//char chararray[]=new char[100];
//int k=0;
//int pp=0;
//char bb[]=new char[100];
//chararray=a.toCharArray();
//for(int i=0;i<a.length();i++)
//{	
//	pp=0;
//	if(chararray[i]==' ')
//	{
//		int iam=i;
//		for(int j=k;j<iam;j++)
//		{
//			bb[pp]=chararray[j];
//			pp++;
//		}
//		String output2 = String.valueOf(bb);
//		output2=output2.replaceAll(" ","");
//		System.out.println(output2+"\n");
//		k=iam;
//	}
//		
//	//System.out.println(chararray);
//}
