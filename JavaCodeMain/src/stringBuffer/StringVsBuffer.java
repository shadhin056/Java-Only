package stringBuffer;

public class StringVsBuffer {

	public static void main(String[] args) {
		String s="Dhaka ";
		s.concat("Bangladesh");
		//String c=s.concat("Bangladesh");
		
		System.out.println(s);
		
		StringBuffer obj =new StringBuffer("Dhaka ");
		obj.append("Bangladesh");
		System.out.println(obj);

	}

}
