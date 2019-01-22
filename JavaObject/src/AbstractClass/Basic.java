package AbstractClass;

abstract class A {
	int a;
	abstract void callme();
	void callmetoo() {
		System.out.println("This is a concrete method");
	}
}

class B extends A {
	@Override
	void callme() {
		System.out.println("ok overide");
	}
}
/*
 * this is just try
 * 
 * 
 */
public class Basic {
	public static void main(String[] args) {
		B obj = new B();
		obj.callme();
		obj.callmetoo();

	}

}
