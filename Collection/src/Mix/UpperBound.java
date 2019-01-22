package Mix;

import java.util.*;;

public class UpperBound {
	

	public static void main(String[] args) {
		List<Integer> in = new ArrayList();
		in.add(new Integer(3));
		in.add(new Integer(5));
		in.add(new Integer(4));
//		Pro(in);
		/*List<Double> d = new ArrayList();
		d.add(new Double(3.3));
		d.add(new Double(5.4));
		d.add(new Double(4.5));*/
//		Pro(d);
		Double d=Pro(in);
	System.out.println(d);
	}

	private static double Pro(List<? extends Number> in) {
		double sum =0;
		for (Number object : in) {
			sum=sum+object.doubleValue();
		}
		System.out.println(sum);
           return sum;
		
	}

}
