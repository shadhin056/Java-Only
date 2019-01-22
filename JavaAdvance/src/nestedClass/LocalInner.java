package nestedClass;

public class LocalInner {
	private int data = 30;

	void display() {
		final int x = 50;//must be final
		class local {
			void msg() {
				System.out.println(x);
			}
		}
		local obj = new local();
		obj.msg();
	}

	public static void main(String[] args) {
		LocalInner obj1 = new LocalInner();
		obj1.display();

	}

}
