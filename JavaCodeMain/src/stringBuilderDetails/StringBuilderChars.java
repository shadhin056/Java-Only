// Fig. 16.12: StringBuilderChars.java
// StringBuilder methods charAt, setCharAt, getChars and reverse.
//page 690
package stringBuilderDetails;

public class StringBuilderChars {
	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("hello there");
		System.out.println(buffer);
		System.out.println("Character at 0 : "+buffer.charAt(0));
		System.out.println("Character at 4 : "+buffer.charAt(4));
		
		/*System.out.printf("buffer = %s\n", buffer.toString());
		System.out.printf("Character at 0: %s\nCharacter at 4: %s\n\n", buffer.charAt(0), buffer.charAt(4));
*/
		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		/*
		 * (line 17) copies characters from a StringBuilder into the character
		 * array passed as an argument. This method takes four arguments—the
		 * starting index from which characters should be copied in the
		 * StringBuilder, the index one past the last character to be copied
		 * from the StringBuilder, the character array into which the characters
		 * are to be copied and the starting location in the character array
		 * where the first character should be placed.
		 */

		System.out.println("The characters are: ");
		for(int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]+" ");
		}
		
		/*for (char character : charArray)
			System.out.print(character);*/

		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6, 'T');
		buffer.setCharAt(4, '5');
		
		System.out.printf("\n\nbuffer = %s", buffer.toString());

		buffer.reverse();
		
		System.out.printf("\n\nbuffer = %s\n", buffer.toString());
	} // end main
} // end class StringBuilderChars
