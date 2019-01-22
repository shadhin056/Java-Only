package Static;
public class ConstructorStatic2 {
	public static void main(String[] args) {
		ami objC=new ami();
		ami objC2=new ami();
	}
}
 class ami {
	static int id;
	static {
		id=0;
		System.out.println("static block");
	}
	public ami() {
		id++;
		System.out.println("Constructor "+id);
	}
}

