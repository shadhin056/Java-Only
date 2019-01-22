package Object;

public class Passing {
    static int x;
	String y;
	public Passing(int x , String y)
	{
		this.x=x;
		this.y=y;
	}
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		extra obj=new extra();
		Passing objp=new Passing(10, "20");
		obj.doxx(objp);
		obj.doMM(x);
	}
}
class extra {
	void doxx(Passing rr)
	{
		rr.sum(5,6);
	}
	void doMM(int s)
	{
		
	}
}
