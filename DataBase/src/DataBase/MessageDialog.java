package DataBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Date;
public class MessageDialog {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat ft = new SimpleDateFormat("dd-mm-yyyy");
		JOptionPane.showMessageDialog(null,"Student are not supposed to be quiet");
		
		String s = JOptionPane.showInputDialog(null,"Enter The Value : \n","Input Dialog",JOptionPane.PLAIN_MESSAGE);
		
		if ((s!=null) &&  (s.length()>0))
		{
			Integer i = Integer.parseInt(s) ;
			JOptionPane.showInputDialog(null,"you enter",+i);
			return ;
		}
		else {
			JOptionPane.showInputDialog(null,"you enter nothing");
		}
		}
	}