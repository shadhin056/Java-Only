package student_cgpa;

import java.util.Formatter;
import java.util.Scanner;

public class InputTry {
	int subject;
	String subjectname []=new String[10];
	String subjectcode []=new String[10];
	int credit[]=new int[10];
	long gpa[]=new long[10];
	long cgpa[]=new long[10];
	long totalcredit = 0;
	long subg[]=new long[10];
	long total=0;
	long grade;
	private Formatter x;
	Scanner s=new Scanner(System.in);
	Student sobj=new Student();
	FileWork fobj=new FileWork();
	FileDone ffobj=new FileDone();
	
	
	public void inputinfo2()
	{
	System.out.println("+++++++++++++++++   ABOUT RESULT   +++++++++++++++++");
	System.out.println("HOW MANY SUBJECT IN HIS/ HER EXAM HE/SHE ATTEND  =   ");
	subject=s.nextInt();
	for(int i=0;i<subject;i++)
	{
		System.out.println("SUBJECT NAME =");
		subjectname [i]= s.nextLine();
		System.out.println("SUBJECT CODE =");
		subjectcode [i]=s.nextLine();
		System.out.println("CREDIT OF THAT SUBJECT ");
		credit [i]=s.nextInt();
		System.out.println("GPA OF THAT SUBJECT");
		gpa [i]=s.nextLong();
		totalcredit=totalcredit+credit[i];
		subg[i]=gpa[i]*credit[i];
		total=subg[i]+total;
	}
	grade=total/totalcredit;
	fobj.openFile();
	fobj.add(sobj.name,sobj.roll ,sobj.department,grade);
	fobj.close();
	ffobj.openfile();
	ffobj.readfile();
	ffobj.closefile();
}}
