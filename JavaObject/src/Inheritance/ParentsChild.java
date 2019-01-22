package Inheritance;

	class Parents//parents,super class
	{
		int a,b;
		void showab()
		{
			System.out.println("Value of a,b = "+a+" "+b);
		}
	}
	class Child extends Parents//sub ,child ,Inherited/class
	{
		int c;
		void showc()
		{
			System.out.println("Value of c = "+c);
		}
		void sum()
		{
			System.out.println("Value of Sum a+b+c = "+(a+b+c));
		}
	}
public class ParentsChild {
	public static void main(String[] args) {
		Parents pobj=new Parents();
		Child cobj=new Child();
		pobj.a=5;
		pobj.b=6;
		pobj.showab();
		cobj.c=10;
		cobj.a=5;
		cobj.b=6;
		cobj.showc();
		cobj.sum();
	}
}
