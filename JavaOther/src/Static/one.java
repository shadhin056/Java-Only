package Static;

public class one {

	public static void main(String[] args) {
		System.out.println(subCC.id);
		System.out.println(subCC.my);
		System.out.println(subCC.c);
		System.out.println(subCC.Obj);
		subCC objCc=new subCC();
		
		
		System.out.println(subCC.getc());
	}
}

class subCC {
	static int id=100;
	static boolean my=true;
	static char c='A';
	static Object Obj=new Object();
//	public subCC() {
//		id++;
//	}
//	public static int  getc()
//	{
//		return id;
//	}
	//.........
	public subCC() {
		System.out.println(c);
		c++;
		System.out.println(c);
	}
	public static char  getc()
	{
		
		System.out.println("ami");
		return c;
	}
}
