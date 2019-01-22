package input;
/*who the hell are you
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerUse {

	public static void main(String[] args) throws IOException {
		int a;
		int b;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter two number : ");
		a = c.nextInt();
		b = c.nextInt();
		System.out.println("You Enter the two Number : " + a + "   " + b);
		
	}

}
