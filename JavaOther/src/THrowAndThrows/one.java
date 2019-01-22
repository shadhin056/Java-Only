package THrowAndThrows;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		int x=1;
		Scanner a = new Scanner(System.in);
		do{
		try{
		System.out.println("enter two number : ");
		int n= a.nextInt();
		int m= a.nextInt();
		int sum = n/m;
		System.out.println(sum);
	}
		catch(Exception e)
		{
			System.out.println("you can do that fix that");
		}
		}while(x==1);
}}
