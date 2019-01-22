package unitTest;
import java.util.Scanner;
public class Calculation {
	
	public static void main(String[] args) {
		double a,b;
		Scanner s=new Scanner(System.in);
		a = s.nextDouble();
		b = s.nextDouble();
		double add,mul,min,div;
		add=add(a,b);
		min=minus(a, b);
		mul=multiple(a, b);
		div=divided(a, b);
		
		System.out.println(add+" "+mul+" "+min+" "+div);
	}
	
	
	public static double add (double a , double b)
	{
		return a+b;
		
	}
	public static double minus (double a , double b)
	{
		return a-b;
		
	}
	public static double multiple (double a , double b)
	{
		return a*b;
		
	}
	public static double divided (double a , double b)
	{
		return a/b;
		
	}

}
