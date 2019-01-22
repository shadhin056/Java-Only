package ArrayMethod;

import java.util.Arrays;

public class fill {

	public static void main(String[] args) {
		int[] a = { 3, 4, 2, 1 };
		System.out.println(Arrays.toString(a));
		Arrays.fill(a, 9);
		System.out.println(Arrays.toString(a));
	}

}
