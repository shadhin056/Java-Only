package student_cgpa;

import java.io.File;
import java.util.Formatter;

public class FileWork {
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
		
		public void add(String name, String roll, String department, long grade)
		{
			x.format("%s %s %s %s \n",name,roll,department,grade);
		}
		public void close()
		{
			x.close();
		}

}
