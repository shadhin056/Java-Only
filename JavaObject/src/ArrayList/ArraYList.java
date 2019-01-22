package ArrayList;

import java.util.ArrayList;

public class ArraYList {
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		ArrayList<String> obj2 = new ArrayList<String>();
		
		obj.add(12);
		obj.add(13);
		obj.add("e");
		obj.add(12.36);
		//................
		obj2.add("122");
		obj2.add("000132");
		obj2.add("e22");
		obj2.add("12.3615415");
		//................
		System.out.println(obj);
		System.out.println(obj2);
		//................
System.out.println(obj.get(1));

	for(String  s : obj2)
	{
		System.out.println(s);
	}	
		}
}
