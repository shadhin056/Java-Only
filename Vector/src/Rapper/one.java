package Rapper;

import java.util.Vector;

public class one {

	public static void main(String[] args) {
		Vector v =new Vector();
		int Roll=101;
		String Name= "shadhin";
		float Mark=3.5f;
		char grade ='A';
		boolean pass=true;
		
		Integer R=new Integer( Roll);
		Float   M=new Float(Mark) ;
		Character G=new Character(grade);
		Boolean P=new Boolean(pass);
		
		v.addElement(R);
		v.addElement(Name);
		v.addElement(M);
		v.addElement(G);
		v.addElement(P);
		
		System.out.println("List of Vector element :");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		

	}

}
