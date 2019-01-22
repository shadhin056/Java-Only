package StringFunction;

public class matches {

	public static void main(String[] args) {
		 String a = "Welcome to Tutorialspoint.com";
		 System.out.println(a.matches("(.*)Welcome(.*)"));
		 System.out.println(a.matches("(.*)Welcome"));
		 System.out.println(a.matches("Welcome(.*)"));
		 
	}

}
