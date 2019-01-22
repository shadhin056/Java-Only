package Generic;

public class GenericMethod {
	public static <E> void print(E[] inputarray) {
		for (E e : inputarray) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 2 };
		Double[] doubles = { 1.2, 2.3, 3.2 };
		Character[] characters = { 'b', 'g', 'd' };
		int a[]=new int[2];
		print(integers);
		print(doubles);
		print(characters);
		
	}

}
