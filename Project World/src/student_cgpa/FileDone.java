package student_cgpa;

import java.io.File;
import java.util.Scanner;


public class FileDone {

private Scanner x;
	public void openfile()
	{
		try {
			x= new Scanner(new File("shadhi.txt"));
		}
    catch(Exception e)
		{
    	System.out.println("you got an error");
		}
	}
	public void readfile()
	{
		while (x.hasNext())
		{
			String a = x.next();
			String b = x.next();
			String c = x.next();
			String d = x.next();
			
			System.out.println(a +" "+ b+" " + c+" " +d);
		}
	}
	public void closefile()
	{
		x.close();
	}
	}

