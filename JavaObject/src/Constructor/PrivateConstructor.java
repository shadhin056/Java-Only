package Constructor;

public class PrivateConstructor {
	private PrivateConstructor() {
	}

	static public PrivateConstructor get() {
		return new PrivateConstructor();
	}

	public void ami() {
		System.out.println("ami");
	}

	public static void main(String[] args) {
		PrivateConstructor obj = new PrivateConstructor();
	}
}

class Another {
	public static void main(String[] args) {
		PrivateConstructor obj1 = PrivateConstructor.get();
		obj1.ami();

	}
}