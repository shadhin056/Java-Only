package begin;

import java.util.Vector;

public class removeAndremoveAll {
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
		v.removeElement("Rima");
   System.out.println("\n   after");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.print(v.get(i)+" ");
		}
	//v.removeAll(v);
		v.removeAllElements();
	   System.out.println("\n   Size of V is now : "+v.size());
		
	}
}
