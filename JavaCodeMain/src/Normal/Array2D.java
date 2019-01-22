package Normal;
import java.util.Scanner;
import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) {
		
Scanner v = new Scanner(System.in);
int a,b;
System.out.println("Enter row :");
	a= v.nextInt();
System.out.println("Enter coloum :");
	b= v.nextInt();
	
	int c[][]=new int[a][b];	
	
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			c[i][j]=v.nextInt();
		}
	}
	//............................
	System.out.println("output");
	for(int i=0;i<c.length;i++)
	{
		for(int j=0;j<c[i].length;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println("\n");	
	}
	}
}
