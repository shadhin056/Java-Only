package Static;
public class StaticAndnonStaticVariable {
	private static double a ;
	int b;
	private static final String c="shadh";
	void test()
	{	
		int e = 0;
		int ok=0;
		ok=ok+e;
		a=0;
		b=345;
	}
	public static void main(String[] args) {
		StaticAndnonStaticVariable s=new StaticAndnonStaticVariable();
		int d;
		s.b=0;
		StaticAndnonStaticVariable.a=0;
		a=10;
		System.out.println(a+s.b+c);
	}
}
