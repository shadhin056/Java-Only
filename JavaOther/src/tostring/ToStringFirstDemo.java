package tostring;

public class ToStringFirstDemo extends Object{
	String s1,s2;
	public ToStringFirstDemo(String st1,String st2)
	{
		this.s1=st1;
		this.s2=st2;
	}
	@Override
	public String toString()
	{
		return "["+s1+" "+s2+"]";
	}
	public static void main(String[] args) {
		ToStringFirstDemo tdf=new ToStringFirstDemo("Hello ", " World");
		System.out.println(tdf);
	}
}
