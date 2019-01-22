package converter;

public class StringToLong {
	public static void main(String[] args) {
		String s="330";
		long ss=Long.valueOf(s).longValue();
		System.out.println(ss);
		String ssString=Long.toString(ss);
		System.out.println(ssString);
		
	}

}
