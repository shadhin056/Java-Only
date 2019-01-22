package getSetMethod;

public class two {
	private int hour;
	private int min;
	private int sec;
	
	public two(int a,int b,int c) {
		hour=a;
		min=b;
		sec=c;
	}
	public  void Print()
	{
		System.out.println(""+hour+min+sec);
	}
	//...................................
	
	public static void main(String[] args) {
		two obj=new two(1,2,3);
		obj.Print();
	}
}
