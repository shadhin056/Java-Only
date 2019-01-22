package two;

import java.util.Scanner;
 
public class TestScanner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("Total is "+(x+y));
	}

}
