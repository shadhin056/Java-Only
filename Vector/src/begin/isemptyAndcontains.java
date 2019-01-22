package begin;
import java.util.Vector;
public class isemptyAndcontains {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.addElement("ami");
		v.addElement("tumi");
		v.addElement("she");
		
		boolean i=v.isEmpty();
		System.out.println(i);
		boolean j=v.contains("ami");
		System.out.println(j);
	}

}
