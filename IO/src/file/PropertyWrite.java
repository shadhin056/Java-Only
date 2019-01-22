package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyWrite {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		OutputStream o=null;
		try {
			o=new FileOutputStream("config.properties");
		p.setProperty("database", "localhost");
		p.setProperty("shadhin", "2012");
		
		p.store(o, null);
		System.out.println("ok");
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
