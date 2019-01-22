package Super;
public class one {

	public static void main(String[] args) {

		B obj = new B();
		obj.print();
	}

}

 class A {
	String name ="who ";
	public void print()
	{
		System.out.println(name);
	}
}

 class B extends A{
	int marks=100;
	public void print()
	{
		System.out.println(marks);
		super.print();
	}
}
