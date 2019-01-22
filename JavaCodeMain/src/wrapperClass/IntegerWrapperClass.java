package wrapperClass;

public class IntegerWrapperClass {

	public static void main(String[] args) {
		Integer obj1 = new Integer(25);
		Integer obj2 = new Integer("25");
		Integer obj3 = new Integer(35);

		System.out.println(obj1.compareTo(obj2));
		System.out.println(obj1.compareTo(obj3));

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));

	}

}
