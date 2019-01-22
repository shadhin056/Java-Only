package file2;

import java.io.File;
import java.util.Scanner;

class Read {
	private Scanner x;

	public void openfile() {
		try {
			x = new Scanner(new File("shadhi.txt"));
		} catch (Exception e) {
			System.out.println("you got an error");
		}
	}

	public void readfile() {
		while (x.hasNext()) {
			String a = x.next();
			String b = x.next();
			String c = x.next();

			System.out.println(a +" "+ b +" "+ c);
		}
	}

	public void closefile() {
		x.close();
	}
}

public class reading {
	public static void main(String[] args) {
		Read obj = new Read();
		obj.openfile();
		obj.readfile();
		obj.closefile();

	}
}
