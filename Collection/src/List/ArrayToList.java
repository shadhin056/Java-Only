package List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String sArray []=new String[] {"ami ","tumi ","she "};
		List <String> l=Arrays.asList(sArray);
		
		System.out.println("as Iterator :");
		Iterator <String> iterator=l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("as for loop");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("as advance loop");
		for (String string : l) {
			System.out.println(string);
		}
		int j=0;
		System.out.println("as while loop");
		while (j<l.size()) {
			System.out.println(l.get(j));
		j++;
		}
	}

}
