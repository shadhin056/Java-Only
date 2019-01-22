package Static;
public class ConstructorStatic {
	public static void main(String[] args) {
		text objText = new text();
	}
}
class text {
	static int id;
	static {
		id = 100;
		System.out.println("I m first");
	}
	public text() {
		System.out.println("I m 2nd");
	}
}