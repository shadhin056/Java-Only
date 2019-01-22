package String;

public class SentenceToWord {

	public static void main(String[] args) {

		String a = new String("My name is Shadhin");

		String[] words = a.split("\\s+");

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i] + " ");
		}

	}

}
