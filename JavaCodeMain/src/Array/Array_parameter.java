package Array;

class Array_parameter {
	
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		printaraay(a);
		retur(a);
		printaraay(retur(a));
	}
	/**
	 * This is a simple program
	 * 
	 * 
	 * @param a
	 */
	public static void printaraay(int[] a) {
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
	}

	public static int[] retur(int[] aa) {
		int b[] = aa;
		return b;
	}
}