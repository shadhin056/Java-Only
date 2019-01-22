package Normal;
import java.util.Scanner;

public class SUM {
	public static void main(String[] args) {
		int a[]=new int[10];
		int sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 10 numbers :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(int i = 0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("total  "+sum);
	}

}
