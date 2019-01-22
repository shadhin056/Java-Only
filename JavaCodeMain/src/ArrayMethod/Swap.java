package ArrayMethod;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] a = { 3, 4, 2, 1 };
		int temp=a[0];
		a[0]=a[1];
		a[1]=temp;
		System.out.println(a[0]+" "+a[1]);
	}

}
