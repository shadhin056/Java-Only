package DataBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Date;
public class TRY {

	public static void main(String[] args) throws ParseException{
		
		JOptionPane.showMessageDialog(null,"Student are not supposed to be quiet");
		
		String a = JOptionPane.showInputDialog(null,"Enter The 1st Value : \n","Input Dialog",JOptionPane.PLAIN_MESSAGE);
		String b = JOptionPane.showInputDialog(null,"Enter The 2nd Value : \n","Input Dialog",JOptionPane.PLAIN_MESSAGE);
		String o = JOptionPane.showInputDialog(null,"Enter The operator : \n","Input Dialog",JOptionPane.PLAIN_MESSAGE);

		if ((a!=null) &&  (a.length()>0))
		{
			Integer aa = Integer.parseInt(a) ;
		}
		else if ((b!=null) &&  (b.length()>0))
		{
			Integer bb = Integer.parseInt(b) ;
		}
		else {
			JOptionPane.showInputDialog(null,"you enter nothing");
		}
		
		Integer aa = Integer.parseInt(a) ;
		Integer bb = Integer.parseInt(b) ;
		
		switch(o)
		{
		case "+":
			
			JOptionPane.showInputDialog(null,"Add",+aa+bb);
			break;
		case "-":
			
			JOptionPane.showInputDialog(null,"Subtruction",+aa-bb);
			break;
		case "*":
			JOptionPane.showInputDialog(null,"Multiplication",+aa*bb);
			break;
		case "/":
			JOptionPane.showInputDialog(null,"Division",+aa/bb);
			break;
		}
		}
}