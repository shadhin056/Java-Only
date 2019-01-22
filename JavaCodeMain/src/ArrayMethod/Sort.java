package ArrayMethod;
import java.util.Arrays;
public class Sort {

	public static void main(String[] args) {
		int[] a = { 3, 2, 4, 1 };
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("out");
		System.out.println(a[a.length-1]);

	}

}
