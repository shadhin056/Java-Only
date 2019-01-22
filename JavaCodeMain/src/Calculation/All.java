package Calculation;
import java.util.Scanner;
public class All {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int a= scanner.nextInt();
		
		System.out.println("enter the operator :");
		scanner.nextLine();
		
		String  c=scanner.nextLine();
		
		System.out.println("Enter the 2nd number :");
		int b= scanner.nextInt();
		
		switch(c)
		{
		case "+":
			int out = a+b;
			System.out.println(out);
			break;
		case "-":
			int outt = a-b;
			System.out.println(outt);
			break;
		case "*":
			int outtt = a*b;
			System.out.println(outtt);
			break;
		case "/":
			int outttt = a/b;
			System.out.println(outttt);
			break;
		}
	}

}