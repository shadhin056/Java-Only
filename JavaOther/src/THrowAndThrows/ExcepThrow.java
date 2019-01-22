package THrowAndThrows;

/*
 * we can throw either checked or unchecked exception.
 * throw =unchecked
 * checked = throws=custom
 */
public class ExcepThrow {
	/*
	 * static void validate(int age) { if(age<18) throw new ArithmeticException(
	 * "Not allowed");//unchecked else { System.out.println("welcome  to vote");
	 * } }
	 */
	static void validate(int age) throws ClassNotFoundException {
		if (age < 18)
			throw new ClassNotFoundException("Not allowed");// unchecked
		else {
			System.out.println("welcome  to vote");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13);
		}
		/*
		 * catch(ArithmeticException e) { System.out.println(e); }
		 */
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
