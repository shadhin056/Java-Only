package file;

import java.io.File;

public class Rename {

	public static void main(String[] args) {
		File oFile=new File("D:\\ONLINE\\Dropbox\\ImportanT\\f2.txt");
		File nFile=new File("D:\\ONLINE\\Dropbox\\ImportanT\\f22.txt");
		if(oFile.renameTo(nFile))
		{
			System.out.println("rename successful");
		}else {
			System.out.println("rename failed");
		}

	}

}
