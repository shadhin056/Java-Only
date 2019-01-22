package Constructor;
import java.util.Scanner;
public class Two {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Twooooooo obj = new Twooooooo();
		System.out.println("Enter the first gf here : ");
		String temp = input.nextLine();
		obj.setName(temp);
		obj.saying();
	}
}
 class Twooooooo {
	private String girlname;
	public void setName(String name)
	{
		girlname =name;
		
	}
	public String getname()
	{
		return girlname ;
	}
	public void saying()
	{
		System.out.printf("your first gf was %s",getname());
	}
	
}
