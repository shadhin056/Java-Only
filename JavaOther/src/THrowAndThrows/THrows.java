package THrowAndThrows;

public class THrows {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code .....");

	}

}
