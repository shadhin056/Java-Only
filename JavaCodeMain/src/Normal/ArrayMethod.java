package Normal;

public class ArrayMethod {
	public static void main(String[] args) {
		int a[]={3,5,4,6};
		change(a);
	}
	public static void change(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
}