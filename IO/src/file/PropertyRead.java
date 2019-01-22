package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyRead {
	
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		InputStream i=null;
		
		try {
			i=new FileInputStream("config.properties");
		p.load(i);
		System.out.println(p.getProperty("database"));
		System.out.println(p.getProperty("shadhin"));
		Enumeration<?> e=p.propertyNames();
		while (e.hasMoreElements()) {
			String key=(String) e.nextElement();
			String value=p.getProperty(key);
			System.out.println(key+" ="+value);
		}
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
