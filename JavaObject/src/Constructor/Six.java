package Constructor;
public class Six {
	public static void main(String[] args) {
		AAAA objC = new AAAA();
	}
}
class AAAA {
	 public AAAA() {
		System.out.println("constructor A");
	}
}
class BBBB extends AAAA {
	 public BBBB() {
		System.out.println("constructor B");
	}
}

class C extends BBBB {
	 public C() {
		System.out.println("constructor C");
	}
}