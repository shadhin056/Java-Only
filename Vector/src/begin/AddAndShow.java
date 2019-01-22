package begin;

import java.util.Vector;

import javax.lang.model.element.Element;

public class AddAndShow {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.addElement("ami");
		v.addElement("tumi");
		v.addElement("she");
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
	}
}
