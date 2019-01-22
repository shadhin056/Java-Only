package one;

public class DoSum {
	public static int sum1=10;

	public static void main(String[] args) {
		int a = 10, b = 5;
		DoSum obj = new DoSum();
		sum1 = obj.sum(a, b);
		
		System.out.println(sum1);
	}

	public int sum(int a, int b) {
		int c ;
		c = a + b;
		return c;

	}

}
