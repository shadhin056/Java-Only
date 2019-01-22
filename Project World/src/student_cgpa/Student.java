package student_cgpa;

import java.util.Formatter;
import java.util.Scanner;

public class Student {
	public String name;
	public String roll;
	public String department;
	Scanner s=new Scanner(System.in);
	InputTry inobj =new InputTry();
	public void inputinfo()
	{	System.out.println("Enter name :");
		name=s.nextLine();
		System.out.println("Enter Roll :");
		roll=s.nextLine();
		System.out.println("Enter Department :");
		department=s.nextLine();
		inobj.inputinfo2();
	}
	
}
