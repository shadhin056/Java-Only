package ArrayMethod;

import java.util.Arrays;

public class swapParameter {
	
	public static void main(String[] args) {
		int a[]={10,20,30};
		System.out.println(Arrays.toString(a));
		swapParameter(a,1,0);
		System.out.println(Arrays.toString(a));
	}

	private static void swapParameter(int[] a, int i, int j) {
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		
	}

}
