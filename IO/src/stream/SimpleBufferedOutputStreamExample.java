package stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleBufferedOutputStreamExample {

	public static void main(String[] args) {

		try {

			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("D:\\ONLINE\\Dropbox\\ImportanT\\f1.txt"));
			
			String s="i love you";
			bout.write(s.getBytes());
			bout.flush();
			bout.close();
			System.out.println("success");

		} catch (IOException ex) {

			ex.printStackTrace();

		}

	}

}
