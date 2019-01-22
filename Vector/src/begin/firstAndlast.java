package begin;
import java.util.Vector;
public class firstAndlast {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.addElement("ami");
		v.addElement("tumi");
		v.addElement("she");
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
	}

}
