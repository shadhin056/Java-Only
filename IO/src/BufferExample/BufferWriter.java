package BufferExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		String s="my name is ";
		String ss="Shadhin";
		File file=new File("D:\\ONLINE\\Dropbox\\ImportanT\\new.txt");
		if(!file.exists())
		{
			file.createNewFile();
			FileWriter fw=new FileWriter(file,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(s);
			bw.newLine();
			bw.write(ss);
			bw.newLine();
			bw.close();
			System.out.println("Done");

		}
		else {
			System.out.println("File exists");
		}
		
		
	}

}
