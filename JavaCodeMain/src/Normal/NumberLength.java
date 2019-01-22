package Normal;

public class NumberLength {
	public static void main(String[] args) {

		System.out.println(average(1,2,3,4,5,6));
	}
	public static int average(int... numbers)
	{
		int total=0,a = 0;
		for (int i=0;i<numbers.length;i++)
		{
			a=numbers[i]+a;
		}
		return a;
	}
}
