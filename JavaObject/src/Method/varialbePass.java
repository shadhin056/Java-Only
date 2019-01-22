package Method;

import java.util.Scanner;
import java.util.Scanner;

public class varialbePass {

	public static void main(String[] args) {
		Scanner v= new Scanner(System.in);
		Twooo objTwo =new  Twooo();
		System.out.println("enter your name");
		String name;
		name = v.nextLine();
		objTwo.two1(name);
	}
}


 class Twooo {
	public void  two1(String name)
	{
		System.out.println(name);
	}
	
}
