package StringFunction;

import java.io.*;

public class replaceAll {
	public static void main(String args[]) {
		String Str = new String("Welcome to Tutorialspoint.com");

		String c = Str.replaceAll("(.*)Tutorials(.*)", "AMROOD");

		System.out.println(c);
		String cc = Str.replaceAll("Tutorials", "AMROOD");
		System.out.println(cc);

	}
}