package variableLengthArgument;

public class Main {
	public static void test(int some , String ... args)
	{
		System.out.println(some);
		for(String arg:args)
		{
			System.out.print (" "+arg);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		test(2012, "Dhaka");
		test(2013, "Dhaka","khulna");
	}

}
