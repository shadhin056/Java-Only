package file2;

import java.io.File;
import java.util.Formatter;

 class write {
		private Formatter x;
		public void openFile()
		{
			try {
				x =new  Formatter("shadhi.txt");
			}
			catch(Exception e){
				System.out.println("you have an error");
			}
		}
		
		public void add()
		{
			x.format("%s %s %s ","20"," new ","number");
		}
		public void close()
		{
			x.close();
		}
}

public class writing {
	public static void main(String[] args) {
		write obj=new write();
		obj.openFile();
		obj.add();
		obj.close();
	}
}
