package integer;

public class IntToBinaryDecimalHexa {

	public static void main(String[] args) {
		Integer aInteger=Integer.valueOf("11111");
		Integer aInteger2=Integer.valueOf("11111",2);
		Integer aInteger3=Integer.valueOf("D",16);
		Integer aInteger4=Integer.valueOf("7",8);
		
		Integer aInteger5=11;
		System.out.println(Integer.toHexString(aInteger5));
		System.out.println(Integer.toBinaryString(aInteger5));
		
		System.out.println(aInteger);
		System.out.println(aInteger2);
		System.out.println(aInteger3);
		System.out.println(aInteger4);
		
	}

}
