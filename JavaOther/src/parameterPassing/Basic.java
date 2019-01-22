package parameterPassing;

public class Basic {
	public void shadhin(int a,String ... args) {
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		}

	public static void main(String[] args) {
		Basic aBasic=new Basic();
		aBasic.shadhin(10,"shadhin","ok");
	}
}
