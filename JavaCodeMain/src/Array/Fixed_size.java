package Array;

import java.util.Scanner;

public class Fixed_size {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		Scanner S =new Scanner(System.in);
	System.out.println("Enter 5 integer number :");
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
