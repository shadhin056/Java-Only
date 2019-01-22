package nestedClass;

public class InnerClassNonStaticMember {

	private int data = 30;

	// member
	class Inner {
		void msg() {
			System.out.println("Data is " + data);
		}
	}

	void display() {
		Inner obj = new Inner();
		// InnerClassNonStaticMember.Inner obj = new
		// InnerClassNonStaticMember.Inner();
		obj.msg();
	}

	public static void main(String[] args) {

		InnerClassNonStaticMember obj1 = new InnerClassNonStaticMember();
		obj1.display();
	}

}
