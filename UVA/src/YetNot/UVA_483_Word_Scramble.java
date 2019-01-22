package YetNot;

import java.util.Scanner;
public class UVA_483_Word_Scramble {

	public static void main(String[] args) {
		char[] a=new char[100];
		Scanner s=new Scanner(System.in);
		
		 while((a=s.next().toCharArray())!=null)
		    {
			 
			 int l,i,k;
		        l=a.length;
		        for(i=l-1;i>=0;i--)
		        {
		        	System.out.print(a[i]);
		        }
		        System.out.print(" ");
		}
		 System.out.println();
	}

}
