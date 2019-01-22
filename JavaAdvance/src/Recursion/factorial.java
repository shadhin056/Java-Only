package Recursion;

public class factorial {

	public static void main(String[] args) {
		
		System.out.println(fac(5));

	}
	public static  long fac(long a)
	{
		if(a<=1)
		{
			return 1;
		}
		else
		{	
			return a*fac(a-1);
			
		}
	}
}
	