package begin;

import java.util.Vector;

public class copyInto {

	public static void main(String[] args) {
		Vector v =new Vector();

			v.addElement("ami");
			v.addElement("tomake");
			v.addElement("chai");
		int l=v.size();
		String[] C=new String[l];
		//copy into array
		v.copyInto(C);
		
		for(int i=0;i<l;i++)
		{
			System.out.println(C[i]);
		}

	}

}
