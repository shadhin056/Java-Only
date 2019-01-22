package converter;

public class StingToChar {

	public static void main(String[] args) {
		String string="WelCome";
		char a[]=new char[10];
		for(int i=0;i<string.length();i++)
		{
			a[i]=(char)string.charAt(i);
		}
		for(int i=0;i<string.length();i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}
