package Object;


public class ArrayList {

	public static void main(String[] args) {
		D objD =new D();
		A d = new A();
		objD.add(d);
	}
}

class D {
	private A[] thelist = new A[5];
	private int i =0;
	public void add (A d)
	{
		if (i<thelist.length)
		{
			thelist[i]=d;
			System.out.println("Dog added at index"+i);
			i++;
		}
	}
}

 class C extends D{

}

 class B extends C{

}

 class A extends B{

}
