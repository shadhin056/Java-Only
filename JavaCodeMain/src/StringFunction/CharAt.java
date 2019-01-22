package StringFunction;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {
		String a= "ami who";
		System.out.println(a.charAt(2));
		Scanner s=new Scanner(System.in);
		String aa = s.nextLine();
		for(int i=0;i<aa.length();i++)
		{
			System.out.println(aa.charAt(i));
		}
	}

}
