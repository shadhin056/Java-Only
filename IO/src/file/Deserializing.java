package file;

import java.io.*;

public class Deserializing {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Employee e = null;

		FileInputStream fileIn = new FileInputStream("D:\\ONLINE\\Dropbox\\ImportanT\\f1.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);

		e = (Employee) in.readObject();
		in.close();
		fileIn.close();

		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);

	}
}