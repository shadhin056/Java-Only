package Generic;

public class Return {

	public static void main(String[] args) {
		System.out.println(max('a', 'b', 'c'));
		
		System.out.println(max(10, 20, 30));
	}
	public static <T extends Comparable<T>> T max (T a,T b,T c)
	{
		T m = a;
		if(b.compareTo(a)>0)
		{
			m=b;
		}
		if(c.compareTo(m)>0)
		{
			m=c;
		}
			return m;
		
	}
}
