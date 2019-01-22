package Polymorphism;
public class three {
	public static void main(String[] args) {
//		//B obj = new B();
//		//C obj = new B();
//		
//		C obj[] = new C[2];
//		 obj [0]=new A();
//		 obj [1]=new C();
//		 for(int i=0;i<2;i++)
//		 {
//			 obj[i].eat();
//		 }
		
		D obj = new D();
		C obj2 = new C();
		C obj3 = new B();
		obj.digest(obj2);
		obj.digest(obj3);
	}
}

 class D {
		public void digest(C x)
		{
			x.eat();
		}
}

 class C {
	void eat()
	{
		System.out.println("This C is great");
	}
}

 class B extends C{
	void eat()
	{
		System.out.println("This B is great");
	}
}

 class A extends B{
	void eat()
	{
		System.out.println("This A is great");
	}
}



