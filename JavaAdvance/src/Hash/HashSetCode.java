package Hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCode {

	public static void main(String[] args) {
		String[]a={"ami","tumi","she","she"};
		List<String> l=Arrays.asList(a);
		System.out.println(l);
		
		Set<String>set=new HashSet<String>(l);
		System.out.println(set);
	}

}
