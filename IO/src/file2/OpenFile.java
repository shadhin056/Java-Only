package file2;
import java.io.File;
public class OpenFile {
	public static void main(String[] args) {
		File xFile = new File("D:\\ONLINE\\Dropbox\\CSE - WORLD\\Java File\\tx.txt");
		if(xFile.exists())
		{
			System.out.println(xFile.getName()+"    exist");
		}
		else {
			System.out.println("no");
		}
	}
}
