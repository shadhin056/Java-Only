package input;
	
public class ALLinOne {
	public static  String concatwithString()
	{
		String t="Cat";
		for(int i=0;i<1000;i++)
		{
			t=t.concat("Dog");
		}
		return t;
	}
	public static  String concatwithStringBuffer()
	{
		StringBuffer obj =new StringBuffer("Cat");
		for(int i=0;i<1000;i++)
		{
			obj.append("Dog");
		}
		return obj.toString();
	}
	public static String  StringWithStringBuilder()
	{
		StringBuilder objj =new StringBuilder("Cat");
		for(int i=0;i<1000;i++)
		{
			objj.append("Dog");
		}
		return objj.toString();
	}
	public static void main(String[] args) {
	
		long start =System.currentTimeMillis();
		concatwithString();
		System.out.println("Concat with String took: "+(System.currentTimeMillis()-start)+"ms");
		start=System.currentTimeMillis();
		concatwithStringBuffer();
		System.out.println("Concat with String Buffer took "+(System.currentTimeMillis()-start)+"ms");
		start=System.currentTimeMillis();
		StringWithStringBuilder();
		System.out.println("Concat with StringBuilder took :"+(System.currentTimeMillis()-start)+"ms");
	
	}
}






