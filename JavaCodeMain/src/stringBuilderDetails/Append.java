package stringBuilderDetails;

public class Append {

	public static void main(String[] args) {
		/*
		 * String string1 = "hello "; String string2 = " BC "; int value = 22;
		 * String string=string1+string2+value;
		 */

		String string = new StringBuilder().append("Hello").append("Bc").append(22).toString();
		System.out.println(string);

		// string =string + "!";
		string = new StringBuilder().append(string).append("!").toString();
		System.out.println(string);

	}

}
