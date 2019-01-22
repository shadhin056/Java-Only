package Method;

import java.util.Scanner;
import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		String name;
		System.out.println("enter name");
		name = v.nextLine();
		twoo obj = new twoo();
		obj.setName(name);
		obj.saying();
	}
}

 class twoo {
	private String name;
	public void setName(String name2)
	{
		name =name2; 
	}
	public String getName()
	{
		return name;
	}
		public void  saying()
		{
			System.out.println(getName());
		}
}
