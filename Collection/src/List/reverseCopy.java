package List;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class reverseCopy {

	public static void main(String[] args) {
		Character[]a={'a','b','c'};
		List<Character>b=Arrays.asList(a);
       System.out.println(b);
       //reverse 
       Collections.reverse(b);
       System.out.println(b);
       //create and copy 
       Character[] n=new Character[3];
       List<Character>lcopy=Arrays.asList(n);
       //Collections.copy(lcopy,b);
       Collections.copy(lcopy,b);
       //fill collection 
       Collections.fill(lcopy,'X');
       System.out.println(lcopy);
	}
	
	
}
