package file2;

import java.util.Formatter;

public class CreateAFile {

	public static void main(String[] args) {
		final Formatter x;
		try {
			 x = new Formatter("shadh.txt");
			System.out.println("you create a file");
		}
		catch (Exception e)
		{
			System.out.println("you got an error");
		}
	}

}
