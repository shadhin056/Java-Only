package begin;

import java.util.Vector;

public class insertAndRemove {
	public static void main(String[] args) {
		Vector v= new Vector();
		v.addElement("ami");
		v.addElement("tumi");
		v.addElement("she");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.elementAt(i)+" ");
		}
		
		v.insertElementAt("Rima", 2);
   System.out.println("\n   after");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
		v.removeElementAt(0);
   System.out.println("\n   after");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
	}

}
