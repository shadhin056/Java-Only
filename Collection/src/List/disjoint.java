package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class disjoint {

	public static void main(String[] args) {
		String[]a={" ","jahid","paru","paru"," j"};
		List<String> list1=Arrays.asList(a);
		
		ArrayList<String>list2=new ArrayList<String>();
		
		list2.add("ami");
		list2.add("shadhin");
		list2.add("she");
		
	
		boolean check =Collections.disjoint(list1, list2);
		System.out.println("no one is common :"+check);
	}

}
