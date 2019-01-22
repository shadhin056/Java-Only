package Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayReturn {
	public static final Random random = new Random();

	public static int[] getarray(int a) {
		int n[] = new int[a];
		// Scanner scanner=new Scanner(System.in);
		// for(int i=0;i<n.length;i++)
		// {
		// n[i]=scanner.nextInt();
		// }
		for (int i = 0; i < n.length; i++) {
			n[i] = random.nextInt(100);
		}
		return n;
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		int b[] = getarray(n);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
