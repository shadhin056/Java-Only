package List;

import java.util.ArrayList;
import java.util.List;

public class one {

	public static void main(String[] args) {
		String [] a={"ami","tumi","shee"};
		List <String> b = new ArrayList<String>();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		//.............................
		
		for(int i=0;i<a.length;i++)
		{
			b.add(a[i]);
		}
		
		//...........................
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b.get(i));
		}
		
	}

}
