package Polymorphism;
public class two {

	public static void main(String[] args) {
		person p1=new person();
		student s1=new student();
		person p2=new student();
		
		System.out.println(p2.age);
	}
}
	class person
	{
		String name;
		int age =5;
		String adresString;
	}
	class student extends person
	{
		int marks;
		int roll;
	}