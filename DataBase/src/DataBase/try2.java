package DataBase;

import javax.swing.JOptionPane;

public class try2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to Software Database");
		String quan = JOptionPane.showInputDialog("Quantiy");
		String pri = JOptionPane.showInputDialog("Price");
		int q = Integer.parseInt(quan);
		int p = Integer.parseInt(pri);
	    
		int 	Max=q*p;
		JOptionPane.showMessageDialog(null, Max);
	}

}
