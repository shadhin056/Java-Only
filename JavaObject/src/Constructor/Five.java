package Constructor;

public class Five {
	public static void main(String[] args) {
		B obj2= new B();
		B obj = new B(10, 20);
	}
}
class A {
	int integerA = 1;

	public A() {
		System.out.println("inside A constructor");
	}

	public A(int no) {
		System.out.println("inside A constructor with para");
		integerA = no;
	}
}
class B extends A {
	int integerB = 20;

	public B() {
		System.out.println("inside B constructor");
	}

	public B(int no1, int no2) {
		super(no1);
		integerB = no2;
		System.out.println("integer A   " + integerA);
		System.out.println("integer B   " + integerB);
	}
}