package Mix;

import java.util.*;;

public class UnboundWildCard {
	
	

	public static void main(String[] args) {
		List<Integer> in = new ArrayList();
		in.add(new Integer(3));
		in.add(new Integer(5));
		in.add(new Integer(4));
		Pro(in);
		List<Double> d = new ArrayList();
		d.add(new Double(3.3));
		d.add(new Double(5.4));
		d.add(new Double(4.5));
		Pro(d);
	}

	private static void Pro(List<?> in) {
		for (Object object : in) {
			System.out.println(object);
		}
		
	}

}
