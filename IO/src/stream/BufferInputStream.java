package stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("D:\\ONLINE\\Dropbox\\ImportanT\\f1.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		try {
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);

			}
			fin.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
