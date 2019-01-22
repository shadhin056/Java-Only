package Rapper;

import java.util.Vector;

public class StringObject {

	public static void main(String[] args) {
		Vector v=new Vector();
		int Roll=101;
		String Name= "shadhin";
		float Mark=3.5f;
		
		String s1,s2;
		s1=Integer.toString(Roll);
		s2=Float.toString(Mark);
		v.addElement(Name);
//		v.addElement(s1);
//		v.addElement(s2);
		v.addElement(Roll);
		v.addElement(Mark);
		
		System.out.println("List of Vector element :");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
	}

}
