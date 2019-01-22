package StringFunction;

public class TrueCheck {

	public static void main(String[] args) {
		String a ="ami";
		String b ="ami";
		String c=new String("ami");
		//different
		if(a==b)
		{
			System.out.println("ok");
		}
		else 
		{
			System.out.println("Wrong");
		}
		if(a==c)
		{
			System.out.println("again ok");
		}
		else{
			System.out.println("again No");
		}
	}

}
