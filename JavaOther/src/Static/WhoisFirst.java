package Static;

public class WhoisFirst {	
	static {
		System.out.println("i m first");
	}

	public static void main(String[] args) {
		System.out.println("i m last");
	}
	static {
		System.out.println("i m second ");
	}

}
