package staticConstructor;

class Basic {
	public Basic() {
		System.out.println("super");
	}
}

public class Main extends Basic {

	void someMethod() {
		System.out.println("Method in some");
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.someMethod();
	}

}
