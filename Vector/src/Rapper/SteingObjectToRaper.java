package Rapper;

import java.util.Vector;

public class SteingObjectToRaper {

	public static void main(String[] args) {
		Integer Roll = 1;
		String Name="shadhin";
		Float mark= 3f;
		
		String R="101";
		String N="SHADHIN";
		String M="303";
		Roll= Integer.valueOf(R);
		mark=Float.valueOf(M);
		Vector v= new Vector();
		
		v.addElement(Roll);
		v.addElement(Name);
		v.addElement(mark);
		
		
		System.out.println("List of Vector element :");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		
	}

}
