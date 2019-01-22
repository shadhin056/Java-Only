package begin;
import java.util.Vector;
public class Capasity {

	public static void main(String[] args) {
		Vector v= new Vector();
		int c = v.capacity();
		System.out.println("Capasity of Vector is = "+c);
		v.ensureCapacity(50);
		System.out.println("Modified Capasity is = "+v.capacity());
		

	}

}
