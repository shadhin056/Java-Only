package stringBuffer;
	
public class SpeedTry {
	public static  void concatwithString()
	{
		String t="Cat";
		for(int i=0;i<10000;i++)
		{
			t=t.concat("Dog");
		}
		//return t;
	}
	public static  void concatwithStringBuffer()
	{
		StringBuffer obj =new StringBuffer("Cat");
		for(int i=0;i<10000;i++)
		{
			obj.append("Dog");
		}
		//return obj.toString();
	}
	public static void  StringWithStringBuilder()
	{
		StringBuilder objj =new StringBuilder("Cat");
		for(int i=0;i<10000;i++)
		{
			objj.append("Dog");
		}
		//return objj.toString();
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






