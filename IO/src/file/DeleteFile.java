package file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file=new File("D:\\ONLINE\\Dropbox\\ImportanT\\f1.txt");
		if(file.delete())
		{
			System.out.println(file.getName()+"is deleted");
		}
		else{
			System.out.println("failed");
		}

	}

}
