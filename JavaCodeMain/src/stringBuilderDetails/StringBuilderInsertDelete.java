package stringBuilderDetails;
// Fig. 16.14: StringBuilderInsertDelete.java

// StringBuilder methods insert, delete and deleteCharAt.

public class StringBuilderInsertDelete {
	public static void main(String[] args) {
		Object objectRef = "hello";
		String string = "goodbye";
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
		boolean booleanValue = true;
		char characterValue = 'K';
		int integerValue = 7;
		long longValue = 10000000;
		float floatValue = 2.5f; // f suffix indicates that 2.5 is a float
		double doubleValue = 33.333;

		StringBuilder buffer = new StringBuilder();

		buffer.insert(0, objectRef);
		buffer.insert(5, " "); // each of these contains new line
		buffer.insert(6, string);
		buffer.insert(6, "  ");
		buffer.insert(6, charArray);
		buffer.insert(6, "  ");
		buffer.insert(6, charArray, 3, 3);
		buffer.insert(6, "  ");
		buffer.insert(6, booleanValue);
		buffer.insert(6, "  ");
		buffer.insert(6, characterValue);
		buffer.insert(6, "  ");
		buffer.insert(6, integerValue);
		buffer.insert(6, "  ");
		buffer.insert(6, longValue);
		buffer.insert(6, "  ");
		buffer.insert(6, floatValue);
		buffer.insert(6, "  ");
		buffer.insert(6, doubleValue);

		//System.out.printf("buffer after inserts:\n%s\n\n", buffer.toString());
		System.out.println("buffer after inserts:\n"+ buffer.toString());
		buffer.deleteCharAt(19); // delete 1
		
		System.out.println("buffer after deletes: \n"+buffer);
		//System.out.printf("buffer after deletes:\n%s\n", buffer.toString());
		buffer.delete(6,26); // delete .333 in 33.333
		System.out.println("buffer after deletes: \n"+buffer);
	} // end main
} // end class StringBuilderInsertDelete