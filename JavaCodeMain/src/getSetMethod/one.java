package getSetMethod;

public class one {
	private int hour;
	private int min;
	private int sec;
	
	public one(int a,int b,int c) {
		setHOUR(a);
		seMIN(b);
		setSEC(c);
	}
	public void setHOUR(int h)
	{
		hour=h;
	}
	public void seMIN(int m)
	{
		min=m;
	}
	public void setSEC(int s)
	{
		sec=s;
	}
	public int getHOUR()
	{
		return hour;
	}
	public int getMIN()
	{
		return min;
	}
	
	public int getSEC()
	{
		return sec;
	}
	public  void Print()
	{
		System.out.println(""+getHOUR()+getMIN()+getSEC());
	}
	//...................................
	
	public static void main(String[] args) {
		one obj=new one(1,2,3);
		obj.Print();
	}
}
