package BufferExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\ONLINE\\Dropbox\\ImportanT\\new.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);

			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		}
	}

}
