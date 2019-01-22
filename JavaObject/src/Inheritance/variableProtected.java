package Inheritance;
public class variableProtected {
	public static void main(String[] args) {
		Result objResult=new Result();
		objResult.getdata();
		objResult.display();
	}
}
//...........................................
 class superClass {
	protected int roll;
	protected String name;
}
//...........................................
class Exam extends superClass{
	protected  float mark;
	void getdata()
	{	
		roll=101;
		name="who";
	}
}
//...........................................
class Result extends Exam{
	float mark;
	void getdata()
	{
		mark=75;
	}
	void display()
	{
		super.getdata();
	System.out.println(mark);
	System.out.println(roll);
	System.out.println(name);
	}
}
