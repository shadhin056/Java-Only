package Array;
import java.util.Scanner;

public class Size_fixed {
	public static void main(String[] args) {
		
		Scanner S =new Scanner(System.in);
		
		System.out.println("Enter size of integer number :");
		int n=S.nextInt();
		int a[]=new int[n];

		for(int i=0;i<a.length;i++)
	{
		a[i]=S.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	}
	

}
