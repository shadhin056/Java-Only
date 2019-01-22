package nestedClass;

public class StaticNextedClass {
	
	static int data=30;
	static class Inner{
		void msg()
		{
			System.out.println(data);
		}
		static void msg2()
		{
			System.out.println(data);
		}
	}
	public static void main(String[] args) {
		Inner nInner=new Inner();
		nInner.msg();
		Inner.msg2();

	}

}
