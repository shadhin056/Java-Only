package Static;

public class My {
	static int ami;
	//ami=ami+1;
	{
		ami++;
		System.out.println("ammmmm"+ami);
	}
	
	public static void main(String[] args) {
		System.out.println(ami);
		My sMy=new My();
		System.out.println(ami);
	}
}
