package Array;

 class A{
	int a;
	String b;
	public A(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void showdata()
	{
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		}
}


public class ObjArray {

	public static void main(String[] args) {
		A obj[] =new A[2];
		obj[0]=new A(5, "AMi");
		obj[1]=new A(4, "Tumi");
		obj[0].showdata();
		obj[1].showdata();
		
		

	}

}
