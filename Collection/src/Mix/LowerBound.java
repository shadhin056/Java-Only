package Mix;
import java.util.*;;
public class LowerBound {

	public static void main(String[] args) {
		List<Number> in = new ArrayList();
		in.add(new Integer(3));
		in.add(new Integer(5));
		in.add(new Integer(4));
		add(in);
		System.out.println(in);
	}

	public static void add(List<? super Integer> in) {
		in.add(new Integer(50));
		
	}

}
