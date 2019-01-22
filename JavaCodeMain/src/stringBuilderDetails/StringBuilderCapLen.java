package stringBuilderDetails;
 /*Fig. 16.11: StringBuilderCapLen.java
 StringBuilder length, setLength, capacity and ensureCapacity methods.*/

public class StringBuilderCapLen {
	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("Hello, how are you?");

		System.out.println(buffer.toString());
	    System.out.println("length :"+buffer.length());
	    System.out.println("Capacity :"+buffer.capacity());
	    
	    buffer.ensureCapacity(75);
		System.out.println("New capacity = "+buffer.capacity());
		buffer.setLength(10);
		System.out.println("New String = "+buffer.toString());
		
		/*System.out.printf("buffer = %s\nlength = %d\ncapacity = %d\n\n", buffer.toString(), buffer.length(),buffer.capacity());
		buffer.ensureCapacity(75);
		
		System.out.printf("New capacity = %d\n\n", buffer.capacity());

		buffer.setLength(10);
		System.out.printf("New length = %d\nbuffer = %s\n", buffer.length(), buffer.toString());
	*/} // end main
} // end class StringBuilderCapLen
