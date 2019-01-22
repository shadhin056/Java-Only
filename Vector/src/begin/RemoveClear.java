package begin;

import java.util.Vector;

public class RemoveClear {
		public static void main(String[] args) {
			Vector v= new Vector();
			v.addElement("ami");
			v.addElement("tumi");
			v.addElement("she");
			
			for(int i=0;i<v.size();i++)
			{
				System.out.print(v.elementAt(i)+" ");
			}
			
			v.remove("ami");
			v.remove(1);
	   System.out.println("\n   after");
			
			for(int i=0;i<v.size();i++)
			{
				System.out.print(v.get(i)+" ");
			}
		
			v.clear();
		   System.out.println("\n   Size of V is now : "+v.size());
			

	}

}
