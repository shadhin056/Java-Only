package tostring;
 class one {
	private int day;
	private int month;
	private int year;

	public  one(int aa,int bb,int cc)
	{
		day=aa;
		month=bb;
		year=cc;
		System.out.printf("the constructor %s",this);
	}
	public String toString()
	{
		return String.format("%d/%d/%d",day,month,year);
	}
//..............................................................
	public static void main(String[] args) {
	     one obj=new one(5,4,6);
	     System.out.println("  HIIII");
		}
}


