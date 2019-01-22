package Final;
public class one {
	public static void main(String[] args) {
		on objOn =new on();
		objOn.Math();
	}
}

 class on {
	private int a=1;
	private final int fi=5;
	public void Math()
	{
	for(int i=0;i<5;i++)
	{
		a=a+10*fi;
	System.out.println(a);
	}
	}
}
