package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class addall {

	public static void main(String[] args) {
		//array to list 
		String[]a={"shadhin","jahid","paru"};
		List<String> list1=Arrays.asList(a);
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("ami");
		list2.add("tumi");
		list2.add("she");
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(list2.get(i));
		}
		Collections.addAll(list2, a);
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i)+"  ");
		}
	}

}
