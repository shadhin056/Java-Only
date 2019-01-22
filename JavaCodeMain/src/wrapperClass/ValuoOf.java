package wrapperClass;

public class ValuoOf {

	public static void main(String[] args) {
		Integer a = Integer.valueOf("12345");
		//string
		Integer b = Integer.valueOf("11011",2);
		//binary
		Integer c = Integer.valueOf("3039",16);
		//Hexadecimal
		Integer d = Integer.valueOf("12",8);
		//octal
		System.out.println(a+" "+b+" "+c+" "+d);
		
		
		String  h=Integer.toHexString(a);
		System.out.println(h);
		System.out.println(Integer.toBinaryString(b));
		

	}

}
