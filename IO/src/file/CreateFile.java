package file;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		try {
			File f = new File("D:\\ONLINE\\Dropbox\\ImportanT\\f2.txt");
			if (f.createNewFile()) {
				System.out.println("File is created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
