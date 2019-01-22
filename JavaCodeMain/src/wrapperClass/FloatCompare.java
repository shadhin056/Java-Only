package wrapperClass;

public class FloatCompare {

	public static void main(String[] args) {
		Integer intO=new Integer(12);
		Float f1=new Float("12");
		Float f2=new Float("12.5");
		Float f3=new Float(12);
		
		System.out.println("Comparing using f1 and f2 :"+Float.compare(f1, f2));
		System.out.println("Comparing using f1 and f3 :"+Float.compare(f1, f3));
		Float f=intO.floatValue()+f1;
		
		
		System.out.println("Adition of int obj and f1"+f);
		
	}

}
