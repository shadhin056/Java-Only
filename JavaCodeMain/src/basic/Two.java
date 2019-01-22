package basic;

public class Two {

	public static void main(String[] args) {
		double sum=0;
		for(int i=0;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		}
	System.out.println("Total is : " +sum);

	}

}
