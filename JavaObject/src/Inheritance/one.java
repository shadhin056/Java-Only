package Inheritance;

public class one {
	public static void main(String[] args) {
		C objc = new C();
		objc.ne();
	}
}

class D {
	private final int d=5;
	public final void Eat() {
		System.out.println("I m from D and Eat function");
	}
}

class C extends D {
int c=3;
int d=4;
 public void ne ()
 {
	 System.out.println("hi it is d = "+d);
 }
}

class B extends C {
	
	int b=5;
//	@Override
//	public void Eat() {
//		System.out.println("I m from D and Eat function");
//	}
	
}
// HERE C super/base Class.
// Here B derived class /  inherited class
 
 
 