package Static;
public class Count {
	public static void main(String[] args) {
		Countt objOne=new Countt(" ami "," tumi ");
		Countt objOne2=new Countt(" she "," hhh ");
		System.out.println(Countt.getc());
		System.out.println(objOne.getc());
	}
}
 class Countt {
	private String a;
	private String b;
	private static int  c=0;
	public Countt (String aa,String bb)
	{
		a=aa;
		b=bb;
		c++;
		System.out.println("constructor for"+a+"and "+b+" and "+c);
	}
	public static int  getc()
	{
		return c;
	}
}
